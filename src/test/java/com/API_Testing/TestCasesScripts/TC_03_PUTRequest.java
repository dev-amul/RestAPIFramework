/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 06-Oct-2019
 *  FILE NAME  		: 	 TC_03_PUTRequest.java
 *  PROJECT NAME 	:	 RestAPI_Framework
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

/***Test Case For Modify the records***/
public class TC_03_PUTRequest extends HTTP_MethodsControllers{
	/**Data for modify the records**/
	JSONObject updateData;
	@BeforeMethod
	public void dataForUpdateExisitingRecords() throws JSONException {
		updateData = new JSONObject(); 
		updateData.put("id", "");
		updateData.put("First Name", "Sumit");
		updateData.put("Last Name", "Kumar Chaudhary"); //update name
		updateData.put("Designation", "Software autmation");//update design
		updateData.put("Gender", "Male");
		updateData.put("Experience", "3 Years");
		updateData.put("Age", "29");
	}
	
	@Test
	public void updateRecord() throws IOException {
		Response updatedData = put_Request(updateData.toString(), "baseURL", "endPointURI1", "");
		System.out.println("##############---TC_03-PUT REQUEST RESPONSE CODE----#############\n");
		ResponseDataValidation.responseCodeValidation(200, updatedData.getStatusCode());
		System.out.println("##############----PUT REQUEST RESPONSE DATA----#############\n");
		System.out.println("Response Data is \t:\t"+updatedData.asString());	
	}
}
