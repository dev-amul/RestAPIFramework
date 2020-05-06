/**
 * @author 			:	 Sumit Kumar
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
import com.API_Testing.ResponseValidation.ResponseDataValidation;
import com.API_Testing.TestStep_HTTP_Methods.HTTP_Methods;
import com.API_Testing.utilities.Load_PropertiestFile;
import io.restassured.response.Response;

/***Test Case for update specific record as per id ***/
public class TC_04_PatchRequest extends TC_01_PostMethods {
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
		ResponseDataValidation.responseCodeValidation(200, res.statusCode());
		System.out.println("##############----PATCH REQUEST RESPONSE DATA----#############\n");
		System.out.println(res.asString());
	}
}
