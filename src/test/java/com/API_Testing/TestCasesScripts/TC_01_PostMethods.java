/**
 * @author 			:	 Sumit chaudhary
 *	DATE       		:	 March 30, 2020
 *  FILE NAME  		: 	 TC_01_PostMethods.java
 *  PROJECT NAME 	:	 restassuredautomation_framwork
 * 
 */
package com.API_Testing.TestCasesScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import com.API_Testing.ResponseValidation.ResponseDataValidation;
import com.API_Testing.TestStep_HTTP_Methods.HTTP_Methods;
import com.API_Testing.Utilites.Load_PropertiestFile;
import com.API_Testing.Utilites.ResponseDataparsing;

import io.restassured.response.Response;

/***Test case for Create data ***/
public class TC_01_PostMethods
{
	String idValue; //Global Variable 
	JSONObject body; //taking JSONObject for creating the body in json formate. 
	/***Create body to pass in post request***/
	@BeforeMethod
	public void jsonBody()
	{
		Random randomeNumber= new Random();   					// To generate random id
		Integer convertedIntegerID= randomeNumber.nextInt();	// convert the random number into integer. 

		//JSON body 
		body = new JSONObject(); 
		body.put("id", convertedIntegerID.toString());
		body.put("First Name", "Sumit");
		body.put("Last Name", "Kumar");
		body.put("Designation", "Software Test Engineer");
		body.put("Gender", "Male");
		body.put("Experience", "3 Years");
		body.put("Age", "29");
	}
	
	/** Methods for create the data**/
	@Test
	public void createData() throws IOException
	//public void createData() throws IOException
	{
		//Load the properties file and pass in to variable. 
		Properties pr = Load_PropertiestFile.getPropertyFile();
		
		// Call the Main class. 
		HTTP_Methods postMethod = new HTTP_Methods(pr);//call the method here 
		
		//Call the post method with help of HTTP_Methods class variable and pass the require paramerters.  
		Response response = postMethod.post_Request(body.toString(), "baseURL", "endPointURI1");
		
		//fetch the id for further use and store the id in global variable
		idValue=ResponseDataparsing.responseDataParse(response, "id"); 
		System.out.println("##############---TC_01-POST REQUEST RESPONSE DATA----#############\n");
		//compare the status code
		ResponseDataValidation.responseCodeValidation(201, response.getStatusCode());
		
		
		//Print the created data. 
		System.out.println("Response Data is \t:\t"+response.asString());
	}

}
