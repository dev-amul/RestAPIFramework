/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 11-Aug-2019
 *  FILE NAME  		: 	 TC4_PutMethod.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 7:58:35 pm
 */
package com.API_Testing.TestCasesScripts.CRUDOperation;

import com.API_Testing.commoncontrollers.HTTP_MethodsControllers;
import com.API_Testing.utitlites.AllTypeDataRead;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPUTRequest extends HTTP_MethodsControllers {
	
	String requestBody;
	@BeforeMethod
	public void putData (){
		requestBody= AllTypeDataRead.readJsonFile("dummyJsonForKey.json").toString();
	}
	@Test
	public void updateData (){
		PUT_Method(requestBody,pr.getProperty("end_URL")+"/2");
	}
	@AfterMethod
	public void validatePUTStatusCode(){
		Assert.assertEquals(res.getStatusCode(), 200);
	}

}
