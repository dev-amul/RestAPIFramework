/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 16-Sep-2019
 *  FILE NAME  		: 	 ResponseDataValidation.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.commoncontrollers;

import io.restassured.response.Response;

public class ResponseDataValidation {
	/***Methods for compare the status codes and return the result. **/
	public static void responseCodeValidation (int expectedStatusCode, int actualStatusCode) {
		
		if (expectedStatusCode==actualStatusCode){
			System.out.println("Expected Code is \t:\t "+expectedStatusCode);
			System.out.println("Actual Code is   \t:\t "+actualStatusCode);
			System.out.println("Expected Status code is successfully matching with actual");
			
		}else{
			System.out.println("Oopes your expected code is not matching with actual please check again");
		}
	}
	
	public static void responseTimeConfirmation (Response res){
		long timeGet = res.getTime();
		
				if(timeGet>0){
					System.out.println("Request Response time is"+timeGet);
				}else{
					System.out.println("Request response is not grreater than 0");
				}
	}
}
