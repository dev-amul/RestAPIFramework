/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 16-Aug-2019
 *  FILE NAME  		: 	 DeleteRequest.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 12:30:17 am
 */
package com.API_Testing.TestCasesScripts;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DeleteRequest 
{
	public static void main(String[] args) {
		
		
		Response res= given()
		.contentType(ContentType.JSON)
		.when()
		.delete("http://localhost:3000/friends/2");
	
		int status= res.statusCode();
		
		//String s= res.toString();
		
		System.out.println(status);
		//System.out.println(s);
	
	}
	
	

}
