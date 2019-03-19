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
    "mobileIMEINumber"
})
public class MobileIMEIDetail {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileIMEINumber")
    private String mobileIMEINumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileIMEINumber")
    public String getMobileIMEINumber() {
        return mobileIMEINumber;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileIMEINumber")
    public void setMobileIMEINumber(String mobileIMEINumber) {
        this.mobileIMEINumber = mobileIMEINumber;
    }

    public MobileIMEIDetail withMobileIMEINumber(String mobileIMEINumber) {
        this.mobileIMEINumber = mobileIMEINumber;
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

    public MobileIMEIDetail withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mobileIMEINumber).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MobileIMEIDetail) == false) {
            return false;
        }
        MobileIMEIDetail rhs = ((MobileIMEIDetail) other);
        return new EqualsBuilder().append(mobileIMEINumber, rhs.mobileIMEINumber).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
