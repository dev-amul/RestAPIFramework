/**
 * @author 			:	 Sumit chaudhary
 *	DATE       		:	 Mar 30, 2020
 *  FILE NAME  		: 	 TC_02_GetPerticulerIddata.java
 *  PROJECT NAME 	:	 restassuredautomation_framwork
 * 
 */
package com.API_Testing.TestCasesScripts;

import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;

import com.API_Testing.commoncontrollers.HTTP_MethodsControllers;
import com.API_Testing.commoncontrollers.ResponseDataValidation;
import com.API_Testing.utitlites.Load_PropertiestFile;

import io.restassured.response.Response;

public class TC_02_GetPerticulerIddata extends HTTP_MethodsControllers{
	/**Test case for get the data as per particular id ***/
	@Test
	public  void getIDData() throws IOException{
		
		 Response getResponse = get_PerticularID_Request("baseURL", "endPointURI1", "");
		 System.out.println("##############----TC_02_GET REQUEST RESPONSE CODE----#############\n");
		 ResponseDataValidation.responseCodeValidation(200, getResponse.getStatusCode());
		 String getdata = getResponse.asString();
		 System.out.println("\n##############----GET REQUEST RESPONSE DATA----############\n");
		 System.out.println("Response Data is \t:\t"+getdata); 	
	}

}
