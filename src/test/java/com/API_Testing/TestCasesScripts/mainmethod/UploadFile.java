/**
 * @author 			:	 SumitChaudhary
 *	DATE       		:	 10-Jun-2023
 *  FILE NAME  		: 	 UploadFile.java
 *  PROJECT NAME 	:	 RestAPIBasicFunctionalities
 *  Time			:	 8:14:00 pm
 */
package com.API_Testing.TestCasesScripts.mainmethod;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UploadFile {
	public static void main(String[] args) {
		File file=new File("../RestAPIBasicFunctionalities/src/test/java/com/InterviewPratice/Java_Projects_for_Beginners.jpg");
		//http://the-internet.herokuapp.com/upload
		Response res=RestAssured
				.given()
				.multiPart("file", file, "multipart/form-data")
				.post("https://the-internet.herokuapp.com/upload")
				.thenReturn();
		
		System.out.println(res.prettyPrint());
		
	}

}
