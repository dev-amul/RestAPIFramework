/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 29-Jun-2019
 *  FILE NAME  		: 	 PostRequest_InArray.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 11:36:13 pm
 */
package com.API_Testing.TestCasesScripts.testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.API_Testing.pojopayload.AddressInformation;
import com.API_Testing.pojopayload.BodyWithArray;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostRequest_InArray 
{
	public BodyWithArray setBody;
	@BeforeMethod
	public void setInformation()
	{
		AddressInformation[] address = new AddressInformation[1];
		
		address[0] = new AddressInformation();
		
		address[0].setStreet1("118 JP House");
		address[0].setLandMark("UCO Bank");
		address[0].setCity("Sahahpur Jat");
		address[0].setState("New Delhi");
		address[0].setPincode(110049);
		
		
		setBody = new BodyWithArray();
		
		setBody.setId(6);
		setBody.setFirst_Name("Sushil");
		setBody.setLast_Name("Kumar");
		setBody.setAge("31");
		setBody.setDesignation("Project Manager");
		setBody.setUserAddress(address);
	}
	@Test
	public void saveInformation()
	{
	
		Response res= 
		given()
		.contentType(ContentType.JSON)
		.body(setBody)
		.when()
		.post("http://localhost:3000/friends");
		
		System.out.println("Status Code is : "+res.getStatusCode());
		System.out.println("Data saved : " +res.asString());
	}

}
