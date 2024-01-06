/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 28-Jun-2019
 *  FILE NAME  		: 	 TC7_GetRequestForAllData.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 9:32:05 pm
 */
package com.API_Testing.TestCasesScripts.testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TC7_GetRequestForAllData
{
	@BeforeMethod
	public void baseUrl(){
		baseURI = "http://localhost:3000"; 
	}
	
	@Test
	public void getResponse(){
		Response res= 
		given()
		.when()
		.get("/friends");
		
		System.out.println(res.asString());
	}

}
