package com.dd.mobile.information.db;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DeleteItemOutcome;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PrimaryKey;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.UpdateItemOutcome;
import com.amazonaws.services.dynamodbv2.document.spec.DeleteItemSpec;
import com.amazonaws.services.dynamodbv2.document.spec.UpdateItemSpec;
import com.amazonaws.services.dynamodbv2.document.utils.NameMap;
import com.amazonaws.services.dynamodbv2.document.utils.ValueMap;
import com.amazonaws.services.dynamodbv2.model.ReturnValue;
import com.dd.mobile.information.AWSCredentialsConstants;
import com.dd.mobile.information.request.MobileIMEIDetail;
import com.dd.mobile.information.request.MobileRegistrationRequest;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;

import com.amazonaws.regions.Regions;

/* Dynamo DB Connection*/
public class MobileInformationConnection {
	static AWSCredentialsConstants aWSCredentialsConstants = new AWSCredentialsConstants();
	static BasicAWSCredentials creds = new BasicAWSCredentials(aWSCredentialsConstants.getAccessKey(),aWSCredentialsConstants.getSecretKey());
	static AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(creds))
			.withRegion(Regions.US_EAST_2).build();	
	static DynamoDB dynamoDB = new DynamoDB(client);
	static String tableName = "userDetails";
	static String userMobileDetails = "userMobileDetails";

	public boolean checkSerialNumber(MobileRegistrationRequest mobileRegistrationRequest) {
		String serialNumber = null != mobileRegistrationRequest.getMobileSerialNumber()
				? mobileRegistrationRequest.getMobileSerialNumber()
				: "";
		String email = null != mobileRegistrationRequest.getEmail() ? mobileRegistrationRequest.getEmail() : "";
		String userName = null != mobileRegistrationRequest.getUserName() ? mobileRegistrationRequest.getUserName()
				: "";
		boolean serialNumberExist = false;
		Table table = dynamoDB.getTable(tableName);
		System.out.println("Table: " + table.getTableName());
		PrimaryKey primaryKey = new PrimaryKey();
		primaryKey.addComponent("Email", email);
		Item userDetailExist = null != table.getItem(primaryKey) ? table.getItem(primaryKey) : null;
		if (null != userDetailExist) {
			String serialNumberDB = userDetailExist.getString("serialNumber");
			if (serialNumber.equals(serialNumberDB)) {
				serialNumberExist = true;
			} else {
				serialNumberExist = false;
			}
		} else {
			serialNumberExist = false;
		}
		return serialNumberExist;
	}

	public boolean addMobileDetails(MobileRegistrationRequest mobileRegistrationRequest) {
		boolean addedMobileDetails = false;
		try {
			if (checkSerialNumber(mobileRegistrationRequest)) {
				Table table = dynamoDB.getTable(tableName);
				System.out.println("Table: " + table.getTableName());
				PrimaryKey primaryKey = new PrimaryKey();
				primaryKey.addComponent("Email", mobileRegistrationRequest.getEmail());
				Item userDetailExist = null != table.getItem(primaryKey) ? table.getItem(primaryKey) : null;
				if (null != userDetailExist) {
					String serialNumber = userDetailExist.getString("serialNumber");
					System.out.println("primaryKey : exist: " + serialNumber);
					Table userMobileDetailsTable = dynamoDB.getTable(userMobileDetails);
					System.out.println("Table : " + userMobileDetailsTable.getTableName());
					PrimaryKey serialNumberKey = new PrimaryKey();
					serialNumberKey.addComponent("serialNumber", serialNumber);
					System.out.println("serialNumberKey : " + serialNumberKey.toString());
					Item serialNumberExist = null != userMobileDetailsTable.getItem(serialNumberKey)
							? userMobileDetailsTable.getItem(serialNumberKey)
							: null;
					if (null != serialNumberExist) {
						System.out.println("serialNumberExist : exist: " + serialNumberKey.toString());
					} else {
						List<String> imeiInfo = new ArrayList<String>();
						for(MobileIMEIDetail mobileIMEIDetail : mobileRegistrationRequest.getMobileIMEIDetails()) {
							imeiInfo.add(mobileIMEIDetail.getMobileIMEINumber());
						}
						System.out.println("serialNumberExist : does not exist: " + serialNumberKey.toString());
						Item serialNumberItem = new Item().withPrimaryKey(serialNumberKey)
								.withString("SIMOperatorName", mobileRegistrationRequest.getMobileSIMOperatorName())
								.withString("ManufactureName", mobileRegistrationRequest.getMobileManufactureName())
								.withString("Ram", mobileRegistrationRequest.getMaxRamSize())
								.withString("Rom", mobileRegistrationRequest.getMaxRomSize())
								.withString("ProcessorName", mobileRegistrationRequest.getProcessorName())
								.withString("ModelName", mobileRegistrationRequest.getMobileModelName())
								.withStringSet("IMEI", new HashSet<String>(imeiInfo));
						userMobileDetailsTable.putItem(serialNumberItem);
						addedMobileDetails = true;
						System.out.println(
								"serialNumberExist : new item : " + userMobileDetailsTable.getItem(serialNumberKey));
					}
				} else {
					/*
					 * System.out.println("primaryKey : does not exist: " + primaryKey.toString());
					 * Item item = new Item().withPrimaryKey("Email",
					 * "saravanan.amutha2020@gmail.com") .withString("userName",
					 * "saravanan.amutha2020@gmail.com") .withNumber("serialNumber", 123456);
					 * table.putItem(item); System.out.println("primaryKey exist : new item : " +
					 * table.getItem(primaryKey));
					 */

				}
			} else {

			}

		} catch (AmazonServiceException ase) {
			ase.printStackTrace();
		}
		return addedMobileDetails;
	}

}
