/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 11-Oct-2019
 *  FILE NAME  		: 	 BasicAthonticationTest.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 4:37:58 pm
 */
package com.API_Testing.Authentication;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class BasicAthonticationTest{

	@Test
	public void ResSpecficationMethod() {
		RestAssured.baseURI = "https://restapi.demoqa.com/authentication/CheckForAuthentication";
		RequestSpecification request = RestAssured.given();

		Response response = request.get();
		System.out.println("Status code: " + response.getStatusCode());
		System.out.println("Status message " + response.body().asString());
	}

}
