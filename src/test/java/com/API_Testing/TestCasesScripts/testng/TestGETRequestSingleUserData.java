/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 28-Jun-2019
 *  FILE NAME  		: 	 TestGETRequestSingleUserData.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 9:32:05 pm
 */
package com.API_Testing.TestCasesScripts.testng;

import com.API_Testing.commoncontrollers.HTTP_MethodsControllers;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TestGETRequestSingleUserData extends HTTP_MethodsControllers {
	Response res;
	@Test
	public void getResponse(){
		 res=GET_Method(pr.getProperty("endurl")+"/2");
	}

	@AfterMethod
	public void validateGETResponseCode(){
		res.prettyPrint();
		Assert.assertEquals(res.getStatusCode(), 200);
	}

}
