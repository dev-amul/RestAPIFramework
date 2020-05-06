/**
 * @author 			:	 Neelam-Sonu
 *	DATE       		:	 06-May-2020
 *  FILE NAME  		: 	 TC_4_PatchRequest.java
 *  PROJECT NAME 	:	 restassuredautomation_framwork
 * 
 */
package com.API_Testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.API_Testing.Payloads.AlltypeDataRead;
import com.API_Testing.ResponseValidation.ResponseDataValidation;
import com.API_Testing.TestStep_HTTP_Methods.HTTP_Methods;
import com.API_Testing.utilities.Laod_PropertiestFile;

import io.restassured.response.Response;

public class TC_4_PatchRequest {
	JSONObject specificData; 
	@BeforeMethod
	public void dataForUpdate()
	{
		specificData = new JSONObject(); 
		specificData.put("id", "EMP_01");
		specificData.put("Age", "40");
		//
		/*
		{
		    "Designation": "Software Test Engineer",
		    "Experience": "2.6 Years",
		    "First Name": "Sumit Kumar ",
		    "id": "EMP_01",
		    "Gender": "Male",
		    "Last Name": "Chaudhary",
		    "Age": "28"
		  },*/
	}
	@Test
	public void updateSpecificData() throws IOException
	{
		Properties pr = Laod_PropertiestFile.getPropertyFile();
		HTTP_Methods patchMethods = new HTTP_Methods(pr);
		
		//JSONObject jsonFiJsonObject = AlltypeDataRead.readJsonFile("../restassuredautomation_framwork/src/test/java/com/API_Testing/Resources/DataforPatchrequest.json");
		
		Response patchResponse=patchMethods.patch_UpdateData(specificData.toString(), "baseURL", "EMP_01");
		
		ResponseDataValidation.responseCodeValidation(200, patchResponse.getStatusCode());
		
		System.out.println(patchResponse.asString());
	}
}
