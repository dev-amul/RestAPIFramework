/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 16-Sep-2019
 *  FILE NAME  		: 	 TC_01_GetRequest.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.API_Tesing.ResponseValidation.ResponseDataValidation;
import com.API_Testing.TestStepts.HTTP_Methods;
import com.API_Testing.utilities.Laod_PropertiestFile;

import io.restassured.response.Response;

public class TC_01_GetRequest 
{
	@Test
	public void getData () throws IOException
	{
		 Properties getProperties= Laod_PropertiestFile.getPropertyFile();
		 
		 HTTP_Methods getRequestMethod = new HTTP_Methods(getProperties);
		 
		 Response getResponse = getRequestMethod.get_Request("baseURL");
		 
		 ResponseDataValidation.responseCodeValidation(200, getResponse.getStatusCode());
		 
		 String getdata = getResponse.asString();
		 
		 System.out.println("Response Data is \t:\t"+getdata);
	}

}
