/**
 * @author 			:	 Sumit chaudhary
 *	DATE       		:	 Dec 11, 2019
 *  FILE NAME  		: 	 TC_10_PostDataUsingPojo.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.TestScripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import com.API_Testing.Payloads.AlltypeDataRead;
import com.API_Testing.Resources.BodyPojo;
import com.API_Testing.ResponseValidation.ResponseDataValidation;
import com.API_Testing.TestStep_HTTP_Methods.HTTP_Methods;
import com.API_Testing.utilities.Load_PropertiestFile;
import com.API_Testing.utilities.ResponseDataparsing;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TC_10_PostDataUsingPojo 
{
	//Call the body pojo class which class for create a body to create 
	
	JSONObject jsonData;
	@BeforeMethod
	public void createPojoBody()
	{
		Random randomeNumber= new Random();   					// To generate random id
		Integer convertedIntegerID= randomeNumber.nextInt();	// convert the random number into integer. 
		
		BodyPojo pojoBodyEmployeeData = new BodyPojo(); // call body bojo class. Which is getter setter class
		pojoBodyEmployeeData.setId(convertedIntegerID.toString());
		pojoBodyEmployeeData.setEmployeeName("Sumit Chaudhary");
		pojoBodyEmployeeData.setEmployeGender("Male");
		pojoBodyEmployeeData.setEmployeProfession("Software Test Engineer");
		pojoBodyEmployeeData.setEmployeAge("29");
		pojoBodyEmployeeData.setAddress("Noida");
		
		jsonData= new JSONObject(pojoBodyEmployeeData);
	}
	@Test
	public void pojoPostTest() throws IOException {
		
		Properties pr = Load_PropertiestFile.getPropertyFile();
	
		// Call the Main class. 
		HTTP_Methods postMethod = new HTTP_Methods(pr);//call the method here 
				
		//Call the post method with help of HTTP_Methods class variable and pass the require paramerters.  
		Response response = postMethod.post_Request(jsonData.toString(), "baseURL", "endPointURI1");
				
		//fetch the id for further use and store the id in global variable
        System.out.println("##############----POST REQUEST RESPONSE DATA----#############\n");
		
        //compare the status code
		ResponseDataValidation.responseCodeValidation(201, response.getStatusCode());
		
		//Print the created data. 
		System.out.println("Response Data is \t:\t"+response.asString());
	}

}
