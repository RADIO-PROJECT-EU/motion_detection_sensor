# Motion Detection Sensor Status Publisher Node
Using rosjava, a custom SensorStatusMsg message is published to alert our robot for human movement.

### Installation Instructions

* Ensure that you already have rosjava and genjava installed (change indigo to your ROS distribution):
    ```
    sudo apt-get install ros-indigo-rosjava* ros-indigo-genjava
    ```
* Clone this repository inside the src folder of your catkin workspace:
    ```
    git clone https://github.com/roboskel/motion_detection_sensor.git
    ```
* Compile the catkin packages
    ```
    cd path/to/my/catkin/workspace/root/directorty
    catkin_make
    ```
* [OPTIONAL] Normally this step should not be necessary, but if you encounter any errors regarding the custom ROS message, try manually converting the MotionStatusMsg for rosjava by running: 
    ```
    cd path/to/my/catkin/workspace/root/directorty 
    genjava_message_artifacts -p motion_detection_sensor_msgs
    ```

### Execution Instructions
You can run the motion_detection_sensor_status_publisher node by running:
```
roslaunch motion_detection_sensor_status_publisher status_publisher.launch 
```



