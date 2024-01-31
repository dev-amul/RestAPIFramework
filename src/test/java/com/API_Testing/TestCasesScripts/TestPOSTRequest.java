/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 28-Jun-2019
 *  FILE NAME  		: 	 TC1_PostRequest.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 9:43:46 pm
 *  Assignment 		:		22 June 2019
 */
package com.API_Testing.TestCasesScripts;
import com.API_Testing.commoncontrollers.HTTP_MethodsControllers;
import com.API_Testing.utitlites.AlltypeDataRead;
import org.junit.After;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class TestPOSTRequest extends HTTP_MethodsControllers {
	public String createData;
	Response res;
	@BeforeMethod
	public void setBody(){
		createData= AlltypeDataRead.readJsonFile("userPayload.json").toString();
	}
	@Test
	public void postData(){
		res= POST_Method(createData, pr.getProperty("endurl"));

		System.out.println("insert data is : "+res.prettyPrint());
	}

	@AfterMethod
	public void validateStatusCode(){
		Assert.assertEquals(res.getStatusCode(), 201);
	}
}
