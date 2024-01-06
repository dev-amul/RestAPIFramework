/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 15-Sep-2019
 *  FILE NAME  		: 	 ExtractMultiplekey.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 9:29:00 am
 */
package com.API_Testing.TestCasesScripts;

import java.io.FileNotFoundException;

import org.json.JSONArray;
import org.json.JSONObject;

import com.API_Testing.pojopayload.ReadJSonFile;

public class ExtractMultiplekey {

	public static void main(String[] args) throws FileNotFoundException {
		
		// Call the Readjsone file class method and store in jSon object to get furture information
		
		JSONObject jsonFileData = ReadJSonFile.readJSonFile();
		
		// get the array from the jSON file data 
		
		JSONArray getArray = jsonFileData.getJSONArray("phoneNumbers");
		
		//Run a loop for get the lenth of the array 
		for(int i=0; i<getArray.length(); i++)
		{
			// get the object value as per index 
			JSONObject getObject = getArray.getJSONObject(i);
			
			//Print all gets value
			System.out.println("Get the Phone number \n \n"+getObject.get("type")+" : "+getObject.get("number")+"\n");
		}
		
	}

}
