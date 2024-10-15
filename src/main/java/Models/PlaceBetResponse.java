package Models;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "placedSuccessfully",
        "timeoutGuid",
        "timeout",
        "number",
        "barcode",
        "authorizationKey",
        "authorizationTimeout",
        "result",
        "isSuccessfull",
        "userInfo"
})
@Generated("jsonschema2pojo")
public class PlaceBetResponse {

    @JsonProperty("placedSuccessfully")
    private Boolean placedSuccessfully;
    @JsonProperty("timeoutGuid")
    private String timeoutGuid;
    @JsonProperty("timeout")
    private Integer timeout;
    @JsonProperty("number")
    private String number;
    @JsonProperty("barcode")
    private String barcode;
    @JsonProperty("authorizationKey")
    private Object authorizationKey;
    @JsonProperty("authorizationTimeout")
    private Integer authorizationTimeout;
    @JsonProperty("result")
    private Object result;
    @JsonProperty("isSuccessfull")
    private Boolean isSuccessfull;
    @JsonProperty("userInfo")
    private Object userInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("placedSuccessfully")
    public Boolean getPlacedSuccessfully() {
        return placedSuccessfully;
    }

    @JsonProperty("placedSuccessfully")
    public void setPlacedSuccessfully(Boolean placedSuccessfully) {
        this.placedSuccessfully = placedSuccessfully;
    }

    @JsonProperty("timeoutGuid")
    public String getTimeoutGuid() {
        return timeoutGuid;
    }

    @JsonProperty("timeoutGuid")
    public void setTimeoutGuid(String timeoutGuid) {
        this.timeoutGuid = timeoutGuid;
    }

    @JsonProperty("timeout")
    public Integer getTimeout() {
        return timeout;
    }

    @JsonProperty("timeout")
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonProperty("barcode")
    public String getBarcode() {
        return barcode;
    }

    @JsonProperty("barcode")
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    @JsonProperty("authorizationKey")
    public Object getAuthorizationKey() {
        return authorizationKey;
    }

    @JsonProperty("authorizationKey")
    public void setAuthorizationKey(Object authorizationKey) {
        this.authorizationKey = authorizationKey;
    }

    @JsonProperty("authorizationTimeout")
    public Integer getAuthorizationTimeout() {
        return authorizationTimeout;
    }

    @JsonProperty("authorizationTimeout")
    public void setAuthorizationTimeout(Integer authorizationTimeout) {
        this.authorizationTimeout = authorizationTimeout;
    }

    @JsonProperty("result")
    public Object getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(Object result) {
        this.result = result;
    }

    @JsonProperty("isSuccessfull")
    public Boolean getIsSuccessfull() {
        return isSuccessfull;
    }

    @JsonProperty("isSuccessfull")
    public void setIsSuccessfull(Boolean isSuccessfull) {
        this.isSuccessfull = isSuccessfull;
    }

    @JsonProperty("userInfo")
    public Object getUserInfo() {
        return userInfo;
    }

    @JsonProperty("userInfo")
    public void setUserInfo(Object userInfo) {
        this.userInfo = userInfo;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}