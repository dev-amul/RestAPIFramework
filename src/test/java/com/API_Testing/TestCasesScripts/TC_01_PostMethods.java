/**
 * @author 			:	 Sumit chaudhary
 *	DATE       		:	 March 30, 2020
 *  FILE NAME  		: 	 TC_01_PostMethods.java
 *  PROJECT NAME 	:	 restassuredautomation_framwork
 * 
 */
package com.API_Testing.TestCasesScripts;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.API_Testing.commoncontrollers.HTTP_MethodsControllers;
import com.API_Testing.commoncontrollers.ResponseDataValidation;

import io.restassured.response.Response;

/***Test case for Create data ***/
public class TC_01_PostMethods extends HTTP_MethodsControllers{
	
	
	JSONObject body; //taking JSONObject for creating the body in json formate. 
	Response getResponse; 
	/***Create body to pass in post request
	 * @throws JSONException ***/
	@BeforeMethod
	public void jsonBody() throws JSONException{
		body = new JSONObject(); 
		body.put("First Name", "Sumit");
		body.put("Last Name", "Kumar");
		body.put("Designation", "Software Test Engineer");
		body.put("Gender", "Male");
		body.put("Experience", "3 Years");
		body.put("Age", "29");
	}
	
	/** Methods for create the data**/
	@Test
	public void createData(){
		System.out.println(body.toString());
		getResponse = post_Request(body.toString(), "baseURL", "create");	
		ResponseDataValidation.responseCodeValidation(201, getResponse.getStatusCode());
		System.out.println("Response Data is \t:\t"+getResponse.asString());
		
	}

}
