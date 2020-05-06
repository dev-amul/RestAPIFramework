/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 06-Oct-2019
 *  FILE NAME  		: 	 TC_03_PUTRequest.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.TestScripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.API_Testing.Payloads.AlltypeDataRead;
import com.API_Testing.ResponseValidation.ResponseDataValidation;
import com.API_Testing.TestStep_HTTP_Methods.HTTP_Methods;
import com.API_Testing.utilities.Load_PropertiestFile;

import io.restassured.response.Response;

/***Test Case For Modify the records***/
public class TC_03_PUTRequest extends TC_01_PostMethods
{
	/**Data for modify the records**/
	JSONObject updateData;
	@BeforeMethod
	public void dataForUpdateExisitingRecords() {
		updateData = new JSONObject(); 
		updateData.put("id", idValue);
		updateData.put("First Name", "Sumit");
		updateData.put("Last Name", "Kumar Chaudhary"); //update name
		updateData.put("Designation", "Software autmation");//update designm
		updateData.put("Gender", "Male");
		updateData.put("Experience", "3 Years");
		updateData.put("Age", "29");
	}
	
	@Test
	public void updateRecord() throws IOException 
	{
		Properties properTies = Load_PropertiestFile.getPropertyFile();
		
		HTTP_Methods putRequestMethod = new HTTP_Methods(properTies);
		
		Response updatedData = putRequestMethod.put_Request(updateData.toString(), "baseURL", "endPointURI1", idValue);

		System.out.println("##############----PUT REQUEST RESPONSE CODE----#############\n");

		ResponseDataValidation.responseCodeValidation(200, updatedData.getStatusCode());
		
		System.out.println("##############----PUT REQUEST RESPONSE DATA----#############\n");
		System.out.println("Response Data is \t:\t"+updatedData.asString());	
	}

}
