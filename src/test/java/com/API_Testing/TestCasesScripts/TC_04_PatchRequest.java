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
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.API_Testing.commoncontrollers.HTTP_MethodsControllers;
import com.API_Testing.commoncontrollers.ResponseDataValidation;
import com.API_Testing.utitlites.Load_PropertiestFile;

import io.restassured.response.Response;

/***Test Case for update specific record as per id ***/
public class TC_04_PatchRequest extends HTTP_MethodsControllers {
	/*Specific data which we want to update*/
	JSONObject specificData; 
	@BeforeMethod
	public void dataForUpdate() throws JSONException
	{
		specificData = new JSONObject(); 
		specificData.put("Age", "80");//data which we want to update	
	}
	@Test
	public void updateSpecificData() throws IOException
	{
		Response res= patch_UpdateData(specificData.toString(), "baseURL", "endPointURI1", "");
		System.out.println("##############---TC_04--PATCH REQUEST RESPONSE DATA----#############\n");
		ResponseDataValidation.responseCodeValidation(200, res.statusCode());
		System.out.println(res.asString());

	}
}
