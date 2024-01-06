/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 28-Jun-2019
 *  FILE NAME  		: 	 GetRequest_WithAddress.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 11:55:26 pm
 *  Assignment Date 		:	23 June 2018 
 *  Assignment 		:	Create data as complax json
 */
package com.API_Testing.TestCasesScripts.testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.API_Testing.pojopayload.AddressInformation;
import com.API_Testing.pojopayload.BodyWithPojo;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TC3_PostRequest_WithAddress
{
	public BodyWithPojo basicInfo;
	@BeforeMethod
	public void setInfo(){
		AddressInformation address = new AddressInformation();
		
		address.setStreet1("F 14 Sector 50");
		address.setLandMark("Sectro 76 NMRC Metro Station");
		address.setCity("Noida");
		address.setState("UP");
		address.setPincode(201301);
		
		
		basicInfo = new BodyWithPojo();
		
		basicInfo.setId(5);
		basicInfo.setFirst_Name("Priyanka");
		basicInfo.setLast_Name("Dixit");
		basicInfo.setAge("27");
		basicInfo.setDesignation("Software Test Enginer");
		basicInfo.setUserAddress(address);
		
	}
	
	@Test
	public void saveInfo(){
		Response res= given()
				.contentType(ContentType.JSON)
				.body(basicInfo)
				.when()
				.post("http://localhost:3000/friends");
		
		System.out.println(res.getStatusCode());
		System.out.println(res.asString());
		
	}

}
