/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 13-Jul-2019
 *  FILE NAME  		: 	 AppendData_InJson.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 2:43:57 pm
 */
package com.API_Testing.TestCasesScripts.mainmethod;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class AppendData_InJson 
{
	public static void main(String[] args) throws FileNotFoundException {
		FileReader readFile = new FileReader("../ResAssuredProject/DataAppend.json");
		
		JSONTokener parseData = new JSONTokener(readFile);
		
		JSONObject storeObj = new JSONObject(parseData);
		
		
		JSONArray phoneNumbers= storeObj.getJSONArray("phoneNumbers");
		
		JSONObject phoneNumber= phoneNumbers.getJSONObject(1);
		
	//	System.out.println(phoneNumber.toString());
		
		phoneNumber.put("Mobile_number", "9971458090");
		
		
		/*
		 * phoneNumbers.remove(1);
		 * 
		 * phoneNumbers.put(1,phoneNumber); storeObj.remove("phoneNumbers");
		 * 
		 * storeObj.put("phoneNumbers", phoneNumbers);
		 * 
		 */
		
		System.out.println(storeObj.toString());
	}

}
