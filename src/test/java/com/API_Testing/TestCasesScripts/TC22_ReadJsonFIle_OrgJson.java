/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 13-Jul-2019
 *  FILE NAME  		: 	 TC22_ReadJsonFIle_OrgJson.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 2:38:32 pm
 */
package com.API_Testing.TestCasesScripts;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.XML;

public class TC22_ReadJsonFIle_OrgJson 
{
	public static void main(String[] args) throws FileNotFoundException {
		FileReader readFile = new FileReader("../ResAssuredProject/myDetails.json");
		
		JSONTokener parseFile = new JSONTokener(readFile);
		
		JSONObject objJson = new JSONObject(parseFile);
		
		
		String s= XML.toString(objJson);
		
		System.out.println(s);
	}

}
