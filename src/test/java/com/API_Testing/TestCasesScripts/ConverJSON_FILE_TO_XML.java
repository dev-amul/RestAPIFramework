/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 12-Jul-2019
 *  FILE NAME  		: 	 ConverJSON_FILE_TO_XML.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 12:48:08 am
 */
package com.API_Testing.TestCasesScripts;

import java.io.FileReader;
import java.io.IOException;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.XML;
import org.json.simple.parser.ParseException;

public class ConverJSON_FILE_TO_XML
{
	public static void main(String[] args) throws IOException, ParseException
	{
		FileReader readFile = new FileReader("../ResAssuredProject/myDetails.json");
		
		JSONTokener parseFile = new JSONTokener(readFile);
		
		JSONObject objJson = new JSONObject(parseFile);
		
		
		String s= XML.toString(objJson);
		
		System.out.println(s);
	}

	
	

}
