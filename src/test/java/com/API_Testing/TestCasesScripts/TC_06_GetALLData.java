/**
 * @author 			:	 Sumit Kumar
 *	DATE       		:	 06-May-2020
 *  FILE NAME  		: 	 TC_06_GetALLData.java
 *  PROJECT NAME 	:	 restassuredautomation_framwork
 * 
 */
package com.API_Testing.TestCasesScripts;

import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;

import com.API_Testing.commoncontrollers.HTTP_Methods;
import com.API_Testing.commoncontrollers.ResponseDataValidation;
import com.API_Testing.utitlites.Load_PropertiestFile;

import io.restassured.response.Response;

public class TC_06_GetALLData {
	/**Test Case for get all data
	 * @throws IOException **/
	@Test
	public void getAllRecords() throws IOException{
		Properties pr = Load_PropertiestFile.getPropertyFile();
		HTTP_Methods getAllData = new HTTP_Methods(pr);
		System.out.println("##############---TC_06-GET ALL REQUEST RESPONSE DATA----#############\n");
		Response res= getAllData.get_Request("baseURL", "endPointURI1");
		ResponseDataValidation.responseCodeValidation(200, res.getStatusCode());
	//	APILOGCapture.captureLog("TC_06_Get ALL Data", " The expected status code matched with actual.");
		System.out.println(res.asString());
		ResponseDataValidation.responseTimeConfirmation(res);
	//	APILOGCapture.captureLog("TC_06_Get ALL Data", "All data has fetched from the given URL without any interruption");
	}
}
