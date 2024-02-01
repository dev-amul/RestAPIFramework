/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 11-Oct-2019
 *  FILE NAME  		: 	 BasicAuthenticationTest.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 4:37:58 pm
 */
package com.API_Testing.TestCasesScripts.Authentication;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import io.restassured.response.Response;


public class BasicAuthenticationTest {
	Response res;
	/*
	* Basic Authentication, a straightforward method employed in web apps and APIs, entails sending credentials
	* (username and password) with every request to validate the requester’s identity. This approach, widely supported
	* and easy to implement, is often used to secure resources. It’s preferred when simplicity and efficiency are paramount.
	*
	* Through .auth().basic(“username”, “password”), Rest Assured configures the request with your credentials.
	* */
	@Test
	public void basicAuth() {
		res=
				given()
				.auth()
						.basic("postman", "password")
						.get("https://postman-echo.com/basic-auth");

		res.prettyPrint();
		System.out.println(res.getStatusCode());
	}

	@AfterMethod
	public void validateStatusCode(){
		Assert.assertEquals(res.getStatusCode(),200);
	}

}
