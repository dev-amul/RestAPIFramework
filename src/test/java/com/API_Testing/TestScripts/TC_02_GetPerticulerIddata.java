/**
 * @author 			:	 Sumit chaudhary
 *	DATE       		:	 Mar 30, 2020
 *  FILE NAME  		: 	 TC_02_GetPerticulerIddata.java
 *  PROJECT NAME 	:	 restassuredautomation_framwork
 * 
 */
package com.API_Testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import com.API_Testing.ResponseValidation.ResponseDataValidation;
import com.API_Testing.TestStepts.HTTP_Methods;
import com.API_Testing.utilities.Laod_PropertiestFile;

import io.restassured.response.Response;

public class TC_02_GetPerticulerIddata extends TC_01_PostMethods
{
	public  void getIDData() throws IOException
	{
		 Properties getProperties= Laod_PropertiestFile.getPropertyFile();
		 
		 HTTP_Methods getIdRequestMethod = new HTTP_Methods(getProperties);
		 
		 Response getResponse = 
				 getIdRequestMethod.get_PerticularID_Request("baseURL", 
						 "endPointURI1", TC_01_PostMethods.idValue);

		 System.out.println("##############----GET REQUEST RESPONSE CODE----#############\n");

		 ResponseDataValidation.responseCodeValidation(200, getResponse.getStatusCode());
		 
		 String getdata = getResponse.asString();
		 System.out.println("\n##############----GET REQUEST RESPONSE DATA----############\n");
		 
		 System.out.println("Response Data is \t:\t"+getdata);
		 
		 

	}

}
