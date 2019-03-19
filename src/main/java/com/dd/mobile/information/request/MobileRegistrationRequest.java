package com.dd.mobile.information.request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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


/**
 * Request schema for the Mobile Info App JSON interface
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "mobileDataDetails",
    "updatedOn",
    "userName",
    "mobileSIMOperatorName",
    "mobileManufactureName",
    "mobileIMEIDetails",
    "maxRamSize",
    "maxRomSize",
    "mobileSerialNumber",
    "processorName",
    "mobileModelName",
    "mobileBatteryDetails",
    "mobileNumberDetails",
    "email",
    "mobileOSDetails",
    "userPassword"
})
public class MobileRegistrationRequest {

    @JsonProperty("mobileDataDetails")
    private List<MobileDataDetail> mobileDataDetails = new ArrayList<MobileDataDetail>();
    @JsonProperty("updatedOn")
    private String updatedOn;
    @JsonProperty("userName")
    private String userName;
    @JsonProperty("mobileSIMOperatorName")
    private String mobileSIMOperatorName;
    @JsonProperty("mobileManufactureName")
    private String mobileManufactureName;
    @JsonProperty("mobileIMEIDetails")
    private List<MobileIMEIDetail> mobileIMEIDetails = new ArrayList<MobileIMEIDetail>();
    @JsonProperty("maxRamSize")
    private String maxRamSize;
    @JsonProperty("maxRomSize")
    private String maxRomSize;
    @JsonProperty("mobileSerialNumber")
    private String mobileSerialNumber;
    @JsonProperty("processorName")
    private String processorName;
    @JsonProperty("mobileModelName")
    private String mobileModelName;
    @JsonProperty("mobileBatteryDetails")
    private List<MobileBatteryDetail> mobileBatteryDetails = new ArrayList<MobileBatteryDetail>();
    @JsonProperty("mobileNumberDetails")
    private List<MobileNumberDetail> mobileNumberDetails = new ArrayList<MobileNumberDetail>();
    @JsonProperty("email")
    private String email;
    @JsonProperty("userPassword")
    private String userPassword;
    @JsonProperty("mobileOSDetails")
    private List<MobileOSDetail> mobileOSDetails = new ArrayList<MobileOSDetail>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    
    @JsonProperty("userPassword")
    public String getUserPassword() {
        return updatedOn;
    }

    @JsonProperty("userPassword")
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    
    @JsonProperty("mobileDataDetails")
    public List<MobileDataDetail> getMobileDataDetails() {
        return mobileDataDetails;
    }

    @JsonProperty("mobileDataDetails")
    public void setMobileDataDetails(List<MobileDataDetail> mobileDataDetails) {
        this.mobileDataDetails = mobileDataDetails;
    }

    public MobileRegistrationRequest withMobileDataDetails(List<MobileDataDetail> mobileDataDetails) {
        this.mobileDataDetails = mobileDataDetails;
        return this;
    }

    @JsonProperty("updatedOn")
    public String getUpdatedOn() {
        return updatedOn;
    }

    @JsonProperty("updatedOn")
    public void setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
    }

    public MobileRegistrationRequest withUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
        return this;
    }

    @JsonProperty("userName")
    public String getUserName() {
        return userName;
    }

    @JsonProperty("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public MobileRegistrationRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    @JsonProperty("mobileSIMOperatorName")
    public String getMobileSIMOperatorName() {
        return mobileSIMOperatorName;
    }

    @JsonProperty("mobileSIMOperatorName")
    public void setMobileSIMOperatorName(String mobileSIMOperatorName) {
        this.mobileSIMOperatorName = mobileSIMOperatorName;
    }

    public MobileRegistrationRequest withMobileSIMOperatorName(String mobileSIMOperatorName) {
        this.mobileSIMOperatorName = mobileSIMOperatorName;
        return this;
    }

    @JsonProperty("mobileManufactureName")
    public String getMobileManufactureName() {
        return mobileManufactureName;
    }

    @JsonProperty("mobileManufactureName")
    public void setMobileManufactureName(String mobileManufactureName) {
        this.mobileManufactureName = mobileManufactureName;
    }

    public MobileRegistrationRequest withMobileManufactureName(String mobileManufactureName) {
        this.mobileManufactureName = mobileManufactureName;
        return this;
    }

    @JsonProperty("mobileIMEIDetails")
    public List<MobileIMEIDetail> getMobileIMEIDetails() {
        return mobileIMEIDetails;
    }

    @JsonProperty("mobileIMEIDetails")
    public void setMobileIMEIDetails(List<MobileIMEIDetail> mobileIMEIDetails) {
        this.mobileIMEIDetails = mobileIMEIDetails;
    }

    public MobileRegistrationRequest withMobileIMEIDetails(List<MobileIMEIDetail> mobileIMEIDetails) {
        this.mobileIMEIDetails = mobileIMEIDetails;
        return this;
    }

    @JsonProperty("maxRamSize")
    public String getMaxRamSize() {
        return maxRamSize;
    }

    @JsonProperty("maxRamSize")
    public void setMaxRamSize(String maxRamSize) {
        this.maxRamSize = maxRamSize;
    }

    @JsonProperty("maxRomSize")
    public String getMaxRomSize() {
        return maxRomSize;
    }

    @JsonProperty("maxRomSize")
    public void setMaxRomSize(String maxRomSize) {
        this.maxRomSize = maxRomSize;
    }

   
    public MobileRegistrationRequest withMaxRamSize(String maxRamSize) {
        this.maxRamSize = maxRamSize;
        return this;
    }

    @JsonProperty("mobileSerialNumber")
    public String getMobileSerialNumber() {
        return mobileSerialNumber;
    }

    @JsonProperty("mobileSerialNumber")
    public void setMobileSerialNumber(String mobileSerialNumber) {
        this.mobileSerialNumber = mobileSerialNumber;
    }

    public MobileRegistrationRequest withMobileSerialNumber(String mobileSerialNumber) {
        this.mobileSerialNumber = mobileSerialNumber;
        return this;
    }

    @JsonProperty("processorName")
    public String getProcessorName() {
        return processorName;
    }

    @JsonProperty("processorName")
    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }

    public MobileRegistrationRequest withProcessorName(String processorName) {
        this.processorName = processorName;
        return this;
    }

    @JsonProperty("mobileModelName")
    public String getMobileModelName() {
        return mobileModelName;
    }

    @JsonProperty("mobileModelName")
    public void setMobileModelName(String mobileModelName) {
        this.mobileModelName = mobileModelName;
    }

    public MobileRegistrationRequest withMobileModelName(String mobileModelName) {
        this.mobileModelName = mobileModelName;
        return this;
    }

    @JsonProperty("mobileBatteryDetails")
    public List<MobileBatteryDetail> getMobileBatteryDetails() {
        return mobileBatteryDetails;
    }

    @JsonProperty("mobileBatteryDetails")
    public void setMobileBatteryDetails(List<MobileBatteryDetail> mobileBatteryDetails) {
        this.mobileBatteryDetails = mobileBatteryDetails;
    }

    public MobileRegistrationRequest withMobileBatteryDetails(List<MobileBatteryDetail> mobileBatteryDetails) {
        this.mobileBatteryDetails = mobileBatteryDetails;
        return this;
    }

    @JsonProperty("mobileNumberDetails")
    public List<MobileNumberDetail> getMobileNumberDetails() {
        return mobileNumberDetails;
    }

    @JsonProperty("mobileNumberDetails")
    public void setMobileNumberDetails(List<MobileNumberDetail> mobileNumberDetails) {
        this.mobileNumberDetails = mobileNumberDetails;
    }

    public MobileRegistrationRequest withMobileNumberDetails(List<MobileNumberDetail> mobileNumberDetails) {
        this.mobileNumberDetails = mobileNumberDetails;
        return this;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public MobileRegistrationRequest withEmail(String email) {
        this.email = email;
        return this;
    }

    @JsonProperty("mobileOSDetails")
    public List<MobileOSDetail> getMobileOSDetails() {
        return mobileOSDetails;
    }

    @JsonProperty("mobileOSDetails")
    public void setMobileOSDetails(List<MobileOSDetail> mobileOSDetails) {
        this.mobileOSDetails = mobileOSDetails;
    }

    public MobileRegistrationRequest withMobileOSDetails(List<MobileOSDetail> mobileOSDetails) {
        this.mobileOSDetails = mobileOSDetails;
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

    public MobileRegistrationRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mobileDataDetails).append(updatedOn).append(userName).append(mobileSIMOperatorName).append(mobileManufactureName).
        		append(mobileIMEIDetails).append(maxRamSize).append(mobileSerialNumber).append(processorName).append(mobileModelName).append(mobileBatteryDetails).
        		append(mobileNumberDetails).append(email).append(mobileOSDetails).append(additionalProperties).append(userPassword).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MobileRegistrationRequest) == false) {
            return false;
        }
        MobileRegistrationRequest rhs = ((MobileRegistrationRequest) other);
        return new EqualsBuilder().append(mobileDataDetails, rhs.mobileDataDetails).append(updatedOn, rhs.updatedOn).append(userName, rhs.userName).
        		append(mobileSIMOperatorName, rhs.mobileSIMOperatorName).append(mobileManufactureName, rhs.mobileManufactureName).append(mobileIMEIDetails, 
        		rhs.mobileIMEIDetails).append(maxRamSize, rhs.maxRamSize).append(mobileSerialNumber, rhs.mobileSerialNumber).append(processorName, 
        		rhs.processorName).append(mobileModelName, rhs.mobileModelName).append(mobileBatteryDetails, 
        		rhs.mobileBatteryDetails).append(mobileNumberDetails, rhs.mobileNumberDetails).append(email, rhs.email).append(mobileOSDetails, 
        		rhs.mobileOSDetails).append(additionalProperties, rhs.additionalProperties).append(userPassword, rhs.userPassword).isEquals();
    }

}

