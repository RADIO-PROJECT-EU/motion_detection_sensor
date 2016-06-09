/* The code below is based on Sensing & Control's code, which can be found
on github: https://github.com/Sensing-Control-DevTeam/
*/

package gr.demokritos.iit.motion_detection_sensor_java.motion_detection_sensor_status_publisher;

import org.ros.concurrent.CancellableLoop;
import org.ros.namespace.GraphName;
import org.ros.node.AbstractNodeMain;
import org.ros.node.ConnectedNode;
import org.ros.node.NodeMain;
import org.ros.node.topic.Publisher;

import net.servicestack.client.JsonServiceClient;
import gr.demokritos.iit.motion_detection_sensor_java.helpers.dto.Authenticate;
import gr.demokritos.iit.motion_detection_sensor_java.helpers.dto.AuthenticateResponse;
import gr.demokritos.iit.motion_detection_sensor_java.helpers.dto.SensorStatuses;
import gr.demokritos.iit.motion_detection_sensor_java.helpers.dto.SensorStatusesResponse;

import motion_detection_sensor_msgs.SensorStatusMsg;

/**
 * A simple {@link Publisher} {@link NodeMain}.
 */
public class MotionDetectionSensorStatusPublisher extends AbstractNodeMain {
    private static String USERNAME = "RTWG2";
    private static String PASSWORD = "raDi2";
    private static String INSTALLATION_ID = "00000000-0000-0000-0000-b827eb3126a9";
    
    private static String BASE_URL;
    private static String MOVEMENT_DETECTION_SENSOR_ID = "77664dc6-0e9d-4861-8db9-fb73090061e6";

    private static JsonServiceClient client;
    private Publisher<SensorStatusMsg> status_publisher;
    private ConnectedNode connectedNode;

    @Override
    public GraphName getDefaultNodeName() {
      return GraphName.of("motion_detection_sensor_status_publisher");
    }

    @Override
    public void onStart(final ConnectedNode connectedN) {
        connectedNode = connectedN;
        
        status_publisher = connectedNode.newPublisher("motion_detection_sensor_status_publisher/status", SensorStatusMsg._TYPE);

        // This CancellableLoop will be canceled automatically when the node shuts down.
        connectedNode.executeCancellableLoop(new CancellableLoop() {

            @Override
            protected void setup() {
              BASE_URL = "http://dev.nassist-test.com/api";
              
              System.out.println("BaseUrl: " + BASE_URL);
              
              Authenticate auth = new Authenticate();
              auth.setUserName(USERNAME);
              auth.setPassword(PASSWORD);

              client = new JsonServiceClient(BASE_URL);
              client.post("/authenticate", auth, AuthenticateResponse.class);
            }

            @Override
            protected void loop() throws InterruptedException {
                
                publishSensorStatus(MOVEMENT_DETECTION_SENSOR_ID);

                Thread.sleep(500);  //let's detect every 500ms
            }
        });
    }

  private void publishSensorStatus(String id){
    try{
      SensorStatuses statusesRequest = new SensorStatuses();
      statusesRequest.setId(id);

      SensorStatusesResponse statusesResponse = client.get(statusesRequest);

      SensorStatusMsg ssm = status_publisher.newMessage();

      ssm.getHeader().setStamp(connectedNode.getCurrentTime());
      ssm.setSensorId(id);
      ssm.setStatus(statusesResponse.Statuses.get(statusesResponse.Statuses.size()-1).Status);
      ssm.setDate(statusesResponse.Statuses.get(statusesResponse.Statuses.size()-1).Date.toString());
      ssm.setTrigger(statusesResponse.Statuses.get(statusesResponse.Statuses.size()-1).Trigger);
      ssm.setTriggerName(statusesResponse.Statuses.get(statusesResponse.Statuses.size()-1).TriggerName);
      
      status_publisher.publish(ssm);
    }
    catch(Exception e){
      System.err.println(e.toString());
    }

    /*
    System.out.println(statusesResponse.Statuses.get(statusesResponse.Statuses.size()-1).Date);
    System.out.println(statusesResponse.Statuses.get(statusesResponse.Statuses.size()-1).Status);
    System.out.println(statusesResponse.Statuses.get(statusesResponse.Statuses.size()-1).Trigger);
    System.out.println(statusesResponse.Statuses.get(statusesResponse.Statuses.size()-1).TriggerName);
    System.out.println("---------------");
    */

  }

}
