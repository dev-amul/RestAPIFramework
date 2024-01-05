/**
 * @author 			:	 Sumit Kumar
 *	DATE       		:	 06-May-2020
 *  FILE NAME  		: 	 TC_06_GetALLData.java
 *  PROJECT NAME 	:	 restassuredautomation_framwork
 * 
 */
package com.API_Testing.TestCasesScripts;

import java.io.IOException;
import org.testng.annotations.Test;
import com.API_Testing.commoncontrollers.HTTP_MethodsControllers;
import com.API_Testing.commoncontrollers.ResponseDataValidation;
import io.restassured.response.Response;

public class TC_06_GetALLData extends HTTP_MethodsControllers {
	/**Test Case for get all data
	 * @throws IOException **/
	@Test
	public void getAllRecords() throws IOException{
		System.out.println("##############---TC_06-GET ALL REQUEST RESPONSE DATA----#############\n");
		Response res= get_Request("baseURL", "endPointURI1");
		ResponseDataValidation.responseCodeValidation(200, res.getStatusCode());
	//	APILOGCapture.captureLog("TC_06_Get ALL Data", " The expected status code matched with actual.");
		System.out.println(res.asString());
		ResponseDataValidation.responseTimeConfirmation(res);
	//	APILOGCapture.captureLog("TC_06_Get ALL Data", "All data has fetched from the given URL without any interruption");
	}
}
