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

public class TestGETRequestSingleUserData extends HTTP_MethodsControllers {
	@Test
	public void getUserResponseById(){
		queryWithKey.put("id","2");
		res=GET_Request_With_QuaryParam("end_URL",queryWithKey);
	}

	@AfterMethod
	public void validateGETResponseCode(){
		res.prettyPrint();
		Assert.assertEquals(res.getStatusCode(), 200);
	}

}
