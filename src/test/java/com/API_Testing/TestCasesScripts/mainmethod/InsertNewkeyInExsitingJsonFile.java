/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 15-Sep-2019
 *  FILE NAME  		: 	 InsertNewkeyInExsitingJsonFile.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 9:56:07 am
 */
package com.API_Testing.TestCasesScripts.mainmethod;

import java.io.FileNotFoundException;

import org.json.JSONArray;
import org.json.JSONObject;

import com.API_Testing.pojopayload.ReadJSonFile;

public class InsertNewkeyInExsitingJsonFile 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		// ReadjSon file method and store the response in JSon Object variable 
		JSONObject getJSonData = ReadJSonFile.readJSonFile();
		
		// get the object key where i add Or update the data 
		JSONObject getkey =  getJSonData.getJSONObject("address");
		
		// Create new key 
		JSONObject newData= getkey.put("State", "UP");
		
		// print the whole json again to view the updation 
		System.out.println(getJSonData);
		
		
	}

}
