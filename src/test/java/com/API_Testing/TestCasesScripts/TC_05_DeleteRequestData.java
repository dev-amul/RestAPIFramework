/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 02-Oct-2019
 *  FILE NAME  		: 	 TC_05_DeleteRequestData.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.TestCasesScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.API_Testing.commoncontrollers.HTTP_MethodsControllers;
import com.API_Testing.commoncontrollers.ResponseDataValidation;

import io.restassured.response.Response;


/**Test Case for delete the records**/
public class TC_05_DeleteRequestData extends HTTP_MethodsControllers{
	@Test
	public void deleteData() throws IOException {
		Response response= delete_Request("baseURL", "endPointURI1", "");
		System.out.println("##############---TC_05--DELETE REQUEST RESPONSE CODE----#############\n");
		ResponseDataValidation.responseCodeValidation(200, response.getStatusCode());
	}

}
