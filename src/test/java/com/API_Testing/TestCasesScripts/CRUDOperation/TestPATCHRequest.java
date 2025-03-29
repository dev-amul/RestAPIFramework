/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 01-Sep-2019
 *  FILE NAME  		: 	 TestPATCHRequest.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 8:25:07 pm
 */
package com.API_Testing.TestCasesScripts.CRUDOperation;

import com.API_Testing.commoncontrollers.HTTP_MethodsControllers;
import com.API_Testing.utitlites.AllTypeDataRead;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPATCHRequest extends HTTP_MethodsControllers {
	String requestBody;
	@BeforeMethod
	public void putData () {
		requestBody= AllTypeDataRead.readJsonFile("dummyJsonForKey.json").toString();
	}
	
	@Test
	public void updateData() {
		PATCH_Method(requestBody,pr.getProperty("end_URL")+"/2");
	}
	@AfterMethod
	public void validatePATCHStatusResponseCode(){
		Assert.assertEquals(res.getStatusCode(), 200);
	}

}
