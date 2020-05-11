/**
 * @author 			:	 Sumit Kumar
 *	DATE       		:	 06-May-2020
 *  FILE NAME  		: 	 TC_04_PatchRequest.java
 *  PROJECT NAME 	:	 restassuredautomation_framwork
 * 
 */
package com.API_Testing.TestCasesScripts;

import java.io.IOException;
import java.util.Properties;
import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.API_Testing.ResponseValidation.ResponseDataValidation;
import com.API_Testing.TestStep_HTTP_Methods.HTTP_Methods;
import com.API_Testing.Utilites.APILOGCapture;
import com.API_Testing.Utilites.Load_PropertiestFile;

import io.restassured.response.Response;

/***Test Case for update specific record as per id ***/
public class TC_04_PatchRequest extends TC_03_PUTRequest {
	/*Specific data which we want to update*/
	JSONObject specificData; 
	@BeforeMethod
	public void dataForUpdate()
	{
		specificData = new JSONObject(); 
		specificData.put("Age", "80");//data which we want to update	
	}
	@Test
	public void updateSpecificData() throws IOException
	{
		Properties pr = Load_PropertiestFile.getPropertyFile();
		HTTP_Methods patchMethods = new HTTP_Methods(pr);
		Response res= patchMethods.patch_UpdateData(specificData.toString(), "baseURL", "endPointURI1", idValue);
		System.out.println("##############---TC_04--PATCH REQUEST RESPONSE DATA----#############\n");
		ResponseDataValidation.responseCodeValidation(200, res.statusCode());
		
		APILOGCapture.captureLog("TC_04_PATCH Request", "Status code matched");
		System.out.println(res.asString());
		APILOGCapture.captureLog("TC_04_PATCH Request", "ID "+idValue+" hase been updated successfully");

	}
}
