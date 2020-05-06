/**
 * @author 			:	 Sumit Kumar
 *	DATE       		:	 06-May-2020
 *  FILE NAME  		: 	 TC_06_GetALLData.java
 *  PROJECT NAME 	:	 restassuredautomation_framwork
 * 
 */
package com.API_Testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;
import com.API_Testing.ResponseValidation.ResponseDataValidation;
import com.API_Testing.TestStep_HTTP_Methods.HTTP_Methods;
import com.API_Testing.utilities.Laod_PropertiestFile;
import io.restassured.response.Response;

public class TC_06_GetALLData 
{
	/**Test Case for get all data
	 * @throws IOException **/
	@Test
	public void getAllRecords() throws IOException
	{
		Properties pr = Laod_PropertiestFile.getPropertyFile();
		HTTP_Methods getAllData = new HTTP_Methods(pr);
		
		System.out.println("##############----GET ALL REQUEST RESPONSE DATA----#############\n");
		
		Response res= getAllData.get_Request("baseURL", "endPointURI1");
		
		ResponseDataValidation.responseCodeValidation(200, res.getStatusCode());
		
		System.out.println(res.asString());
	}
}
