/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 15-Sep-2019
 *  FILE NAME  		: 	 TestExtractMultiplekeyValueFromJson.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 9:29:00 am
 */
package com.API_Testing.TestCasesScripts.CommonFunctionalities.Authentications.DataManupulations;

import com.API_Testing.utitlites.AllTypeDataRead;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class TestExtractMultiplekeyValueFromJson {

	@Test
	public void fetchKeyValue(){
		JSONObject jsonFileData = AllTypeDataRead.readJsonFile("DataAppend.json");
		JSONArray getArray = jsonFileData.getJSONArray("phoneNumbers");
		for(int i=0; i<getArray.length(); i++) {
			JSONObject getObject = getArray.getJSONObject(i);

			System.out.println("Get the Phone number \n \n" + getObject.get("type") + " : " + getObject.get("number") + "\n");
		}
	}
}
