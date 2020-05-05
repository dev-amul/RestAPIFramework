/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 06-Oct-2019
 *  FILE NAME  		: 	 AlltypeDataRead.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.utilities;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.XML;

import io.restassured.RestAssured;

public class AlltypeDataRead 
{
	//Methods for read json file 
	public static JSONObject readJsonFile (String fileURL) throws FileNotFoundException 
	{
		FileReader getFile = new FileReader(fileURL);//fetch the json file as per given path
		
		JSONTokener parseFileToJSOn = new JSONTokener(getFile);//parse the string data in to json format. Because file get the data in string format. 
		
		JSONObject convertToJSonObject = new JSONObject(parseFileToJSOn);// convert to the json object. 
		
		return convertToJSonObject;		//return the data  
	}
	
  

}
