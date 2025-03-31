/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 16-Aug-2019
 *  FILE NAME  		: 	 TestDeleteRequest.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 12:30:17 am
 */
package com.API_Testing.TestCasesScripts.DummyApis;

import com.API_Testing.commoncontrollers.HTTP_MethodsControllers;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestDeleteRequest extends HTTP_MethodsControllers {

	@Test
	public void runDeleteRequest() {
		res=DELETE_Method(pr.getProperty("end_URL")+"/2");
	}

	@AfterMethod
	public void validateDeleteResponseCode(){
		Assert.assertEquals(res.getStatusCode(),204);

	}

}
