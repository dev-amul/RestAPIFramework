/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 14-Sep-2019
 *  FILE NAME  		: 	 ExtractSingleKey_value.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 10:59:58 pm
 */
package com.API_Testing.TestCasesScripts;

import java.io.FileNotFoundException;

import org.json.JSONArray;
import org.json.JSONObject;

import com.API_Testing.pojopayload.ReadJSonFile;

public class ExtractSingleKey_value {
	public static void main(String[] args) throws FileNotFoundException {
				//call the jsonRead file method and Store all response in his reference variable 
				JSONObject jsonFileData = ReadJSonFile.readJSonFile();
				
				//get the array from the jSon file 
				JSONArray getArray= jsonFileData.getJSONArray("phoneNumbers");
				
				//get the object from the jSon file 
				
				JSONObject getObject= getArray.getJSONObject(0);
			
				// Here i print the two key manually 
				
				System.out.println("Get the Phone numbers \n \n"+getObject.get("type")+" : "+getObject.get("number"));
	}

}
