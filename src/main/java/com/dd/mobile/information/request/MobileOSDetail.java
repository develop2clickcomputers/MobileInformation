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
    "osVersion",
    "osPlatForm",
    "osName"
})
public class MobileOSDetail {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("osVersion")
    private String osVersion;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("osPlatForm")
    private String osPlatForm;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("osName")
    private String osName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("osVersion")
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("osVersion")
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public MobileOSDetail withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("osPlatForm")
    public String getOsPlatForm() {
        return osPlatForm;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("osPlatForm")
    public void setOsPlatForm(String osPlatForm) {
        this.osPlatForm = osPlatForm;
    }

    public MobileOSDetail withOsPlatForm(String osPlatForm) {
        this.osPlatForm = osPlatForm;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("osName")
    public String getOsName() {
        return osName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("osName")
    public void setOsName(String osName) {
        this.osName = osName;
    }

    public MobileOSDetail withOsName(String osName) {
        this.osName = osName;
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

    public MobileOSDetail withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(osVersion).append(osPlatForm).append(osName).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MobileOSDetail) == false) {
            return false;
        }
        MobileOSDetail rhs = ((MobileOSDetail) other);
        return new EqualsBuilder().append(osVersion, rhs.osVersion).append(osPlatForm, rhs.osPlatForm).append(osName, rhs.osName).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
