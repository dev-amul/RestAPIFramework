/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 02-Oct-2019
 *  FILE NAME  		: 	 TC_01_PostRequest.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;
import org.json.JSONObject;
import org.testng.annotations.Test;
import com.API_Tesing.ResponseValidation.ResponseDataValidation;
import com.API_Testing.TestStepts.HTTP_Methods;
import com.API_Testing.utilities.Laod_PropertiestFile;

import io.restassured.response.Response;

public class TC_01_PostRequest 
{
	public JSONObject employeeData() 
	{
		JSONObject body = new JSONObject(); 
		
		body.put("id", "EMP_02");
		body.put("First Name", "Sachin");
		body.put("Last Name", "Teotiar");
		body.put("Designation", "Self Employeed");
		body.put("Gender", "Male");
		body.put("Experience", "4 Years");
		body.put("Age", "28");
		
		return body;
		
	}
	@Test
	public void createData() throws IOException
	{
		Properties pr = Laod_PropertiestFile.getPropertyFile();
		
		HTTP_Methods postMethod = new HTTP_Methods(pr);
		
		JSONObject dataBody = employeeData();
		
		Response response = postMethod.post_Request(dataBody.toString(), "baseURL", "endPointURI1");
		
		System.out.println("##############----POST REQUEST RESPONSE CODE----#############\n");

		ResponseDataValidation.responseCodeValidation(201, response.getStatusCode());
		
		System.out.println("##############----POST REQUEST RESPONSE DATA----#############\n");
		System.out.println("Response Data is \t:\t"+response.asString());
			
	}

}
