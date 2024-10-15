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
        "key",
        "eventId",
        "eventStatus",
        "homeName",
        "awayName",
        "gameTime",
        "betTypeId",
        "betTypeName",
        "betStatus",
        "oddPrice",
        "oldOddPrice",
        "oddKey",
        "oddName",
        "oddDisplayName",
        "isLive",
        "isVirtual",
        "order"
})
@Generated("jsonschema2pojo")
public class Selection {

    @JsonProperty("key")
    private String key;
    @JsonProperty("eventId")
    private Integer eventId;
    @JsonProperty("eventStatus")
    private Integer eventStatus;
    @JsonProperty("homeName")
    private String homeName;
    @JsonProperty("awayName")
    private String awayName;
    @JsonProperty("gameTime")
    private String gameTime;
    @JsonProperty("betTypeId")
    private Integer betTypeId;
    @JsonProperty("betTypeName")
    private String betTypeName;
    @JsonProperty("betStatus")
    private Integer betStatus;
    @JsonProperty("oddPrice")
    private String oddPrice;
    @JsonProperty("oldOddPrice")
    private Object oldOddPrice;
    @JsonProperty("oddKey")
    private String oddKey;
    @JsonProperty("oddName")
    private String oddName;
    @JsonProperty("oddDisplayName")
    private String oddDisplayName;
    @JsonProperty("isLive")
    private Boolean isLive;
    @JsonProperty("isVirtual")
    private Boolean isVirtual;
    @JsonProperty("order")
    private Integer order;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("eventId")
    public Integer getEventId() {
        return eventId;
    }

    @JsonProperty("eventId")
    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    @JsonProperty("eventStatus")
    public Integer getEventStatus() {
        return eventStatus;
    }

    @JsonProperty("eventStatus")
    public void setEventStatus(Integer eventStatus) {
        this.eventStatus = eventStatus;
    }

    @JsonProperty("homeName")
    public String getHomeName() {
        return homeName;
    }

    @JsonProperty("homeName")
    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    @JsonProperty("awayName")
    public String getAwayName() {
        return awayName;
    }

    @JsonProperty("awayName")
    public void setAwayName(String awayName) {
        this.awayName = awayName;
    }

    @JsonProperty("gameTime")
    public String getGameTime() {
        return gameTime;
    }

    @JsonProperty("gameTime")
    public void setGameTime(String gameTime) {
        this.gameTime = gameTime;
    }

    @JsonProperty("betTypeId")
    public Integer getBetTypeId() {
        return betTypeId;
    }

    @JsonProperty("betTypeId")
    public void setBetTypeId(Integer betTypeId) {
        this.betTypeId = betTypeId;
    }

    @JsonProperty("betTypeName")
    public String getBetTypeName() {
        return betTypeName;
    }

    @JsonProperty("betTypeName")
    public void setBetTypeName(String betTypeName) {
        this.betTypeName = betTypeName;
    }

    @JsonProperty("betStatus")
    public Integer getBetStatus() {
        return betStatus;
    }

    @JsonProperty("betStatus")
    public void setBetStatus(Integer betStatus) {
        this.betStatus = betStatus;
    }

    @JsonProperty("oddPrice")
    public String getOddPrice() {
        return oddPrice;
    }

    @JsonProperty("oddPrice")
    public void setOddPrice(String oddPrice) {
        this.oddPrice = oddPrice;
    }

    @JsonProperty("oldOddPrice")
    public Object getOldOddPrice() {
        return oldOddPrice;
    }

    @JsonProperty("oldOddPrice")
    public void setOldOddPrice(Object oldOddPrice) {
        this.oldOddPrice = oldOddPrice;
    }

    @JsonProperty("oddKey")
    public String getOddKey() {
        return oddKey;
    }

    @JsonProperty("oddKey")
    public void setOddKey(String oddKey) {
        this.oddKey = oddKey;
    }

    @JsonProperty("oddName")
    public String getOddName() {
        return oddName;
    }

    @JsonProperty("oddName")
    public void setOddName(String oddName) {
        this.oddName = oddName;
    }

    @JsonProperty("oddDisplayName")
    public String getOddDisplayName() {
        return oddDisplayName;
    }

    @JsonProperty("oddDisplayName")
    public void setOddDisplayName(String oddDisplayName) {
        this.oddDisplayName = oddDisplayName;
    }

    @JsonProperty("isLive")
    public Boolean getIsLive() {
        return isLive;
    }

    @JsonProperty("isLive")
    public void setIsLive(Boolean isLive) {
        this.isLive = isLive;
    }

    @JsonProperty("isVirtual")
    public Boolean getIsVirtual() {
        return isVirtual;
    }

    @JsonProperty("isVirtual")
    public void setIsVirtual(Boolean isVirtual) {
        this.isVirtual = isVirtual;
    }

    @JsonProperty("order")
    public Integer getOrder() {
        return order;
    }

    @JsonProperty("order")
    public void setOrder(Integer order) {
        this.order = order;
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
