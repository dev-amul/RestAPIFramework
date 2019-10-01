/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 02-Oct-2019
 *  FILE NAME  		: 	 TC_03_DeleteRequestData.java
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

public class TC_03_DeleteRequestData
{
	@Test
	public void deleteData() throws IOException 
	{
		Properties pr = Laod_PropertiestFile.getPropertyFile();
		
		HTTP_Methods deleteRequest = new HTTP_Methods(pr);
		
		Response response= deleteRequest.delete_Request("baseURL", "endPointURI1", "EMP_02");
		
		System.out.println("##############----DELETE REQUEST RESPONSE CODE----#############\n");
		
		ResponseDataValidation.responseCodeValidation(200, response.getStatusCode());
		
	}

}
