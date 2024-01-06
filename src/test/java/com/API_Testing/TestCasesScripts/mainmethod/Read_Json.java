/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 11-Jul-2019
 *  FILE NAME  		: 	 Read_Json.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 9:48:30 pm
 */
package com.API_Testing.TestCasesScripts.mainmethod;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.*;


public class Read_Json 
{
	public static void main(String[] args) throws IOException, ParseException 
	{
		JSONParser jsoPars = new JSONParser();
		
		File filePath = new File("../ResAssuredProject/myDetails.json");
		
		FileReader read = new FileReader(filePath);
		
		JSONObject parsJosn= (JSONObject) jsoPars.parse(read);
		
		System.out.println(parsJosn.toString());
		
	}

}
