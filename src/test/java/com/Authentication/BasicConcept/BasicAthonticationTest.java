/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 11-Oct-2019
 *  FILE NAME  		: 	 BasicAthonticationTest.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 4:37:58 pm
 */
package com.Authentication.BasicConcept;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BasicAthonticationTest{

	@Test
	public void ResSpecficationMethod() {
		// using Dummy API for authentication concept understand 
		RestAssured.baseURI= "http://restapi.demoqa.com/authentication/CheckForAuthentication";
		// Use Request Specification it is Specify a default request specification that will be sent with each request.
		
		//new method for explore new method for API testing 
		RequestSpecification requestSpec = 
					
				RestAssured
				.given()
				.baseUri(baseURI)
				.auth()
				.preemptive() // This reduces the load on network and the server itself
				.basic("ToolsQA", "TestPassword");
		
		Response res = requestSpec.get();
		
		int statusCode= res.statusCode();
		String responseData= res.asString();
	
		System.out.println("Status Is : "+statusCode);
		System.out.println("Response Data"+responseData);
	}

}
