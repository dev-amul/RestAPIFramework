/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 14-Sep-2019
 *  FILE NAME  		: 	 testExtractSingleKeyValueFromJSON.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 10:59:58 pm
 */
package com.API_Testing.TestCasesScripts.CommonFunctionalities;

import com.API_Testing.utilities.MasterController;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestExtractSingleKeyValueFromJSON {
	JSONObject jsonFileData;
	String expectedValue;
	@BeforeMethod
	public void readJsonFile(){
		jsonFileData = MasterController.readJsonFile("DataAppend.json");

	}
	@Test
	public void fetchValueByKey() {
		JSONArray getArray= jsonFileData.getJSONArray("phoneNumbers");
		JSONObject getObject= getArray.getJSONObject(0);

		expectedValue=getObject.get("type")+" : "+getObject.get("number");
	}

	@AfterMethod
	public void validateFetchedValue(){
		Assert.assertEquals(expectedValue, "personal : 9958758596");
	}

}
