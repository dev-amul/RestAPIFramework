/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 07-Jul-2019
 *  FILE NAME  		: 	 TC20_PostRequest_jSON.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 12:45:07 am
 */
package com.API_Testing.TestCasesScripts.testng;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TC20_PostRequest_jSON 
{
	@Test
	public void postJsoneBody()
	{
		TC12_CreateBodyUsingJson jsoBody = new TC12_CreateBodyUsingJson();
		
		
		Response savedResponse= 
		given()
		.contentType(ContentType.JSON)
		.when()
		.body(jsoBody)
		.post("http://localhost:3000/friends");
		
		
		System.out.println("Status Code is"+savedResponse.getStatusCode());
		
		System.out.println("Saved Data "+savedResponse.asString());
		
		
	}

}
