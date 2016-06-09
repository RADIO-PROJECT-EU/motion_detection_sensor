/* The code below is based on Sensing & Control's code, which can be found
on github: https://github.com/Sensing-Control-DevTeam/
*/

package gr.demokritos.iit.motion_detection_sensor_java.helpers;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import net.servicestack.client.ApiMember;
import net.servicestack.client.DataContract;
import net.servicestack.client.DataMember;
import net.servicestack.client.IReturn;
import net.servicestack.client.Ignore;
import net.servicestack.client.ResponseStatus;
import net.servicestack.client.Route;

public class dto
{
    @Route(Path="/installations/{Id}/securityStatus", Verbs="PUT")
    // @Route(Path="/installations/{Id}/securityStatus", Verbs="GET")
    public static class InstallationSecurityStatus implements IReturn<InstallationSecurityStatusResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        public String SecurityStatus = null;
        public Date Date = null;
        public String Trigger = null;

        public String getId() { return Id; }
        public InstallationSecurityStatus setId(String value) { this.Id = value; return this; }
        public String getSecurityStatus() { return SecurityStatus; }
        public InstallationSecurityStatus setSecurityStatus(String value) { this.SecurityStatus = value; return this; }
        public Date getDate() { return Date; }
        public InstallationSecurityStatus setDate(Date value) { this.Date = value; return this; }
        public String getTrigger() { return Trigger; }
        public InstallationSecurityStatus setTrigger(String value) { this.Trigger = value; return this; }
        private static Object responseType = InstallationSecurityStatusResponse.class;
        public Object getResponseType() { return responseType; }
    }


    @Route(Path="/installations/{Id}/sensors/area", Verbs="GET")
    public static class InstallationSensorsWithAreaIdAndName implements IReturn<InstallationSensorsWithAreaIdAndNameResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true)
        public String Id = null;

        @ApiMember(Name="Protocol", Description="Protocol name", ParameterType="query", DataType="SensorProtocolType?")
        public SensorProtocolType Protocol = null;

        public String getId() { return Id; }
        public InstallationSensorsWithAreaIdAndName setId(String value) { this.Id = value; return this; }
        public SensorProtocolType getProtocol() { return Protocol; }
        public InstallationSensorsWithAreaIdAndName setProtocol(SensorProtocolType value) { this.Protocol = value; return this; }
        private static Object responseType = InstallationSensorsWithAreaIdAndNameResponse.class;
        public Object getResponseType() { return responseType; }
    }



    @Route(Path="/installations/{Id}/sensors/actuable", Verbs="GET")
    public static class InstallationSensorsActuable implements IReturn<InstallationSensorsActuableResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public InstallationSensorsActuable setId(String value) { this.Id = value; return this; }
        private static Object responseType = InstallationSensorsActuableResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/sensors/security", Verbs="GET")
    public static class InstallationSensorsSecurity implements IReturn<InstallationSensorsSecurityResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public InstallationSensorsSecurity setId(String value) { this.Id = value; return this; }
        private static Object responseType = InstallationSensorsSecurityResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/sensors/comfort", Verbs="GET")
    public static class InstallationSensorsComfort implements IReturn<InstallationSensorsComfortResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public InstallationSensorsComfort setId(String value) { this.Id = value; return this; }
        private static Object responseType = InstallationSensorsComfortResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/toggle", Verbs="POST")
    public static class SensorPowerToggle implements IReturn<SensorPowerToggleResponse>
    {
        @ApiMember(Name="Id", Description="SensorId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        public String Value = null;
        public String InstallationId = null;

        public String getId() { return Id; }
        public SensorPowerToggle setId(String value) { this.Id = value; return this; }
        public String getValue() { return Value; }
        public SensorPowerToggle setValue(String value) { this.Value = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public SensorPowerToggle setInstallationId(String value) { this.InstallationId = value; return this; }
        private static Object responseType = SensorPowerToggleResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/dimmable", Verbs="POST")
    public static class SensorDimmable implements IReturn<SensorDimmableResponse>
    {
        @ApiMember(Name="Id", Description="SensorId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        public Double Value = null;
        public String InstallationId = null;

        public String getId() { return Id; }
        public SensorDimmable setId(String value) { this.Id = value; return this; }
        public Double getValue() { return Value; }
        public SensorDimmable setValue(Double value) { this.Value = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public SensorDimmable setInstallationId(String value) { this.InstallationId = value; return this; }
        private static Object responseType = SensorDimmableResponse.class;
        public Object getResponseType() { return responseType; }
    }





    @Route(Path="/thermostats/{Id}/update/setpoint", Verbs="PATCH")
    public static class SensorThermostatSetPoint implements IReturn<SensorThermostatSetPointResponse>
    {
        @ApiMember(Name="Id", Description="SensorId", ParameterType="path", DataType="string", IsRequired=true, Verb="PATCH", ExcludeInSchema=true)
        public String Id = null;

        public Double SetPoint = null;
        public Boolean IsCelsius = null;
        public String InstallationId = null;

        public String getId() { return Id; }
        public SensorThermostatSetPoint setId(String value) { this.Id = value; return this; }
        public Double getSetPoint() { return SetPoint; }
        public SensorThermostatSetPoint setSetPoint(Double value) { this.SetPoint = value; return this; }
        public Boolean getIsCelsius() { return IsCelsius; }
        public SensorThermostatSetPoint setIsCelsius(Boolean value) { this.IsCelsius = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public SensorThermostatSetPoint setInstallationId(String value) { this.InstallationId = value; return this; }
        private static Object responseType = SensorThermostatSetPointResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/thermostats/{Id}/update/mode", Verbs="PATCH")
    public static class SensorThermostatUpdateMode implements IReturn<SensorThermostatUpdateModeResponse>
    {
        @ApiMember(Name="Id", Description="SensorId", ParameterType="path", DataType="string", IsRequired=true, Verb="PATCH", ExcludeInSchema=true)
        public String Id = null;

        public String InstallationId = null;
        public SensorThermostatMode Mode = null;

        public String getId() { return Id; }
        public SensorThermostatUpdateMode setId(String value) { this.Id = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public SensorThermostatUpdateMode setInstallationId(String value) { this.InstallationId = value; return this; }
        public SensorThermostatMode getMode() { return Mode; }
        public SensorThermostatUpdateMode setMode(SensorThermostatMode value) { this.Mode = value; return this; }
        private static Object responseType = SensorThermostatUpdateModeResponse.class;
        public Object getResponseType() { return responseType; }
    }


    @Route(Path="/thermostats/{Id}/update/fanmode", Verbs="PATCH")
    public static class SensorThermostatUpdateFanMode implements IReturn<SensorThermostatUpdateFanModeResponse>
    {
        @ApiMember(Name="Id", Description="SensorId", ParameterType="path", DataType="string", IsRequired=true, Verb="PATCH", ExcludeInSchema=true)
        public String Id = null;

        public String InstallationId = null;
        public SensorThermostatFanMode FanMode = null;

        public String getId() { return Id; }
        public SensorThermostatUpdateFanMode setId(String value) { this.Id = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public SensorThermostatUpdateFanMode setInstallationId(String value) { this.InstallationId = value; return this; }
        public SensorThermostatFanMode getFanMode() { return FanMode; }
        public SensorThermostatUpdateFanMode setFanMode(SensorThermostatFanMode value) { this.FanMode = value; return this; }
        private static Object responseType = SensorThermostatUpdateFanModeResponse.class;
        public Object getResponseType() { return responseType; }
    }


    @Route("/auth")
    // @Route("/auth/{provider}")
    // @Route("/authenticate")
    // @Route("/authenticate/{provider}")
    @DataContract
    public static class Authenticate implements IReturn<AuthenticateResponse>
    {
        @DataMember(Order=1)
        public String provider = null;

        @DataMember(Order=2)
        public String State = null;

        @DataMember(Order=3)
        public String oauth_token = null;

        @DataMember(Order=4)
        public String oauth_verifier = null;

        @DataMember(Order=5)
        public String UserName = null;

        @DataMember(Order=6)
        public String Password = null;

        @DataMember(Order=7)
        public Boolean RememberMe = null;

        @DataMember(Order=8)
        public String Continue = null;

        @DataMember(Order=9)
        public String nonce = null;

        @DataMember(Order=10)
        public String uri = null;

        @DataMember(Order=11)
        public String response = null;

        @DataMember(Order=12)
        public String qop = null;

        @DataMember(Order=13)
        public String nc = null;

        @DataMember(Order=14)
        public String cnonce = null;

        @DataMember(Order=15)
        public HashMap<String,String> Meta = null;

        public String getProvider() { return provider; }
        public Authenticate setProvider(String value) { this.provider = value; return this; }
        public String getState() { return State; }
        public Authenticate setState(String value) { this.State = value; return this; }
        public String getOauthToken() { return oauth_token; }
        public Authenticate setOauthToken(String value) { this.oauth_token = value; return this; }
        public String getOauthVerifier() { return oauth_verifier; }
        public Authenticate setOauthVerifier(String value) { this.oauth_verifier = value; return this; }
        public String getUserName() { return UserName; }
        public Authenticate setUserName(String value) { this.UserName = value; return this; }
        public String getPassword() { return Password; }
        public Authenticate setPassword(String value) { this.Password = value; return this; }
        public Boolean isRememberMe() { return RememberMe; }
        public Authenticate setRememberMe(Boolean value) { this.RememberMe = value; return this; }
        public String getContinue() { return Continue; }
        public Authenticate setContinue(String value) { this.Continue = value; return this; }
        public String getNonce() { return nonce; }
        public Authenticate setNonce(String value) { this.nonce = value; return this; }
        public String getUri() { return uri; }
        public Authenticate setUri(String value) { this.uri = value; return this; }
        public String getResponse() { return response; }
        public Authenticate setResponse(String value) { this.response = value; return this; }
        public String getQop() { return qop; }
        public Authenticate setQop(String value) { this.qop = value; return this; }
        public String getNc() { return nc; }
        public Authenticate setNc(String value) { this.nc = value; return this; }
        public String getCnonce() { return cnonce; }
        public Authenticate setCnonce(String value) { this.cnonce = value; return this; }
        public HashMap<String,String> getMeta() { return Meta; }
        public Authenticate setMeta(HashMap<String,String> value) { this.Meta = value; return this; }
        private static Object responseType = AuthenticateResponse.class;
        public Object getResponseType() { return responseType; }
    }


    public static class StatusPoint
    {
        public String Status = null;
        public Date Date = null;
        public String Trigger = null;
        public String TriggerName = null;
        
        public String getStatus() { return Status; }
        public StatusPoint setStatus(String value) { this.Status = value; return this; }
        public Date getDate() { return Date; }
        public StatusPoint setDate(Date value) { this.Date = value; return this; }
        public String getTrigger() { return Trigger; }
        public StatusPoint setTrigger(String value) { this.Trigger = value; return this; }
        public String getTriggerName() { return TriggerName; }
        public StatusPoint setTriggerName(String value) { this.TriggerName = value; return this; }
    }



    public static class InstallationSecurityStatusResponse extends ResponseBase
    {
        public String SecurityStatus = null;

        public String getSecurityStatus() { return SecurityStatus; }
        public InstallationSecurityStatusResponse setSecurityStatus(String value) { this.SecurityStatus = value; return this; }
    }


    public static class InstallationGatewaySecurityStatusResponse extends ResponseBase
    {

    }
    

    public static class SensorStatusesResponse extends ResponseBase
    {
        public ArrayList<StatusPoint> Statuses = null;
        
        public ArrayList<StatusPoint> getStatuses() { return Statuses; }
        public SensorStatusesResponse setStatuses(ArrayList<StatusPoint> value) { this.Statuses = value; return this; }
    }

@Route(Path="/sensors/{Id}/statuses", Verbs="GET")
    // @Route(Path="/sensors/{Id}/statuses", Verbs="POST")
    // @Route(Path="/sensors/{Id}/statuses/{TimeStamp}", Verbs="PUT")
    // @Route(Path="/sensors/{Id}/statuses/{TimeStamp}", Verbs="DELETE")
    public static class SensorStatuses implements IReturn<SensorStatusesResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        @ApiMember(Name="FromDate", Description="FromDate", ParameterType="query", DataType="string", Verb="GET")
        public String FromDate = null;

        @ApiMember(Name="ToDate", Description="ToDate", ParameterType="query", DataType="string", Verb="GET")
        public String ToDate = null;

        @ApiMember(Name="PageNumber", Description="Pagination parameter page number", ParameterType="query", DataType="int", Verb="GET")
        public Integer PageNumber = null;

        @ApiMember(Name="PageSize", Description="Pagination parameter page size", ParameterType="query", DataType="int", Verb="GET")
        public Integer PageSize = null;

        @ApiMember(Name="StatusPoints", Description="Collection of statuses to insert", ParameterType="body", DataType="List<StatusPoint>", IsRequired=true, Verb="POST")
        public ArrayList<StatusPoint> StatusPoints = null;

        @ApiMember(Name="TimeStamp", Description="Sensor status timestamp", ParameterType="query", DataType="Date", IsRequired=true, Verb="PUT")
        // @ApiMember(Name="TimeStamp", Description="Sensor status timestamp", ParameterType="query", DataType="Date", IsRequired=true, Verb="DELETE")
        public Date TimeStamp = null;

        @ApiMember(Name="Status", Description="Sensor status", ParameterType="body", DataType="string", IsRequired=true, Verb="PUT")
        public String Status = null;
        
        public String getId() { return Id; }
        public SensorStatuses setId(String value) { this.Id = value; return this; }
        public String getFromDate() { return FromDate; }
        public SensorStatuses setFromDate(String value) { this.FromDate = value; return this; }
        public String getToDate() { return ToDate; }
        public SensorStatuses setToDate(String value) { this.ToDate = value; return this; }
        public Integer getPageNumber() { return PageNumber; }
        public SensorStatuses setPageNumber(Integer value) { this.PageNumber = value; return this; }
        public Integer getPageSize() { return PageSize; }
        public SensorStatuses setPageSize(Integer value) { this.PageSize = value; return this; }
        public ArrayList<StatusPoint> getStatusPoints() { return StatusPoints; }
        public SensorStatuses setStatusPoints(ArrayList<StatusPoint> value) { this.StatusPoints = value; return this; }
        public Date getTimeStamp() { return TimeStamp; }
        public SensorStatuses setTimeStamp(Date value) { this.TimeStamp = value; return this; }
        public String getStatus() { return Status; }
        public SensorStatuses setStatus(String value) { this.Status = value; return this; }
        private static Object responseType = SensorStatusesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    public static class InstallationSensorsWithAreaIdAndNameResponse extends ResponseBase
    {
        public ArrayList<SensorWithAreaIdAndName> Sensors = null;

        public ArrayList<SensorWithAreaIdAndName> getSensors() { return Sensors; }
        public InstallationSensorsWithAreaIdAndNameResponse setSensors(ArrayList<SensorWithAreaIdAndName> value) { this.Sensors = value; return this; }
    }





    public static class InstallationSensorsActuableResponse extends ResponseBase
    {
        public ArrayList<SensorWithAreaName> Sensors = null;

        public ArrayList<SensorWithAreaName> getSensors() { return Sensors; }
        public InstallationSensorsActuableResponse setSensors(ArrayList<SensorWithAreaName> value) { this.Sensors = value; return this; }
    }

    public static class InstallationSensorsSecurityResponse extends ResponseBase
    {
        public ArrayList<SensorWithAreaName> Sensors = null;

        public ArrayList<SensorWithAreaName> getSensors() { return Sensors; }
        public InstallationSensorsSecurityResponse setSensors(ArrayList<SensorWithAreaName> value) { this.Sensors = value; return this; }
    }

    public static class InstallationSensorsComfortResponse extends ResponseBase
    {
        public ArrayList<SensorWithAreaName> Sensors = null;

        public ArrayList<SensorWithAreaName> getSensors() { return Sensors; }
        public InstallationSensorsComfortResponse setSensors(ArrayList<SensorWithAreaName> value) { this.Sensors = value; return this; }
    }



    public static class SensorPowerToggleResponse extends ResponseBase
    {
        public Boolean CommunicationSuccess = null;
        public Boolean ToggleSuccess = null;

        public Boolean isCommunicationSuccess() { return CommunicationSuccess; }
        public SensorPowerToggleResponse setCommunicationSuccess(Boolean value) { this.CommunicationSuccess = value; return this; }
        public Boolean isToggleSuccess() { return ToggleSuccess; }
        public SensorPowerToggleResponse setToggleSuccess(Boolean value) { this.ToggleSuccess = value; return this; }
    }

    public static class SensorDimmableResponse extends ResponseBase
    {
        public Boolean CommunicationSuccess = null;
        public Boolean DimmerSuccess = null;

        public Boolean isCommunicationSuccess() { return CommunicationSuccess; }
        public SensorDimmableResponse setCommunicationSuccess(Boolean value) { this.CommunicationSuccess = value; return this; }
        public Boolean isDimmerSuccess() { return DimmerSuccess; }
        public SensorDimmableResponse setDimmerSuccess(Boolean value) { this.DimmerSuccess = value; return this; }
    }


    public static class SensorDoorLockToggleResponse extends ResponseBase
    {
        public Boolean CommunicationSuccess = null;
        public Boolean ToggleSuccess = null;

        public Boolean isCommunicationSuccess() { return CommunicationSuccess; }
        public SensorDoorLockToggleResponse setCommunicationSuccess(Boolean value) { this.CommunicationSuccess = value; return this; }
        public Boolean isToggleSuccess() { return ToggleSuccess; }
        public SensorDoorLockToggleResponse setToggleSuccess(Boolean value) { this.ToggleSuccess = value; return this; }
    }



    public static class SensorThermostatSetPointResponse extends ResponseBase
    {
        public Boolean SetPointSuccess = null;

        public Boolean isSetPointSuccess() { return SetPointSuccess; }
        public SensorThermostatSetPointResponse setSetPointSuccess(Boolean value) { this.SetPointSuccess = value; return this; }
    }

    public static class SensorThermostatUpdateModeResponse extends ResponseBase
    {
        public Boolean ModeSuccess = null;

        public Boolean isModeSuccess() { return ModeSuccess; }
        public SensorThermostatUpdateModeResponse setModeSuccess(Boolean value) { this.ModeSuccess = value; return this; }
    }




    public static class SensorThermostatUpdateFanModeResponse extends ResponseBase
    {
        public Boolean FanModeSuccess = null;

        public Boolean isFanModeSuccess() { return FanModeSuccess; }
        public SensorThermostatUpdateFanModeResponse setFanModeSuccess(Boolean value) { this.FanModeSuccess = value; return this; }
    }


    @DataContract
    public static class AuthenticateResponse
    {
        @DataMember(Order=1)
        public String UserId = null;

        @DataMember(Order=2)
        public String SessionId = null;

        @DataMember(Order=3)
        public String UserName = null;

        @DataMember(Order=4)
        public String DisplayName = null;

        @DataMember(Order=5)
        public String ReferrerUrl = null;

        @DataMember(Order=6)
        public ResponseStatus ResponseStatus = null;

        @DataMember(Order=7)
        public HashMap<String,String> Meta = null;

        public String getUserId() { return UserId; }
        public AuthenticateResponse setUserId(String value) { this.UserId = value; return this; }
        public String getSessionId() { return SessionId; }
        public AuthenticateResponse setSessionId(String value) { this.SessionId = value; return this; }
        public String getUserName() { return UserName; }
        public AuthenticateResponse setUserName(String value) { this.UserName = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public AuthenticateResponse setDisplayName(String value) { this.DisplayName = value; return this; }
        public String getReferrerUrl() { return ReferrerUrl; }
        public AuthenticateResponse setReferrerUrl(String value) { this.ReferrerUrl = value; return this; }
        public ResponseStatus getResponseStatus() { return ResponseStatus; }
        public AuthenticateResponse setResponseStatus(ResponseStatus value) { this.ResponseStatus = value; return this; }
        public HashMap<String,String> getMeta() { return Meta; }
        public AuthenticateResponse setMeta(HashMap<String,String> value) { this.Meta = value; return this; }
    }



    public static class ResponseBase
    {
        public ResponseStatus ResponseStatus = null;

        public ResponseStatus getResponseStatus() { return ResponseStatus; }
        public ResponseBase setResponseStatus(ResponseStatus value) { this.ResponseStatus = value; return this; }
    }



    public static class UserAuth
    {
        public Integer Id = null;
        public String UserName = null;
        public String Email = null;
        public String PrimaryEmail = null;
        public String FirstName = null;
        public String LastName = null;
        public String DisplayName = null;
        public String Country = null;
        public String Culture = null;
        public String FullName = null;
        public String Gender = null;
        public String Language = null;
        public String MailAddress = null;
        public String Nickname = null;
        public String PostalCode = null;
        public String TimeZone = null;
        public Date CreatedDate = null;
        public Date ModifiedDate = null;
        public ArrayList<String> Roles = null;
        public ArrayList<String> Permissions = null;
        public Integer RefId = null;
        public String RefIdStr = null;
        public String PhoneNumber = null;
        public String Company = null;
        public String Address = null;
        public String Address2 = null;
        public String City = null;
        public String State = null;
        public Integer InvalidLoginAttempts = null;
        public Date LastLoginAttempt = null;
        public Date LockedDate = null;
        public String RecoveryToken = null;
        public HashMap<String,String> Meta = null;

        public Integer getId() { return Id; }
        public UserAuth setId(Integer value) { this.Id = value; return this; }
        public String getUserName() { return UserName; }
        public UserAuth setUserName(String value) { this.UserName = value; return this; }
        public String getEmail() { return Email; }
        public UserAuth setEmail(String value) { this.Email = value; return this; }
        public String getPrimaryEmail() { return PrimaryEmail; }
        public UserAuth setPrimaryEmail(String value) { this.PrimaryEmail = value; return this; }
        public String getFirstName() { return FirstName; }
        public UserAuth setFirstName(String value) { this.FirstName = value; return this; }
        public String getLastName() { return LastName; }
        public UserAuth setLastName(String value) { this.LastName = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public UserAuth setDisplayName(String value) { this.DisplayName = value; return this; }
        public String getCountry() { return Country; }
        public UserAuth setCountry(String value) { this.Country = value; return this; }
        public String getCulture() { return Culture; }
        public UserAuth setCulture(String value) { this.Culture = value; return this; }
        public String getFullName() { return FullName; }
        public UserAuth setFullName(String value) { this.FullName = value; return this; }
        public String getGender() { return Gender; }
        public UserAuth setGender(String value) { this.Gender = value; return this; }
        public String getLanguage() { return Language; }
        public UserAuth setLanguage(String value) { this.Language = value; return this; }
        public String getMailAddress() { return MailAddress; }
        public UserAuth setMailAddress(String value) { this.MailAddress = value; return this; }
        public String getNickname() { return Nickname; }
        public UserAuth setNickname(String value) { this.Nickname = value; return this; }
        public String getPostalCode() { return PostalCode; }
        public UserAuth setPostalCode(String value) { this.PostalCode = value; return this; }
        public String getTimeZone() { return TimeZone; }
        public UserAuth setTimeZone(String value) { this.TimeZone = value; return this; }
        public Date getCreatedDate() { return CreatedDate; }
        public UserAuth setCreatedDate(Date value) { this.CreatedDate = value; return this; }
        public Date getModifiedDate() { return ModifiedDate; }
        public UserAuth setModifiedDate(Date value) { this.ModifiedDate = value; return this; }
        public ArrayList<String> getRoles() { return Roles; }
        public UserAuth setRoles(ArrayList<String> value) { this.Roles = value; return this; }
        public ArrayList<String> getPermissions() { return Permissions; }
        public UserAuth setPermissions(ArrayList<String> value) { this.Permissions = value; return this; }
        public Integer getRefId() { return RefId; }
        public UserAuth setRefId(Integer value) { this.RefId = value; return this; }
        public String getRefIdStr() { return RefIdStr; }
        public UserAuth setRefIdStr(String value) { this.RefIdStr = value; return this; }
        public String getPhoneNumber() { return PhoneNumber; }
        public UserAuth setPhoneNumber(String value) { this.PhoneNumber = value; return this; }
        public String getCompany() { return Company; }
        public UserAuth setCompany(String value) { this.Company = value; return this; }
        public String getAddress() { return Address; }
        public UserAuth setAddress(String value) { this.Address = value; return this; }
        public String getAddress2() { return Address2; }
        public UserAuth setAddress2(String value) { this.Address2 = value; return this; }
        public String getCity() { return City; }
        public UserAuth setCity(String value) { this.City = value; return this; }
        public String getState() { return State; }
        public UserAuth setState(String value) { this.State = value; return this; }
        public Integer getInvalidLoginAttempts() { return InvalidLoginAttempts; }
        public UserAuth setInvalidLoginAttempts(Integer value) { this.InvalidLoginAttempts = value; return this; }
        public Date getLastLoginAttempt() { return LastLoginAttempt; }
        public UserAuth setLastLoginAttempt(Date value) { this.LastLoginAttempt = value; return this; }
        public Date getLockedDate() { return LockedDate; }
        public UserAuth setLockedDate(Date value) { this.LockedDate = value; return this; }
        public String getRecoveryToken() { return RecoveryToken; }
        public UserAuth setRecoveryToken(String value) { this.RecoveryToken = value; return this; }
        public HashMap<String,String> getMeta() { return Meta; }
        public UserAuth setMeta(HashMap<String,String> value) { this.Meta = value; return this; }
    }


    public static class ZWaveRegister
    {
        public Integer ParamId = null;
        public Integer Length = null;
        public Integer Value = null;

        public Integer getParamId() { return ParamId; }
        public ZWaveRegister setParamId(Integer value) { this.ParamId = value; return this; }
        public Integer getLength() { return Length; }
        public ZWaveRegister setLength(Integer value) { this.Length = value; return this; }
        public Integer getValue() { return Value; }
        public ZWaveRegister setValue(Integer value) { this.Value = value; return this; }
    }

    public static enum SensorThermostatMode
    {
        Off(0),
        Heat(1),
        Cool(2),
        Fan(6),
        Dry(8),
        Auto(10);

        private final int value;
        SensorThermostatMode(final int intValue) { value = intValue; }
        public int getValue() { return value; }
    }

    public static class SensorConfiguration
    {
        public HashMap<String,Object> Properties = null;
        public HashMap<String,Object> EditableProperties = null;

        public HashMap<String,Object> getProperties() { return Properties; }
        public SensorConfiguration setProperties(HashMap<String,Object> value) { this.Properties = value; return this; }
        public HashMap<String,Object> getEditableProperties() { return EditableProperties; }
        public SensorConfiguration setEditableProperties(HashMap<String,Object> value) { this.EditableProperties = value; return this; }
    }

    public static enum SensorThermostatFanMode
    {
        Auto,
        On,
        Autohigh,
        Onhigh;
    }


    public static class Installation extends InstallationBase
    {
        public String Status = null;
        public String SecurityStatus = null;
        public Date LastDateStatus = null;
        public Date LastModificationDate = null;
        public Date LastDateAverageCalculations = null;
        public Date LastAliveDate = null;
        public Double AverageTemperature = null;
        public Double AverageHumidity = null;
        public Double AverageAirQuality = null;
        public String DayEnergyTrendCode = null;
        public String WeekEnergyTrendCode = null;
        public String MonthEnergyTrendCode = null;
        public String DayGasTrendCode = null;
        public String WeekGasTrendCode = null;
        public String MonthGasTrendCode = null;
        public String DayHeatingTrendCode = null;
        public String WeekHeatingTrendCode = null;
        public String MonthHeatingTrendCode = null;
        public String DayWaterTrendCode = null;
        public String WeekWaterTrendCode = null;
        public String MonthWaterTrendCode = null;
        public Double DayEnergyTrendValue = null;
        public Double WeekEnergyTrendValue = null;
        public Double MonthEnergyTrendValue = null;
        public Double DayGasTrendValue = null;
        public Double WeekGasTrendValue = null;
        public Double MonthGasTrendValue = null;
        public Double DayHeatingTrendValue = null;
        public Double WeekHeatingTrendValue = null;
        public Double MonthHeatingTrendValue = null;
        public Double DayWaterTrendValue = null;
        public Double WeekWaterTrendValue = null;
        public Double MonthWaterTrendValue = null;
        public Date LastDateEnergyTrend = null;
        public Date LastDateGasTrend = null;
        public Date LastDateHeatingTrend = null;
        public Date LastDateWaterTrend = null;
        public String ComfortStatus = null;
        public Double Uptime = null;
        public Integer ActiveSchedulesComfort = null;
        public Integer ActiveSchedulesSecurity = null;
        public Integer ActiveSchedulesControl = null;
        public Date LastLogUploadDate = null;
        public String LastLogName = null;

        public String getStatus() { return Status; }
        public Installation setStatus(String value) { this.Status = value; return this; }
        public String getSecurityStatus() { return SecurityStatus; }
        public Installation setSecurityStatus(String value) { this.SecurityStatus = value; return this; }
        public Date getLastDateStatus() { return LastDateStatus; }
        public Installation setLastDateStatus(Date value) { this.LastDateStatus = value; return this; }
        public Date getLastModificationDate() { return LastModificationDate; }
        public Installation setLastModificationDate(Date value) { this.LastModificationDate = value; return this; }
        public Date getLastDateAverageCalculations() { return LastDateAverageCalculations; }
        public Installation setLastDateAverageCalculations(Date value) { this.LastDateAverageCalculations = value; return this; }
        public Date getLastAliveDate() { return LastAliveDate; }
        public Installation setLastAliveDate(Date value) { this.LastAliveDate = value; return this; }
        public Double getAverageTemperature() { return AverageTemperature; }
        public Installation setAverageTemperature(Double value) { this.AverageTemperature = value; return this; }
        public Double getAverageHumidity() { return AverageHumidity; }
        public Installation setAverageHumidity(Double value) { this.AverageHumidity = value; return this; }
        public Double getAverageAirQuality() { return AverageAirQuality; }
        public Installation setAverageAirQuality(Double value) { this.AverageAirQuality = value; return this; }
        public String getDayEnergyTrendCode() { return DayEnergyTrendCode; }
        public Installation setDayEnergyTrendCode(String value) { this.DayEnergyTrendCode = value; return this; }
        public String getWeekEnergyTrendCode() { return WeekEnergyTrendCode; }
        public Installation setWeekEnergyTrendCode(String value) { this.WeekEnergyTrendCode = value; return this; }
        public String getMonthEnergyTrendCode() { return MonthEnergyTrendCode; }
        public Installation setMonthEnergyTrendCode(String value) { this.MonthEnergyTrendCode = value; return this; }
        public String getDayGasTrendCode() { return DayGasTrendCode; }
        public Installation setDayGasTrendCode(String value) { this.DayGasTrendCode = value; return this; }
        public String getWeekGasTrendCode() { return WeekGasTrendCode; }
        public Installation setWeekGasTrendCode(String value) { this.WeekGasTrendCode = value; return this; }
        public String getMonthGasTrendCode() { return MonthGasTrendCode; }
        public Installation setMonthGasTrendCode(String value) { this.MonthGasTrendCode = value; return this; }
        public String getDayHeatingTrendCode() { return DayHeatingTrendCode; }
        public Installation setDayHeatingTrendCode(String value) { this.DayHeatingTrendCode = value; return this; }
        public String getWeekHeatingTrendCode() { return WeekHeatingTrendCode; }
        public Installation setWeekHeatingTrendCode(String value) { this.WeekHeatingTrendCode = value; return this; }
        public String getMonthHeatingTrendCode() { return MonthHeatingTrendCode; }
        public Installation setMonthHeatingTrendCode(String value) { this.MonthHeatingTrendCode = value; return this; }
        public String getDayWaterTrendCode() { return DayWaterTrendCode; }
        public Installation setDayWaterTrendCode(String value) { this.DayWaterTrendCode = value; return this; }
        public String getWeekWaterTrendCode() { return WeekWaterTrendCode; }
        public Installation setWeekWaterTrendCode(String value) { this.WeekWaterTrendCode = value; return this; }
        public String getMonthWaterTrendCode() { return MonthWaterTrendCode; }
        public Installation setMonthWaterTrendCode(String value) { this.MonthWaterTrendCode = value; return this; }
        public Double getDayEnergyTrendValue() { return DayEnergyTrendValue; }
        public Installation setDayEnergyTrendValue(Double value) { this.DayEnergyTrendValue = value; return this; }
        public Double getWeekEnergyTrendValue() { return WeekEnergyTrendValue; }
        public Installation setWeekEnergyTrendValue(Double value) { this.WeekEnergyTrendValue = value; return this; }
        public Double getMonthEnergyTrendValue() { return MonthEnergyTrendValue; }
        public Installation setMonthEnergyTrendValue(Double value) { this.MonthEnergyTrendValue = value; return this; }
        public Double getDayGasTrendValue() { return DayGasTrendValue; }
        public Installation setDayGasTrendValue(Double value) { this.DayGasTrendValue = value; return this; }
        public Double getWeekGasTrendValue() { return WeekGasTrendValue; }
        public Installation setWeekGasTrendValue(Double value) { this.WeekGasTrendValue = value; return this; }
        public Double getMonthGasTrendValue() { return MonthGasTrendValue; }
        public Installation setMonthGasTrendValue(Double value) { this.MonthGasTrendValue = value; return this; }
        public Double getDayHeatingTrendValue() { return DayHeatingTrendValue; }
        public Installation setDayHeatingTrendValue(Double value) { this.DayHeatingTrendValue = value; return this; }
        public Double getWeekHeatingTrendValue() { return WeekHeatingTrendValue; }
        public Installation setWeekHeatingTrendValue(Double value) { this.WeekHeatingTrendValue = value; return this; }
        public Double getMonthHeatingTrendValue() { return MonthHeatingTrendValue; }
        public Installation setMonthHeatingTrendValue(Double value) { this.MonthHeatingTrendValue = value; return this; }
        public Double getDayWaterTrendValue() { return DayWaterTrendValue; }
        public Installation setDayWaterTrendValue(Double value) { this.DayWaterTrendValue = value; return this; }
        public Double getWeekWaterTrendValue() { return WeekWaterTrendValue; }
        public Installation setWeekWaterTrendValue(Double value) { this.WeekWaterTrendValue = value; return this; }
        public Double getMonthWaterTrendValue() { return MonthWaterTrendValue; }
        public Installation setMonthWaterTrendValue(Double value) { this.MonthWaterTrendValue = value; return this; }
        public Date getLastDateEnergyTrend() { return LastDateEnergyTrend; }
        public Installation setLastDateEnergyTrend(Date value) { this.LastDateEnergyTrend = value; return this; }
        public Date getLastDateGasTrend() { return LastDateGasTrend; }
        public Installation setLastDateGasTrend(Date value) { this.LastDateGasTrend = value; return this; }
        public Date getLastDateHeatingTrend() { return LastDateHeatingTrend; }
        public Installation setLastDateHeatingTrend(Date value) { this.LastDateHeatingTrend = value; return this; }
        public Date getLastDateWaterTrend() { return LastDateWaterTrend; }
        public Installation setLastDateWaterTrend(Date value) { this.LastDateWaterTrend = value; return this; }
        public String getComfortStatus() { return ComfortStatus; }
        public Installation setComfortStatus(String value) { this.ComfortStatus = value; return this; }
        public Double getUptime() { return Uptime; }
        public Installation setUptime(Double value) { this.Uptime = value; return this; }
        public Integer getActiveSchedulesComfort() { return ActiveSchedulesComfort; }
        public Installation setActiveSchedulesComfort(Integer value) { this.ActiveSchedulesComfort = value; return this; }
        public Integer getActiveSchedulesSecurity() { return ActiveSchedulesSecurity; }
        public Installation setActiveSchedulesSecurity(Integer value) { this.ActiveSchedulesSecurity = value; return this; }
        public Integer getActiveSchedulesControl() { return ActiveSchedulesControl; }
        public Installation setActiveSchedulesControl(Integer value) { this.ActiveSchedulesControl = value; return this; }
        public Date getLastLogUploadDate() { return LastLogUploadDate; }
        public Installation setLastLogUploadDate(Date value) { this.LastLogUploadDate = value; return this; }
        public String getLastLogName() { return LastLogName; }
        public Installation setLastLogName(String value) { this.LastLogName = value; return this; }
    }







    public static class SensorBase
    {
        public String Id = null;
        public String ParentId = null;
        public String Protocol = null;
        public String Name = null;
        public String Type = null;
        public String Manufacturer = null;
        public String ManufacturerType = null;
        public String ManufacturerTypeId = null;
        public String ManufacturerTypeName = null;
        public String FirmwareVersion = null;
        public String ManufacturerName = null;
        public String ManufacturerDeviceName = null;
        public String Description = null;
        public String Remarks = null;
        public String ConsumptionCategory = null;
        public Date CreationDate = null;

        public String getId() { return Id; }
        public SensorBase setId(String value) { this.Id = value; return this; }
        public String getParentId() { return ParentId; }
        public SensorBase setParentId(String value) { this.ParentId = value; return this; }
        public String getProtocol() { return Protocol; }
        public SensorBase setProtocol(String value) { this.Protocol = value; return this; }
        public String getName() { return Name; }
        public SensorBase setName(String value) { this.Name = value; return this; }
        public String getType() { return Type; }
        public SensorBase setType(String value) { this.Type = value; return this; }
        public String getManufacturer() { return Manufacturer; }
        public SensorBase setManufacturer(String value) { this.Manufacturer = value; return this; }
        public String getManufacturerType() { return ManufacturerType; }
        public SensorBase setManufacturerType(String value) { this.ManufacturerType = value; return this; }
        public String getManufacturerTypeId() { return ManufacturerTypeId; }
        public SensorBase setManufacturerTypeId(String value) { this.ManufacturerTypeId = value; return this; }
        public String getManufacturerTypeName() { return ManufacturerTypeName; }
        public SensorBase setManufacturerTypeName(String value) { this.ManufacturerTypeName = value; return this; }
        public String getFirmwareVersion() { return FirmwareVersion; }
        public SensorBase setFirmwareVersion(String value) { this.FirmwareVersion = value; return this; }
        public String getManufacturerName() { return ManufacturerName; }
        public SensorBase setManufacturerName(String value) { this.ManufacturerName = value; return this; }
        public String getManufacturerDeviceName() { return ManufacturerDeviceName; }
        public SensorBase setManufacturerDeviceName(String value) { this.ManufacturerDeviceName = value; return this; }
        public String getDescription() { return Description; }
        public SensorBase setDescription(String value) { this.Description = value; return this; }
        public String getRemarks() { return Remarks; }
        public SensorBase setRemarks(String value) { this.Remarks = value; return this; }
        public String getConsumptionCategory() { return ConsumptionCategory; }
        public SensorBase setConsumptionCategory(String value) { this.ConsumptionCategory = value; return this; }
        public Date getCreationDate() { return CreationDate; }
        public SensorBase setCreationDate(Date value) { this.CreationDate = value; return this; }
    }





    public static class Sensor extends SensorBase
    {
        public Double Value = null;
        public String Status = null;
        public String PreviousStatus = null;
        public String Mode = null;
        public String PreviousMode = null;
        public Double SetPoint = null;
        public Double PreviousSetPoint = null;
        public Double BatteryLevel = null;
        public Date LastDateValue = null;
        public Date LastDateStatus = null;
        public Date LastDateMode = null;
        public Date LastDateSetPoint = null;
        public Date LastDateBattery = null;
        public Date LastModificationDate = null;
        public Boolean IsVirtual = null;
        public Boolean IsLocked = null;
        public String Configuration = null;
        @Ignore()
        public SensorConfiguration Config = null;

        public Double getValue() { return Value; }
        public Sensor setValue(Double value) { this.Value = value; return this; }
        public String getStatus() { return Status; }
        public Sensor setStatus(String value) { this.Status = value; return this; }
        public String getPreviousStatus() { return PreviousStatus; }
        public Sensor setPreviousStatus(String value) { this.PreviousStatus = value; return this; }
        public String getMode() { return Mode; }
        public Sensor setMode(String value) { this.Mode = value; return this; }
        public String getPreviousMode() { return PreviousMode; }
        public Sensor setPreviousMode(String value) { this.PreviousMode = value; return this; }
        public Double getSetPoint() { return SetPoint; }
        public Sensor setSetPoint(Double value) { this.SetPoint = value; return this; }
        public Double getPreviousSetPoint() { return PreviousSetPoint; }
        public Sensor setPreviousSetPoint(Double value) { this.PreviousSetPoint = value; return this; }
        public Double getBatteryLevel() { return BatteryLevel; }
        public Sensor setBatteryLevel(Double value) { this.BatteryLevel = value; return this; }
        public Date getLastDateValue() { return LastDateValue; }
        public Sensor setLastDateValue(Date value) { this.LastDateValue = value; return this; }
        public Date getLastDateStatus() { return LastDateStatus; }
        public Sensor setLastDateStatus(Date value) { this.LastDateStatus = value; return this; }
        public Date getLastDateMode() { return LastDateMode; }
        public Sensor setLastDateMode(Date value) { this.LastDateMode = value; return this; }
        public Date getLastDateSetPoint() { return LastDateSetPoint; }
        public Sensor setLastDateSetPoint(Date value) { this.LastDateSetPoint = value; return this; }
        public Date getLastDateBattery() { return LastDateBattery; }
        public Sensor setLastDateBattery(Date value) { this.LastDateBattery = value; return this; }
        public Date getLastModificationDate() { return LastModificationDate; }
        public Sensor setLastModificationDate(Date value) { this.LastModificationDate = value; return this; }
        public Boolean getIsVirtual() { return IsVirtual; }
        public Sensor setIsVirtual(Boolean value) { this.IsVirtual = value; return this; }
        public Boolean getIsLocked() { return IsLocked; }
        public Sensor setIsLocked(Boolean value) { this.IsLocked = value; return this; }
        public String getConfiguration() { return Configuration; }
        public Sensor setConfiguration(String value) { this.Configuration = value; return this; }
        public SensorConfiguration getConfig() { return Config; }
        public Sensor setConfig(SensorConfiguration value) { this.Config = value; return this; }
    }

    public static class SensorBaseWithAreaIDandName extends SensorBase
    {
        public Integer AreaId = null;
        public String AreaName = null;

        public Integer getAreaId() { return AreaId; }
        public SensorBaseWithAreaIDandName setAreaId(Integer value) { this.AreaId = value; return this; }
        public String getAreaName() { return AreaName; }
        public SensorBaseWithAreaIDandName setAreaName(String value) { this.AreaName = value; return this; }
    }

    public static enum SensorProtocolType
    {
        WmBus,
        ZWave;
    }

    public static class SensorWithAreaIdAndName extends Sensor
    {
        public Integer AreaId = null;
        public String AreaName = null;

        public Integer getAreaId() { return AreaId; }
        public SensorWithAreaIdAndName setAreaId(Integer value) { this.AreaId = value; return this; }
        public String getAreaName() { return AreaName; }
        public SensorWithAreaIdAndName setAreaName(String value) { this.AreaName = value; return this; }
    }


    public static class SensorWithAreaName extends Sensor
    {
        public String AreaName = null;

        public String getAreaName() { return AreaName; }
        public SensorWithAreaName setAreaName(String value) { this.AreaName = value; return this; }
    }




    public static class InstallationBase
    {
        public String Id = null;
        public String Type = null;
        public Integer OwnerId = null;
        public String Name = null;
        public Double Latitude = null;
        public Double Longitude = null;
        public Integer City = null;
        public Date CreationDate = null;
        public Double PricekWh = null;
        public Double PricekWhProduction = null;
        public Double PriceGaskWh = null;
        public Double PriceHeatingkWh = null;
        public Double PriceWaterM3 = null;
        public Double GasMeterTokWh = null;
        public String DashboardView = null;
        public Date ActivationDate = null;
        public Boolean Blocked = null;
        public String GWVersion = null;

        public String getId() { return Id; }
        public InstallationBase setId(String value) { this.Id = value; return this; }
        public String getType() { return Type; }
        public InstallationBase setType(String value) { this.Type = value; return this; }
        public Integer getOwnerId() { return OwnerId; }
        public InstallationBase setOwnerId(Integer value) { this.OwnerId = value; return this; }
        public String getName() { return Name; }
        public InstallationBase setName(String value) { this.Name = value; return this; }
        public Double getLatitude() { return Latitude; }
        public InstallationBase setLatitude(Double value) { this.Latitude = value; return this; }
        public Double getLongitude() { return Longitude; }
        public InstallationBase setLongitude(Double value) { this.Longitude = value; return this; }
        public Integer getCity() { return City; }
        public InstallationBase setCity(Integer value) { this.City = value; return this; }
        public Date getCreationDate() { return CreationDate; }
        public InstallationBase setCreationDate(Date value) { this.CreationDate = value; return this; }
        public Double getPricekWh() { return PricekWh; }
        public InstallationBase setPricekWh(Double value) { this.PricekWh = value; return this; }
        public Double getPricekWhProduction() { return PricekWhProduction; }
        public InstallationBase setPricekWhProduction(Double value) { this.PricekWhProduction = value; return this; }
        public Double getPriceGaskWh() { return PriceGaskWh; }
        public InstallationBase setPriceGaskWh(Double value) { this.PriceGaskWh = value; return this; }
        public Double getPriceHeatingkWh() { return PriceHeatingkWh; }
        public InstallationBase setPriceHeatingkWh(Double value) { this.PriceHeatingkWh = value; return this; }
        public Double getPriceWaterM3() { return PriceWaterM3; }
        public InstallationBase setPriceWaterM3(Double value) { this.PriceWaterM3 = value; return this; }
        public Double getGasMeterTokWh() { return GasMeterTokWh; }
        public InstallationBase setGasMeterTokWh(Double value) { this.GasMeterTokWh = value; return this; }
        public String getDashboardView() { return DashboardView; }
        public InstallationBase setDashboardView(String value) { this.DashboardView = value; return this; }
        public Date getActivationDate() { return ActivationDate; }
        public InstallationBase setActivationDate(Date value) { this.ActivationDate = value; return this; }
        public Boolean isBlocked() { return Blocked; }
        public InstallationBase setBlocked(Boolean value) { this.Blocked = value; return this; }
        public String getGwVersion() { return GWVersion; }
        public InstallationBase setGwVersion(String value) { this.GWVersion = value; return this; }
    }


}
