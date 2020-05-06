/**
 * @author 			:	 Sumit chaudhary
 *	DATE       		:	 Mar 30, 2020
 *  FILE NAME  		: 	 TC_02_GetPerticulerIddata.java
 *  PROJECT NAME 	:	 restassuredautomation_framwork
 * 
 */
package com.API_Testing.TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.apache.http.impl.conn.Wire;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.API_Testing.ResponseValidation.ResponseDataValidation;
import com.API_Testing.TestStep_HTTP_Methods.HTTP_Methods;
import com.API_Testing.utilities.Load_PropertiestFile;

import io.restassured.response.Response;

public class TC_02_GetPerticulerIddata extends TC_01_PostMethods
{
	/**Test case for get the data as per particular id ***/
	@Test
	public  void getIDData() throws IOException
	{
		 Properties getProperties= Load_PropertiestFile.getPropertyFile();
		 
		 HTTP_Methods getIdRequestMethod = new HTTP_Methods(getProperties);
		 
		 Response getResponse = getIdRequestMethod.get_PerticularID_Request("baseURL", "endPointURI1", idValue);

		 System.out.println("##############----TC_02_GET REQUEST RESPONSE CODE----#############\n");

		 ResponseDataValidation.responseCodeValidation(200, getResponse.getStatusCode());
		 
		 String getdata = getResponse.asString();
		 System.out.println("\n##############----GET REQUEST RESPONSE DATA----############\n");
		 
		 System.out.println("Response Data is \t:\t"+getdata);
		 
			 	
	}

}
