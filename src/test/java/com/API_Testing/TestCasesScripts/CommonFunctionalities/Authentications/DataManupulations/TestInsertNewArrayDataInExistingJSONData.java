/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 15-Sep-2019
 *  FILE NAME  		: 	 TestInsertNewArrayDataInExistingJSONData.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 10:31:56 am
 */
package com.API_Testing.TestCasesScripts.CommonFunctionalities.Authentications.DataManupulations;

import com.API_Testing.utitlites.AllTypeDataRead;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestInsertNewArrayDataInExistingJSONData {
	JSONArray newArrayData;
	@BeforeMethod
	public void createArrayPayload(){
		newArrayData = new JSONArray();
		JSONObject myVehicle =new JSONObject();
		myVehicle.put("Vehicle Type ", "Car");
		myVehicle.put("Vehicle Nuber ", "UP 16 DC 1234");
		myVehicle.put("Vehicle Colour", "Red & Black");

		JSONObject educationInfo =new JSONObject();
		educationInfo.put("Highest Qualification", "MCA");
		educationInfo.put("Passout ", "2019");
		educationInfo.put("Certification", "JAVA Core & Advance");
		
		// Add both object values to an array object
		newArrayData.put(myVehicle);
		newArrayData.put(educationInfo);

	}
	@Test
	public void appendArrayInExistingJSON(){
		JSONObject getExistingJSonData = AllTypeDataRead.readJsonFile("DataAppend.json");
		System.out.println(getExistingJSonData);
		JSONArray newInfo =  newArrayData;
		JSONObject addedData= getExistingJSonData.put("user personal things ", newInfo);
		System.out.println("\n######################\n");
		System.out.println(addedData);
	}

}
