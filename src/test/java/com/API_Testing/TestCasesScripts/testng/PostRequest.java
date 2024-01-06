/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 28-Jun-2019
 *  FILE NAME  		: 	 PostRequest.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 9:43:46 pm
 *  Assignment 		:		22 June 2019
 */
package com.API_Testing.TestCasesScripts.testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.API_Testing.pojopayload.BodyWithPojo;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostRequest 
{
	public BodyWithPojo createData; 
	
	@BeforeMethod
	public void setBody()
	{
		//POJO concept 
		createData = new BodyWithPojo();
		createData.setId(3);
		createData.setFirst_Name("Rakesh");
		createData.setLast_Name("Kumar");
		createData.setAge("25");
		createData.setDesignation("API Developer");
	}
	@Test
	public void postData()
	{
		Response res= 
		given()
		.contentType(ContentType.JSON)
		.body(createData)
		.when()
		.post("http://localhost:3000/friends");
		
		System.out.println("Response code is : "+res.getStatusCode());
		System.out.println("insert data is : "+res.asString());
		
	}

}
