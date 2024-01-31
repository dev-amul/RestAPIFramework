/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 15-Sep-2019
 *  FILE NAME  		: 	 TestUpdateKeyValueexistingJsonData.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 10:09:05 am
 */
package com.API_Testing.TestCasesScripts;

import com.API_Testing.utitlites.AlltypeDataRead;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class TestUpdateKeyValueexistingJsonData {

	@Test
	public void testUpdateExistingJSONData(){
		JSONObject getJSonData = AlltypeDataRead.readJsonFile("DataAppend.json");
		JSONObject getkey =  getJSonData.getJSONObject("address");
		JSONObject updatedata= getkey.put("streetAddress", "Sector 49 Noida");
		System.out.println(getJSonData);
		}
		
	

}
