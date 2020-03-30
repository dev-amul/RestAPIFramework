/**
 * @author 			:	 Sumit chaudhary
 *	DATE       		:	 Mar 29, 2020
 *  FILE NAME  		: 	 ReponseDataparsing.java
 *  PROJECT NAME 	:	 restassuredautomation_framwork
 * 
 */
package com.API_Testing.utilities;

import io.restassured.response.Response;

public class ResponseDataparsing 
{
	//Method for getting the data as per required key / path
	public static String responseDataParse(Response responseData, String jsonPath)
	{
		//return the value as per given path/ key
		return responseData.jsonPath().get(jsonPath);
	}

}
