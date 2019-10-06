/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 16-Sep-2019
 *  FILE NAME  		: 	 ResponseDataValidation.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.ResponseValidation;

import org.testng.Assert;

import io.restassured.response.Response;

public class ResponseDataValidation 
{
	
	public static void responseCodeValidation (int expectedStatusCode, int actualStatusCode) {
		
		
		if (expectedStatusCode==actualStatusCode)
		{
			System.out.println("Expected Status Code is similar to Actual Status code \t:\t"+actualStatusCode);
		}
		else
		{
			System.out.println("Expected code is not match with actual");
		}
	}
	
	public static void responseDataValidation (String expectedResponseData, int actualResponseData) {
		
		
		Assert.assertEquals(expectedResponseData, actualResponseData, "Data is not correct");
	}
}
