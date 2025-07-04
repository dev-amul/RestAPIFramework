/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 15-Sep-2019
 *  FILE NAME  		: 	 TestExtractMultiplekeyValueFromJson.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 9:29:00 am
 */
package com.API_Testing.TestCasesScripts.CommonFunctionalities;

import com.API_Testing.utilities.MasterController;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class TestExtractMultiplekeyValueFromJson {

	@Test
	public void fetchKeyValue(){
		JSONObject jsonFileData = MasterController.readJsonFile("DataAppend.json");
		JSONArray getArray = jsonFileData.getJSONArray("phoneNumbers");
		for(int i=0; i<getArray.length(); i++) {
			JSONObject getObject = getArray.getJSONObject(i);

			System.out.println("Get the Phone number \n \n" + getObject.get("type") + " : " + getObject.get("number") + "\n");
		}
	}
}
