/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 06-Oct-2019
 *  FILE NAME  		: 	 TestGetValueByKeyFromJson.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.TestCasesScripts.CommonFunctionalities;

import com.API_Testing.utilities.MasterController;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;

/****Test case for fetch the data as per given key******/
public class TestGetValueByKeyFromJson {
	
	@Test
	public void fetchValuedata() throws JSONException {
		JSONObject jsondummydata= MasterController.readJsonFile("dummyJsonForKey.json");
		System.out.println("The Data is \t:\t"+ MasterController.fetchDataFromJSON(jsondummydata.toString(), "phoneNumbers", "type", "iPhone", "number"));
	}

}
