/**
 * @author 			:	 Sumit chaudhary
 *	DATE       		:	 March 30, 2020
 *  FILE NAME  		: 	 TC_01_PostMethods.java
 *  PROJECT NAME 	:	 restassuredautomation_framwork
 * 
 */
package com.API_Testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import org.json.JSONObject;
import com.API_Testing.TestStepts.HTTP_Methods;
import com.API_Testing.utilities.Laod_PropertiestFile;
import com.API_Testing.utilities.ResponseDataparsing;
import io.restassured.response.Response;
public class TC_01_PostMethods
{
	static String idValue; //Global Variable 
	public JSONObject employeeData() //body payload
	{
		JSONObject body = new JSONObject(); 
		body.put("id", "EMP_05");
		body.put("First Name", "Sachin");
		body.put("Last Name", "Teotiar");
		body.put("Designation", "Self Employeed");
		body.put("Gender", "Male");
		body.put("Experience", "4 Years");
		body.put("Age", "28");
		return body;
	}
	public void createData() throws IOException// Methods for create a data on json file. 
	//public void createData() throws IOException
	{
		Properties pr = Laod_PropertiestFile.getPropertyFile();
		HTTP_Methods postMethod = new HTTP_Methods(pr);
		TC_01_PostMethods dataBody = new TC_01_PostMethods();//create a class object 
		//call the post method and pass the body payload using class reference variable 
		Response response = postMethod.post_Request(dataBody.employeeData().toString(), "baseURL", "endPointURI1");
		idValue=ResponseDataparsing.responseDataParse(response, "id");//store the data id in global variable 
		System.out.println("##############----POST REQUEST RESPONSE CODE----#############\n");
		System.out.println(response.statusCode());//pring the Post method status code
		System.out.println("##############----Posted Data id is----#############\n");
		System.out.println("Data Id "+idValue);//Print data id to evaluate is correct or not 
		System.out.println("##############----POST REQUEST RESPONSE DATA----#############\n");
		System.out.println("Response Data is \t:\t"+response.asString());//Print the json which is saved on data file 
	}

}
