package Models;

import java.util.LinkedHashMap;
import java.util.List;
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
        "language",
        "selections",
        "rows",
        "bonusIds",
        "totalStake",
        "isBooking"
})
@Generated("jsonschema2pojo")
public class PlaceBet {

    @JsonProperty("language")
    private String language;
    @JsonProperty("selections")
    private List<Selection> selections;
    @JsonProperty("rows")
    private List<Row> rows;
    @JsonProperty("bonusIds")
    private List<Object> bonusIds;
    @JsonProperty("totalStake")
    private Integer totalStake;
    @JsonProperty("isBooking")
    private Boolean isBooking;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("selections")
    public List<Selection> getSelections() {
        return selections;
    }

    @JsonProperty("selections")
    public void setSelections(List<Selection> selections) {
        this.selections = selections;
    }

    @JsonProperty("rows")
    public List<Row> getRows() {
        return rows;
    }

    @JsonProperty("rows")
    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    @JsonProperty("bonusIds")
    public List<Object> getBonusIds() {
        return bonusIds;
    }

    @JsonProperty("bonusIds")
    public void setBonusIds(List<Object> bonusIds) {
        this.bonusIds = bonusIds;
    }

    @JsonProperty("totalStake")
    public Integer getTotalStake() {
        return totalStake;
    }

    @JsonProperty("totalStake")
    public void setTotalStake(Integer totalStake) {
        this.totalStake = totalStake;
    }

    @JsonProperty("isBooking")
    public Boolean getIsBooking() {
        return isBooking;
    }

    @JsonProperty("isBooking")
    public void setIsBooking(Boolean isBooking) {
        this.isBooking = isBooking;
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
