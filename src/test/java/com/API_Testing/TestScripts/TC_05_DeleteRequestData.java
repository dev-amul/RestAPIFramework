/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 02-Oct-2019
 *  FILE NAME  		: 	 TC_05_DeleteRequestData.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.TestScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;
import com.API_Testing.ResponseValidation.ResponseDataValidation;
import com.API_Testing.TestStep_HTTP_Methods.HTTP_Methods;
import com.API_Testing.utilities.Load_PropertiestFile;
import io.restassured.response.Response;


/**Test Case for delete the records**/
public class TC_05_DeleteRequestData extends TC_04_PatchRequest
{
	@Test
	public void deleteData() throws IOException 
	{
		Properties pr = Load_PropertiestFile.getPropertyFile();
		
		HTTP_Methods deleteRequest = new HTTP_Methods(pr);
		
		Response response= deleteRequest.delete_Request("baseURL", "endPointURI1", idValue);
		
		System.out.println("##############---TC_05--DELETE REQUEST RESPONSE CODE----#############\n");
		
		ResponseDataValidation.responseCodeValidation(200, response.getStatusCode());
		
	}

}
