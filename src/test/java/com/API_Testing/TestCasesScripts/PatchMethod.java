/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 01-Sep-2019
 *  FILE NAME  		: 	 PatchMethod.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 8:25:07 pm
 */
package com.API_Testing.TestCasesScripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

public class PatchMethod 
{
	
	public static Map<String, String> map = new HashMap<String, String>();
	@BeforeMethod
	public void putData ()
	{
	
		  map.put("FirstName", "Ravinda ");
		  map.put("id", "18");
		 // RestAssured.baseURI="http://localhost:3000/friends/";
		 
	}
	
	@Test
	public void updatePerticulerData()
	{
		/*Body getSetBody = new Body();
		
		getSetBody.setId(5);
		getSetBody.setFirst_Name("Shashi");*/
		
		Response res= 
		given()
		.body(map)
		.when()
		.contentType(ContentType.JSON)
		.patch("http://localhost:3000/friends/18");
		
		
		int patchStatusCode= res.getStatusCode();
		String updateData = res.asString();
		
		System.out.println("Patch request Status is \n"+patchStatusCode);
		System.out.println("Update Data: \n"+updateData);
	}

}
