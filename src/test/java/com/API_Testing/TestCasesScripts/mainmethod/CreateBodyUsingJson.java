/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 06-Jul-2019
 *  FILE NAME  		: 	 CreateBodyUsingJson.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 1:22:42 pm
 */
package com.API_Testing.TestCasesScripts.mainmethod;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateBodyUsingJson
{
	public static void main(String[] args) throws JSONException 
	{
		JSONObject primaryAddress = new JSONObject();
		
		primaryAddress.put("H.N", 14);
		primaryAddress.put("Sector", 50);
		primaryAddress.put("Lanmark", "Amarpali Silicon City");
		primaryAddress.put("City", "Noida");
		primaryAddress.put("State", "UP");
		primaryAddress.put("Pincode", 201301);
		
		JSONObject primAdd = new JSONObject();
		primAdd.put("Primary Address", primaryAddress);
		
		//System.out.println(primAdd.toString());
		
		JSONObject secondaryAddress = new JSONObject();
		
		secondaryAddress.put("H.N", 125);
		secondaryAddress.put("Block", "B");
		secondaryAddress.put("Lanmark", "UCO Bank");
		secondaryAddress.put("City", "Shahpur Jat");
		secondaryAddress.put("State", "Delhi");
		secondaryAddress.put("Pincode", 110049);
		
		JSONObject seconAdd = new JSONObject();
		seconAdd.put("Secandory Address", secondaryAddress);
		//System.out.println(seconAdd.toString());
		
		JSONArray bothAdd = new JSONArray();
		
		bothAdd.put(primAdd);
		bothAdd.put(seconAdd);
		
		JSONObject basicInformation= new JSONObject();
		
		basicInformation.put("First Name", "Sumit");
		basicInformation.put("Last Name", "Kumar");
		basicInformation.put("Contact", "9971458090");
		basicInformation.put("Dsignation", "Software Tester");
		basicInformation.put("Address", bothAdd);
		
		Response savedResponse=
				given()
				.contentType(ContentType.JSON)
				.when()
				.body(basicInformation)
				.post("http://localhost:3000/friends");
				
				
				System.out.println("Status Code is"+savedResponse.getStatusCode());
				
				System.out.println("Saved Data "+savedResponse.asString());
	}

}
