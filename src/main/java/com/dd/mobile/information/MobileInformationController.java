package com.dd.mobile.information;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dd.mobile.information.dao.MobileRegistrationDetailsDAO;
import com.dd.mobile.information.request.MobileRegistrationRequest;

@RestController
public class MobileInformationController {

	@PostMapping("/userMobileRegistration")
	public ResponseEntity userMobileRegistration(HttpServletRequest request,
			@RequestBody MobileRegistrationRequest mobileRegistrationRequest) {
		JSONObject jsonResponse = new JSONObject();
        try {
        	MobileRegistrationDetailsDAO mobileRegistrationDetailsDAO = new MobileRegistrationDetailsDAO(mobileRegistrationRequest); 
        	jsonResponse =  mobileRegistrationDetailsDAO.saveMobileRegistrationDetails();        	
        } catch (Exception e){
			 jsonResponse.put("responseStatus", "D");
			 JSONArray exception = new JSONArray();
			 exception.add(e.getMessage());
			 jsonResponse.put("exception",exception);
		}
		return new ResponseEntity(jsonResponse, HttpStatus.OK);
	}
}
