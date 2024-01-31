/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 11-Aug-2019
 *  FILE NAME  		: 	 TC4_PutMethod.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 7:58:35 pm
 */
package com.API_Testing.TestCasesScripts;

import com.API_Testing.commoncontrollers.HTTP_MethodsControllers;
import com.API_Testing.utitlites.AlltypeDataRead;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class TestPUTRequest extends HTTP_MethodsControllers {
	
	Response res;
	String requestBody;
	@BeforeMethod
	public void putData (){
		requestBody= AlltypeDataRead.readJsonFile("userPayload.json").toString();
	}
	@Test
	public void updateData (){
		res=PUT_Method(requestBody,pr.getProperty("endurl")+"/2");
	}
	@AfterMethod
	public void validatePUTStatusCode(){
		Assert.assertEquals(res.getStatusCode(), 200);
	}

}
