package com.dd.mobile.information.dao;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dd.mobile.information.request.MobileBatteryDetail;
import com.dd.mobile.information.request.MobileIMEIDetail;
import com.dd.mobile.information.request.MobileNumberDetail;
import com.dd.mobile.information.request.MobileOSDetail;
import com.dd.mobile.information.request.MobileRegistrationRequest;
import com.dd.mobile.information.db.MobileInformationConnection;

public class MobileRegistrationDetailsDAO {

	private static final Logger logger = LoggerFactory.getLogger(MobileRegistrationDetailsDAO.class);
	MobileRegistrationRequest mobileRegistrationRequest;
	String lastUpdateOn = "";
	String userName = "";
	String mobileSIMOperatorName = "";
	String mobileManufactureName = "";
	List<MobileIMEIDetail> listMobileIMEIDetail = new ArrayList<MobileIMEIDetail>();
	String maxRamSize = "";
	String maxRomSize = "";
	String mobileSerialNumber = "";
	String processorName = "";
	String mobileModelName = "";
	List<MobileBatteryDetail> listMobileBatteryDetail = new ArrayList<MobileBatteryDetail>();
	List<MobileNumberDetail> listMobileNumberDetail = new ArrayList<MobileNumberDetail>();
	String emailID = "";
	List<MobileOSDetail> listMobileOSDetail = new ArrayList<MobileOSDetail>();

	public MobileRegistrationDetailsDAO() {

	}

	public MobileRegistrationDetailsDAO(MobileRegistrationRequest mobileRegistrationRequest) {
		this.mobileRegistrationRequest = mobileRegistrationRequest;
	}

	public MobileRegistrationDetailsDAO(String lastUpdateOn, String userName, String mobileSIMOperatorName,
			String mobileManufactureName, List<MobileIMEIDetail> listMobileIMEIDetail, String maxRamSize,
			String maxRomSize, String mobileSerialNumber, String processorName, String mobileModelName,
			List<MobileBatteryDetail> listMobileBatteryDetail, List<MobileNumberDetail> listMobileNumberDetail,
			String emailID, List<MobileOSDetail> listMobileOSDetail) {
		this.lastUpdateOn = lastUpdateOn;
		this.userName = userName;
		this.mobileSIMOperatorName = mobileSIMOperatorName;
		this.mobileManufactureName = mobileManufactureName;
		this.listMobileIMEIDetail = listMobileIMEIDetail;
		this.maxRamSize = maxRamSize;
		this.maxRomSize = maxRomSize;
		this.mobileSerialNumber = mobileSerialNumber;
		this.processorName = processorName;
		this.mobileModelName = mobileModelName;
		this.listMobileBatteryDetail = listMobileBatteryDetail;
		this.listMobileNumberDetail = listMobileNumberDetail;
		this.emailID = emailID;
		this.listMobileOSDetail = listMobileOSDetail;
	}

	public boolean checkSerialNumberExist() {

		boolean status = false;
		MobileInformationConnection mobileInformationConnection = new MobileInformationConnection();
		status = mobileInformationConnection.checkSerialNumber(getMobileRegistrationRequest());
		logger.info("checkSerialNumberExist ! status  {}.", status);
		return status;
	}
	
	public boolean addMobileDetails() {

		boolean status = false;
		MobileInformationConnection mobileInformationConnection = new MobileInformationConnection();
		status = mobileInformationConnection.addMobileDetails(getMobileRegistrationRequest());
		logger.info("addMobileDetails ! status  {}.", status);
		return status;
	}

	public JSONObject saveMobileRegistrationDetails() {
		JSONObject jsonResponse = new JSONObject();
		if (getMobileSerialNumber().length() > 0) {
			if (addMobileDetails()) {
				logger.info("saveMobileRegistrationDetails ! serial number doesn't exist.");
				jsonResponse.put("responseStatus", "A");
				JSONArray details = new JSONArray();
				details.add("User " + getUserName() + " Mobile Model " + getMobileModelName() + " Received");
				jsonResponse.put("message", details);
				jsonResponse.put("userName", getUserName());
				jsonResponse.put("deviceID", getMobileSerialNumber());
			} else {
				logger.info("saveMobileRegistrationDetails ! serial number already exist.");
				jsonResponse.put("responseStatus", "D");
				JSONArray details = new JSONArray();
				details.add("Serial Number already");
				jsonResponse.put("message", details);
				jsonResponse.put("userName", getUserName());
				jsonResponse.put("deviceID", getMobileSerialNumber());
			}
		} else {
			jsonResponse.put("responseStatus", "D");
			JSONArray details = new JSONArray();
			details.add("Serial Number Mandatory");
			jsonResponse.put("message", details);
			jsonResponse.put("userName", getUserName());
			jsonResponse.put("deviceID", getMobileSerialNumber());
		}
		logger.info("saveMobileRegistrationDetails ! added successfully : JSONDet {}.", jsonResponse);

		return jsonResponse;
	}

