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
	public static JSONObject readJsonFile (String fileURL) throws FileNotFoundException 
	{
		FileReader getFile = new FileReader(fileURL);
		
		JSONTokener parseFileToJSOn = new JSONTokener(getFile);
		
		JSONObject convertToJSonObject = new JSONObject(parseFileToJSOn);
		
		return convertToJSonObject;
		
		 
	}
	
    public static void xmlFileRead (String fileURL) throws FileNotFoundException
    {
    	
		FileReader readFile = new FileReader(fileURL);
		
    	
    }

}
