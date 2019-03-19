package com.dd.mobile.information.request;


import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "mobileDataUsedRange",
    "mobileDataOperatorName",
    "mobileDataLimit",
    "mobileDataUsed"
})
public class MobileDataDetail {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileDataUsedRange")
    private String mobileDataUsedRange;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileDataOperatorName")
    private String mobileDataOperatorName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileDataLimit")
    private String mobileDataLimit;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileDataUsed")
    private String mobileDataUsed;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileDataUsedRange")
    public String getMobileDataUsedRange() {
        return mobileDataUsedRange;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileDataUsedRange")
    public void setMobileDataUsedRange(String mobileDataUsedRange) {
        this.mobileDataUsedRange = mobileDataUsedRange;
    }

    public MobileDataDetail withMobileDataUsedRange(String mobileDataUsedRange) {
        this.mobileDataUsedRange = mobileDataUsedRange;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileDataOperatorName")
    public String getMobileDataOperatorName() {
        return mobileDataOperatorName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileDataOperatorName")
    public void setMobileDataOperatorName(String mobileDataOperatorName) {
        this.mobileDataOperatorName = mobileDataOperatorName;
    }

    public MobileDataDetail withMobileDataOperatorName(String mobileDataOperatorName) {
        this.mobileDataOperatorName = mobileDataOperatorName;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileDataLimit")
    public String getMobileDataLimit() {
        return mobileDataLimit;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileDataLimit")
    public void setMobileDataLimit(String mobileDataLimit) {
        this.mobileDataLimit = mobileDataLimit;
    }

    public MobileDataDetail withMobileDataLimit(String mobileDataLimit) {
        this.mobileDataLimit = mobileDataLimit;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileDataUsed")
    public String getMobileDataUsed() {
        return mobileDataUsed;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileDataUsed")
    public void setMobileDataUsed(String mobileDataUsed) {
        this.mobileDataUsed = mobileDataUsed;
    }

    public MobileDataDetail withMobileDataUsed(String mobileDataUsed) {
        this.mobileDataUsed = mobileDataUsed;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public MobileDataDetail withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mobileDataUsedRange).append(mobileDataOperatorName).append(mobileDataLimit).append(mobileDataUsed).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MobileDataDetail) == false) {
            return false;
        }
        MobileDataDetail rhs = ((MobileDataDetail) other);
        return new EqualsBuilder().append(mobileDataUsedRange, rhs.mobileDataUsedRange).append(mobileDataOperatorName, rhs.mobileDataOperatorName).append(mobileDataLimit, rhs.mobileDataLimit).append(mobileDataUsed, rhs.mobileDataUsed).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

