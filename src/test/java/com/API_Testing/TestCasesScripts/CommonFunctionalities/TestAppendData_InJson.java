/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 13-Jul-2019
 *  FILE NAME  		: 	 TestAppendData_InJson.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 2:43:57 pm
 */
package com.API_Testing.TestCasesScripts.CommonFunctionalities;

import com.API_Testing.utilities.MasterController;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class TestAppendData_InJson {
	@Test
	public void addNewData() {
		JSONArray phoneNumbers= MasterController.readJsonFile("dummyJsonForKey.json").getJSONArray("phoneNumbers");
		JSONObject phoneNumber= phoneNumbers.getJSONObject(1);
		phoneNumber.put("Mobile_number", "12345678910");
		/*
		 * phoneNumbers.remove(1);
		 * 
		 * phoneNumbers.put(1,phoneNumber); storeObj.remove("phoneNumbers");
		 * 
		 * storeObj.put("phoneNumbers", phoneNumbers);
		 * 
		 */
		
		System.out.println(phoneNumbers.toString());
	}

}
