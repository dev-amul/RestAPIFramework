/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 14-Sep-2019
 *  FILE NAME  		: 	 ReadJSonFile.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 10:48:40 pm
 */
package com.API_Testing.TestCasesScripts.mainmethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class ReadJSonFile 
{
	public static JSONObject readJSonFile () throws FileNotFoundException
	{
		 
		// Here i directly using file inpout string class becouse this class request file object and 
		//file object provide file url . So directly i give the file path. 
		FileInputStream getJsonFile = new FileInputStream("../ResAssuredProject/DataAppend.json");
		
		// Here user JSONTokener to convert the file data as jSon format so be can get the object and array from the data. 
		JSONTokener parseFileData = new JSONTokener(getJsonFile);
		
		// Here my json data starting from object so i store the data in json array object. 
		JSONObject jsonData = new JSONObject(parseFileData);
		
		// Here i print the data. 
		return jsonData; 
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		JSONObject jsonData = readJSonFile();
		
		System.out.println(jsonData);
		
	}

}
