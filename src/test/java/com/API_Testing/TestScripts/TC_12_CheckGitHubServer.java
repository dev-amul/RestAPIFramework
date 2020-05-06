/**
 * @author 			:	 Sumit chaudhary
 *	DATE       		:	 Apr 18, 2020
 *  FILE NAME  		: 	 TC_12_CheckGitHubServer.java
 *  PROJECT NAME 	:	 restassuredautomation_framwork
 * 
 */
package com.API_Testing.TestScripts;

import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.API_Testing.ResponseValidation.ResponseDataValidation;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC_12_CheckGitHubServer 
{
	/**Body for generate in our online server**/
		JSONObject body;
		@BeforeMethod
		public void dataForGenerate() {
			body = new JSONObject(); 
			body.put("id", "EMP_0222");
			body.put("First Name", "Sumit");
			body.put("Last Name", "Kumar");
			body.put("Designation", "Software Automation Engineer");
			body.put("Gender", "Male");
			body.put("Experience", "4 Years");
			body.put("Age", "28");
			
		}
		//test for generate record on github  server
		@Test
		public void generateRecordOnGitServer() {
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.body(body.toString()).when()
				.post("https://my-json-server.typicode.com/SumitKChaudhary/SumitChaudharyJSONserver/Simple_Json");
					
		System.out.println("##############----TC_12--POST REQUEST RESPONSE DATA----#############\n");
	
		//Git hub server return 200 response so I'm comparing with.
		ResponseDataValidation.responseCodeValidation(200, res.getStatusCode());
		
		System.out.println(res.asString());
	}

}
