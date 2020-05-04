/**
 * @author 			:	 Sumit chaudhary
 *	DATE       		:	 Dec 11, 2019
 *  FILE NAME  		: 	 TC_10_PostDataUsingPojo.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.TestScripts;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.API_Testing.Resources.BodyPojo;
import com.API_Testing.utilities.AlltypeDataRead;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TC_10_PostDataUsingPojo 
{
	@Test
	public void pojoPostTest() throws IOException {
		
		JSONObject address= AlltypeDataRead.readJsonFile("/Users/docquity/git/restassuredautomation_framwork/src/test/java/com/API_Testing/Resources/EmployeeAddress.json");
		
		BodyPojo pojoBodyEmployeeData = new BodyPojo();
		
		pojoBodyEmployeeData.setId("Pojo_02");
		pojoBodyEmployeeData.setEmployeeName("Sumit Chaudhary");
		pojoBodyEmployeeData.setEmployeGender("Male");
		pojoBodyEmployeeData.setEmployeProfession("Software Test Engineer");
		pojoBodyEmployeeData.setEmployeAge("29");
		pojoBodyEmployeeData.setAddress(address.toString());
		
		
		Response res=
				
				given()
				.contentType(ContentType.JSON)
				.when().body(pojoBodyEmployeeData)
				.post("http://localhost:3000/Simple_Json");
		int statusCode= res.getStatusCode();
		String postData= res.asString();
		
		System.out.println(statusCode+"/n"+postData);
	}

}
