/**
 * @author 			:	 Sumit chaudhary
 *	DATE       		:	 Apr 18, 2020
 *  FILE NAME  		: 	 CheckGitHubServer.java
 *  PROJECT NAME 	:	 restassuredautomation_framwork
 * 
 */
package com.API_Testing.TestScripts;

import org.json.JSONObject;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CheckGitHubServer 
{
		public static void main(String[] args) {
			
			JSONObject body = new JSONObject(); 
			body.put("id", "EMP_06");
			body.put("First Name", "Sachin");
			body.put("Last Name", "Teotiar");
			body.put("Designation", "Self Employeed");
			body.put("Gender", "Male");
			body.put("Experience", "4 Years");
			body.put("Age", "28");
			
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.body(body.toString()).when()
				.post("https://my-json-server.typicode.com/SumitKChaudhary/SumitChaudharyJSONserver/Simple_Json");
		
		String id = res.jsonPath().get("id");
		
		System.out.println(id);
		System.out.println(res.asString());
		System.out.println(res.statusCode());
		
		Response getResponse = 
				given()
				.contentType(ContentType.JSON)
				.when()
				.get("https://my-json-server.typicode.com/SumitKChaudhary/SumitChaudharyJSONserver/Simple_Json"+"/"+id);
		
		System.out.println("Get Response"+getResponse.asString());
		
		
	}

}
