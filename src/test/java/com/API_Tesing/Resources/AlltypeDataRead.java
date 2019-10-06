/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 06-Oct-2019
 *  FILE NAME  		: 	 AlltypeDataRead.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Tesing.Resources;


import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class AlltypeDataRead 
{
	public static JSONObject readJsonFile (String fileURL) throws FileNotFoundException 
	{
		FileReader getFile = new FileReader(fileURL);
		
		JSONTokener parseFileToJSOn = new JSONTokener(getFile);
		
		JSONObject convertToJSonObject = new JSONObject(parseFileToJSOn);
		
		return convertToJSonObject;
		
	}

}
