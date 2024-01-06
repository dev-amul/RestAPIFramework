/**
 * @author 			:	 Sumit chaudhary
 *	DATE       		:	 Dec 11, 2019
 *  FILE NAME  		: 	 TC_10_PostDataUsingPojo.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.TestCasesScripts.mainmethod;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.json.JSONObject;

import com.API_Testing.pojopayload.BodyPojo;
import com.API_Testing.utitlites.AlltypeDataRead;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC_10_PostDataUsingPojo 
{
	public static void main(String[] args) throws IOException {
		
		JSONObject address= AlltypeDataRead.readJsonFile("../RestAPI_Framework/src/test/java/com/API_Testing/Resources/EmployeeAddress.json");
		
		BodyPojo pojoBodyEmployeeData = new BodyPojo();
		
		pojoBodyEmployeeData.setId("Pojo_01");
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
