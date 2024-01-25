/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 01-Sep-2019
 *  FILE NAME  		: 	 TestPATCHRequest.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 8:25:07 pm
 */
package com.qa.TestCasesScripts;

import com.qa.commoncontrollers.HTTP_MethodsControllers;
import com.qa.utitlites.AlltypeDataRead;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPATCHRequest extends HTTP_MethodsControllers {
	String requestBody;
	Response res;
	@BeforeMethod
	public void putData () {
		requestBody= AlltypeDataRead.readJsonFile("userPayload.json").toString();
	}
	
	@Test
	public void updateData() {
		res=PATCH_Method(requestBody,pr.getProperty("endurl")+"/2");
	}
	@AfterMethod
	public void validatePATCHStatusResponseCode(){
		Assert.assertEquals(res.getStatusCode(), 200);
	}

}
