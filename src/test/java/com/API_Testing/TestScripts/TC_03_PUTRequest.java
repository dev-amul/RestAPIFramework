/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 06-Oct-2019
 *  FILE NAME  		: 	 TC_03_PUTRequest.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.TestScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;
import org.json.JSONObject;
import org.testng.annotations.Test;
import com.API_Tesing.Resources.AlltypeDataRead;
import com.API_Tesing.ResponseValidation.ResponseDataValidation;
import com.API_Testing.TestStepts.HTTP_Methods;
import com.API_Testing.utilities.Laod_PropertiestFile;

import io.restassured.response.Response;

public class TC_03_PUTRequest 
{
	@Test
	public void updateRecord() throws IOException 
	{
		JSONObject jsonFileData= AlltypeDataRead.readJsonFile("../RestAPI_Framework/DataFile/jsonFILE.json");
		
		Properties properTies = Laod_PropertiestFile.getPropertyFile();
		
		HTTP_Methods putRequestMethod = new HTTP_Methods(properTies);
		
		Response updatedData = putRequestMethod.put_Request(jsonFileData.toString(), "baseURL", "endPointURI1","EMP_01");

		System.out.println("##############----PUT REQUEST RESPONSE CODE----#############\n");

		ResponseDataValidation.responseCodeValidation(200, updatedData.getStatusCode());
		
		System.out.println("##############----PUT REQUEST RESPONSE DATA----#############\n");
		System.out.println("Response Data is \t:\t"+updatedData.asString());

		
	}

}
