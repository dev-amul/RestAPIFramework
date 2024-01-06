/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 13-Sep-2019
 *  FILE NAME  		: 	 PostComplexJSON.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 9:25:17 pm
 */
package com.API_Testing.TestCasesScripts.mainmethod;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostComplexJSON 
{
	public static void main(String[] args) 
	{
		JSONObject basicInfo = new JSONObject(); 
		basicInfo.put("id", "Emp1");
		basicInfo.put("Name", "Sumit Kumar Chaudahry");
		basicInfo.put("Father's Name","Lt. Sri Rameshwer Prasad");
		basicInfo.put("Age", "28");
		basicInfo.put("Profession", "Software Tester");
		
		JSONObject address = new JSONObject();
		
		address.put("House No", "B123");
		address.put("Land Mark", "NMRC Metro");
		address.put("City", "Noida");
		address.put("District", "G.B Nagar");
		address.put("State", "UP");
		address.put("Pin Code", "123456");
		
		JSONObject otherInformation = new JSONObject();
		
		otherInformation.put("Hobbies", "I Fond of play Cricket & Badminton");
		otherInformation.put("Experience", "2.6");
		otherInformation.put("Interest", "Explore New Things");
		otherInformation.put("Marital Status", "Un Married");
		otherInformation.put("Contact Number", "+91-9971458090");
		//store both object value to employe infor object
		JSONObject  employeeBasicInfo = new JSONObject();
		employeeBasicInfo.put("Address Informaiton", address);
		employeeBasicInfo.put("Other Informaiton", otherInformation);
// store emoploye object to basicinfo object
		basicInfo.put("Personal Details", employeeBasicInfo);
		
	//Send the data to jsonServer using post 
		Response parRes= 
		given()
		.contentType(ContentType.JSON)
		.when()
		.body(basicInfo.toString())
		.post("http://localhost:3000/ComplexJson");
		
		int statusCode= parRes.statusCode();
		String postData= parRes.asString();
		System.out.println("Post Request Code: "+statusCode);
		System.out.println("Data posted: "+postData);	
		
	}

}
