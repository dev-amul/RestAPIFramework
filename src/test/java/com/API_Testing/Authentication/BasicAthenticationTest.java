/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 11-Oct-2019
 *  FILE NAME  		: 	 BasicAthenticationTest.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 4:37:58 pm
 */
package com.API_Testing.Authentication;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class BasicAthenticationTest{
	Response res;

	@Test
	public void ResSpecficationMethod() {
		res=
				given()
				.auth()
						.basic("postman","password")
						.get("https://postman-echo.com/basic-auth");

		res.prettyPrint();
		System.out.println(res.getStatusCode());
	}

	@AfterMethod
	public void validateStatusCode(){
		Assert.assertEquals(res.getStatusCode(),200);
	}

}
