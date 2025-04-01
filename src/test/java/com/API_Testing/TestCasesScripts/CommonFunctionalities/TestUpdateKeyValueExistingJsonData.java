/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 15-Sep-2019
 *  FILE NAME  		: 	 TestUpdateKeyValueExistingJsonData.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 10:09:05 am
 */
package com.API_Testing.TestCasesScripts.CommonFunctionalities;

import com.API_Testing.utilities.MasterController;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class TestUpdateKeyValueExistingJsonData {

	@Test
	public void testUpdateExistingJSONData(){
		JSONObject getJSonData = MasterController.readJsonFile("dummyJsonForKey.json");
		JSONObject getkey =  getJSonData.getJSONObject("address");
		JSONObject updateData = getkey.put("streetAddress", "Sector 49 Noida");
		System.out.println(updateData);
		}
		
	

}
