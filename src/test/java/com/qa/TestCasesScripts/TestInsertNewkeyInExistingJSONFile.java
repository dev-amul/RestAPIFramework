/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 15-Sep-2019
 *  FILE NAME  		: 	 TestInsertNewkeyInExistingJSONFile.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 9:56:07 am
 */
package com.qa.TestCasesScripts;

import com.qa.utitlites.AlltypeDataRead;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class TestInsertNewkeyInExistingJSONFile {
	@Test
	public  void testInsertNewKey() {
		JSONObject getJSonData = AlltypeDataRead.readJsonFile("DataAppend.json");
		JSONObject getkey =  getJSonData.getJSONObject("address");
		JSONObject newData= getkey.put("State", "UP");
		System.out.println(getJSonData);
	}
}
