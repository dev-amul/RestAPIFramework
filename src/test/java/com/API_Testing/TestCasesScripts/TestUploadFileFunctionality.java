/**
 * @author 			:	 SumitChaudhary
 *	DATE       		:	 10-Jun-2023
 *  FILE NAME  		: 	 TestUploadFileFunctionality.java
 *  PROJECT NAME 	:	 RestAPIBasicFunctionalities
 *  Time			:	 8:14:00 pm
 */
package com.API_Testing.TestCasesScripts;

import java.io.File;
import com.API_Testing.utitlites.MasterController;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestUploadFileFunctionality {
	File file;
	int res;
	@BeforeMethod
	public void loadImageFile(){
		file=new File(MasterController.getAbsolutPath("Java_Projects_for_Beginners.jpg"));
	}
	@Test
	public void checkUpload() {
	res=RestAssured
				.given()
				.multiPart("file", file, "multipart/form-data")
				.post("https://the-internet.herokuapp.com/upload")
				.thenReturn()
				.statusCode();
	}
	@AfterMethod
	public void validateUploadFileResponseStatusCode(){
		Assert.assertEquals(res,200);
	}

}
