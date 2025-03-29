/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 28-Jun-2019
 *  FILE NAME  		: 	 TestGETRequestSingleUserData.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 9:32:05 pm
 */
package com.API_Testing.TestCasesScripts.DummyApis;

import com.API_Testing.commoncontrollers.HTTP_MethodsControllers;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class TestGETRequest extends HTTP_MethodsControllers{
	@Test
	public void getUserData(){
		GET_Method("end_URL");
		res.prettyPrint();
	}
	@AfterMethod
	public void validateStatusCode(){
		Assert.assertEquals(res.getStatusCode(), 200);
	}

}
