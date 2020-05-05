/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 02-Oct-2019
 *  FILE NAME  		: 	 TC_04_DeleteRequestData.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.API_Testing.ResponseValidation.ResponseDataValidation;
import com.API_Testing.TestStep_HTTP_Methods.HTTP_Methods;
import com.API_Testing.utilities.Laod_PropertiestFile;

import io.restassured.response.Response;

public class TC_04_DeleteRequestData extends TC_01_PostMethods
{
	@Test
	public void deleteData() throws IOException 
	{
		Properties pr = Laod_PropertiestFile.getPropertyFile();
		
		HTTP_Methods deleteRequest = new HTTP_Methods(pr);
		
		Response response= deleteRequest.delete_Request("baseURL", "endPointURI1", idValue);
		
		System.out.println("##############----DELETE REQUEST RESPONSE CODE----#############\n");
		
		ResponseDataValidation.responseCodeValidation(200, response.getStatusCode());
		
	}

}
