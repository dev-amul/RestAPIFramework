/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 15-Sep-2019
 *  FILE NAME  		: 	 InsertNewObject_ExistingjSondata.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 10:13:27 am
 */
package com.API_Testing.TestCasesScripts.mainmethod;

import java.io.FileNotFoundException;

import org.json.JSONObject;

import com.API_Testing.pojopayload.ReadJSonFile;

public class InsertNewObject_ExistingjSondata {
	public static JSONObject newObjectData (){
		JSONObject newInformation =new JSONObject();
		
		newInformation.put("Hobbies ", "I fond of play badminton & cricket");
		newInformation.put("Experience ", "2.6 Years");
		newInformation.put("Interest ", "Learn skills for groom my knowledge");
		newInformation.put("Programing Skills", "Java, Groovy & Basic of python");
		newInformation.put("Database", "Experties in MySql & Basic in Oracle");
		
		return newInformation;
		
	}
	public static void main(String[] args) throws FileNotFoundException {
		// ReadjSon file method and store the response in JSon Object variable 
		JSONObject getExistingJSonData = ReadJSonFile.readJSonFile();
		
		// call the newdata method and store in jsonObject variable 
		JSONObject newInfo = newObjectData(); 
		
		// add new object Information 
		JSONObject addData= getExistingJSonData.put("Other Important Information ", newInfo);
		
		// print the whole json again to view the updation 
		System.out.println(getExistingJSonData);
		
		
	}
	

}
