/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 15-Sep-2019
 *  FILE NAME  		: 	 InsertNewArrayDataIn_ExisitingjSonData.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 10:31:56 am
 */
package com.API_Testing.TestCasesScripts.mainmethod;

import java.io.FileNotFoundException;

import org.json.JSONArray;
import org.json.JSONObject;

import com.API_Testing.pojopayload.ReadJSonFile;

public class InsertNewArrayDataIn_ExisitingjSonData {
	public static JSONArray newObjectData (){
		JSONArray newArrayData = new JSONArray();
		
		JSONObject myVehicle =new JSONObject();
		
		myVehicle.put("Vehicle Type ", "Car");
		myVehicle.put("Vehicle Nuber ", "UP 16 DC 1234");
		myVehicle.put("Vehicle Colour", "Red & Black");
		
		
		JSONObject educationInfo =new JSONObject();
		
		educationInfo.put("Highest Qualification", "MCA");
		educationInfo.put("Passout ", "2019");
		educationInfo.put("Certification", "JAVA Core & Advance");
		
		// Add both object value to array object 
		newArrayData.put(myVehicle);
		newArrayData.put(educationInfo);
		
		return newArrayData;
		
	}
	public static void main(String[] args) throws FileNotFoundException {
		// ReadjSon file method and store the response in JSon Object variable 
		JSONObject getExistingJSonData = ReadJSonFile.readJSonFile();
		
		// call the newdata method and store in jsonObject variable 
		JSONArray newInfo = newObjectData(); 
		
		// add new object Information 
		JSONObject addData= getExistingJSonData.put("user personal things ", newInfo);
		
		// print the whole json again to view the updation 
		//System.out.println(getExistingJSonData);
		
	}

}
