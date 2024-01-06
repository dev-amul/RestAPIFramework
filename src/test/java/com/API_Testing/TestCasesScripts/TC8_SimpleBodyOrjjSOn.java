/**
 * @author 			:	 Sumit chaudhary
 *	DATE       		:	 Nov 23, 2019
 *  FILE NAME  		: 	 TC8_SimpleBodyOrjjSOn.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 4:52:12 PM
 */
package com.API_Testing.TestCasesScripts;

import static com.jayway.restassured.RestAssured.*;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class TC8_SimpleBodyOrjjSOn 
{
	
	@Test
	public void PostData()
	{
		JSONObject userDetail = new JSONObject();
		
		userDetail.put("id", 1);
		userDetail.put("First Name", "Sumit Kumar");
		userDetail.put("Email", "Sumitk440@gmail.com");
		userDetail.put("Occupation", "Sr. Software Test Engineer");
		userDetail.put("Contact No", "9971458090");
		
		
		Response res=
		given()
		.accept(ContentType.JSON)
		.body(userDetail.toString())
		.when()
		.post("http://localhost:3000/friends");
		
		System.out.println("Statis Code is : "+res.getStatusCode());
		System.out.println("Post simple data to server "+res.asString());
	}
	

}