	public JSONObject saveMobileRegistrationDetailsOld() {
		JSONObject jsonResponse = new JSONObject();
		if (getMobileSerialNumber().length() > 0) {
			if (checkSerialNumberExist()) {
				logger.info("saveMobileRegistrationDetails ! serial number doesn't exist.");
				jsonResponse.put("responseStatus", "A");
				JSONArray details = new JSONArray();
				details.add("User " + getUserName() + " Mobile Model " + getMobileModelName() + " Received");
				jsonResponse.put("message", details);
				jsonResponse.put("userName", getUserName());
				jsonResponse.put("deviceID", getMobileSerialNumber());
			} else {
				logger.info("saveMobileRegistrationDetails ! serial number already exist.");
				jsonResponse.put("responseStatus", "D");
				JSONArray details = new JSONArray();
				details.add("Serial Number already");
				jsonResponse.put("message", details);
				jsonResponse.put("userName", getUserName());
				jsonResponse.put("deviceID", getMobileSerialNumber());
			}
		} else {
			jsonResponse.put("responseStatus", "D");
			JSONArray details = new JSONArray();
			details.add("Serial Number Mandatory");
			jsonResponse.put("message", details);
			jsonResponse.put("userName", getUserName());
			jsonResponse.put("deviceID", getMobileSerialNumber());
		}
		logger.info("saveMobileRegistrationDetails ! added successfully : JSONDet {}.", jsonResponse);

		return jsonResponse;
	}

	public String getLastUpdateOn() {
		return lastUpdateOn;
	}

	public void setLastUpdateOn(String lastUpdateOn) {
		this.lastUpdateOn = lastUpdateOn;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobileSIMOperatorName() {
		return mobileSIMOperatorName;
	}

	public void setMobileSIMOperatorName(String mobileSIMOperatorName) {
		this.mobileSIMOperatorName = mobileSIMOperatorName;
	}

	public String getMobileManufactureName() {
		return mobileManufactureName;
	}

	public void setMobileManufactureName(String mobileManufactureName) {
		this.mobileManufactureName = mobileManufactureName;
	}

	public List<MobileIMEIDetail> getListMobileIMEIDetail() {
		return listMobileIMEIDetail;
	}

	public void setListMobileIMEIDetail(List<MobileIMEIDetail> listMobileIMEIDetail) {
		this.listMobileIMEIDetail = listMobileIMEIDetail;
	}

	public String getMaxRamSize() {
		return maxRamSize;
	}

	public void setMaxRamSize(String maxRamSize) {
		this.maxRamSize = maxRamSize;
	}

	public String getMaxRomSize() {
		return maxRomSize;
	}

	public void setMaxRomSize(String maxRomSize) {
		this.maxRomSize = maxRomSize;
	}

	public String getMobileSerialNumber() {
		return mobileSerialNumber;
	}

	public void setMobileSerialNumber(String mobileSerialNumber) {
		this.mobileSerialNumber = mobileSerialNumber;
	}

	public String getProcessorName() {
		return processorName;
	}

	public void setProcessorName(String processorName) {
		this.processorName = processorName;
	}

	public String getMobileModelName() {
		return mobileModelName;
	}

	public void setMobileModelName(String mobileModelName) {
		this.mobileModelName = mobileModelName;
	}

	public List<MobileBatteryDetail> getListMobileBatteryDetail() {
		return listMobileBatteryDetail;
	}

	public void setListMobileBatteryDetail(List<MobileBatteryDetail> listMobileBatteryDetail) {
		this.listMobileBatteryDetail = listMobileBatteryDetail;
	}

	public List<MobileNumberDetail> getListMobileNumberDetail() {
		return listMobileNumberDetail;
	}

	public void setListMobileNumberDetail(List<MobileNumberDetail> listMobileNumberDetail) {
		this.listMobileNumberDetail = listMobileNumberDetail;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public List<MobileOSDetail> getListMobileOSDetail() {
		return listMobileOSDetail;
	}

	public void setListMobileOSDetail(List<MobileOSDetail> listMobileOSDetail) {
		this.listMobileOSDetail = listMobileOSDetail;
	}

	public MobileRegistrationRequest getMobileRegistrationRequest() {
		return mobileRegistrationRequest;
	}

	public void setMobileRegistrationRequest(MobileRegistrationRequest mobileRegistrationRequest) {
		this.mobileRegistrationRequest = mobileRegistrationRequest;
	}
}
