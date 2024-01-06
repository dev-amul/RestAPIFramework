/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 11-Aug-2019
 *  FILE NAME  		: 	 PutMethod.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 7:58:35 pm
 */
package com.API_Testing.TestCasesScripts;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PutMethod 
{
	public static Map<String, String> map = new HashMap<String, String>();
	@BeforeMethod
	public void putData ()
	{
	
		  map.put("FirstName", "Ravinda ");
		  map.put("id", "20");
		  map.put("LastName", "Chaudhary");
		  map.put("Disignation", "English Teacher");
		 
		 // RestAssured.baseURI="http://localhost:3000/friends/";
		 
	}
	@Test
	public void updateData ()
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(map)
		.when()
		.put("http://localhost:3000/friends/20")
		.thenReturn();
	 
	int statusCode=res.getStatusCode();
	
	String updatedData = res.asString();
	
	System.out.println(statusCode+"Status code");
	System.out.println("Update data"+updatedData);
	 
		
	}

}
