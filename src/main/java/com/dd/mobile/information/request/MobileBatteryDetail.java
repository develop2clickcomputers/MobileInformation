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
    "mobileBatteryCurrentlyCharged",
    "mobileBatteryManufactureName",
    "mobileBatteryWirelessCharging",
    "mobileBatteryMaxAmp"
})
public class MobileBatteryDetail {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileBatteryCurrentlyCharged")
    private String mobileBatteryCurrentlyCharged;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileBatteryManufactureName")
    private String mobileBatteryManufactureName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileBatteryWirelessCharging")
    private String mobileBatteryWirelessCharging;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileBatteryMaxAmp")
    private String mobileBatteryMaxAmp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileBatteryCurrentlyCharged")
    public String getMobileBatteryCurrentlyCharged() {
        return mobileBatteryCurrentlyCharged;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileBatteryCurrentlyCharged")
    public void setMobileBatteryCurrentlyCharged(String mobileBatteryCurrentlyCharged) {
        this.mobileBatteryCurrentlyCharged = mobileBatteryCurrentlyCharged;
    }

    public MobileBatteryDetail withMobileBatteryCurrentlyCharged(String mobileBatteryCurrentlyCharged) {
        this.mobileBatteryCurrentlyCharged = mobileBatteryCurrentlyCharged;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileBatteryManufactureName")
    public String getMobileBatteryManufactureName() {
        return mobileBatteryManufactureName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileBatteryManufactureName")
    public void setMobileBatteryManufactureName(String mobileBatteryManufactureName) {
        this.mobileBatteryManufactureName = mobileBatteryManufactureName;
    }

    public MobileBatteryDetail withMobileBatteryManufactureName(String mobileBatteryManufactureName) {
        this.mobileBatteryManufactureName = mobileBatteryManufactureName;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileBatteryWirelessCharging")
    public String getMobileBatteryWirelessCharging() {
        return mobileBatteryWirelessCharging;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileBatteryWirelessCharging")
    public void setMobileBatteryWirelessCharging(String mobileBatteryWirelessCharging) {
        this.mobileBatteryWirelessCharging = mobileBatteryWirelessCharging;
    }

    public MobileBatteryDetail withMobileBatteryWirelessCharging(String mobileBatteryWirelessCharging) {
        this.mobileBatteryWirelessCharging = mobileBatteryWirelessCharging;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileBatteryMaxAmp")
    public String getMobileBatteryMaxAmp() {
        return mobileBatteryMaxAmp;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileBatteryMaxAmp")
    public void setMobileBatteryMaxAmp(String mobileBatteryMaxAmp) {
        this.mobileBatteryMaxAmp = mobileBatteryMaxAmp;
    }

    public MobileBatteryDetail withMobileBatteryMaxAmp(String mobileBatteryMaxAmp) {
        this.mobileBatteryMaxAmp = mobileBatteryMaxAmp;
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

    public MobileBatteryDetail withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mobileBatteryCurrentlyCharged).append(mobileBatteryManufactureName).append(mobileBatteryWirelessCharging).append(mobileBatteryMaxAmp).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MobileBatteryDetail) == false) {
            return false;
        }
        MobileBatteryDetail rhs = ((MobileBatteryDetail) other);
        return new EqualsBuilder().append(mobileBatteryCurrentlyCharged, rhs.mobileBatteryCurrentlyCharged).append(mobileBatteryManufactureName, rhs.mobileBatteryManufactureName).append(mobileBatteryWirelessCharging, rhs.mobileBatteryWirelessCharging).append(mobileBatteryMaxAmp, rhs.mobileBatteryMaxAmp).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

