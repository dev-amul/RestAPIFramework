/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 15-Sep-2019
 *  FILE NAME  		: 	 TestInsertNewObjectINExistingJSONdata.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 10:13:27 am
 */
package com.API_Testing.TestCasesScripts.DataManupulations;

import com.API_Testing.utitlites.AllTypeDataRead;
import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestInsertNewObjectINExistingJSONdata {
	JSONObject newInformation;
	@BeforeMethod
	public void  newObjectData(){
		newInformation =new JSONObject();
		newInformation.put("Hobbies ", "I fond of play badminton & cricket");
		newInformation.put("Experience ", "2.6 Years");
		newInformation.put("Interest ", "Learn skills for groom my knowledge");
		newInformation.put("Programing Skills", "Java, Groovy & Basic of python");
		newInformation.put("Database", "Experties in MySql & Basic in Oracle");

	}
	@Test
	public void testInsertObjectAddFlow() {
		JSONObject getExistingJSonData = AllTypeDataRead.readJsonFile("DataAppend.json");
		JSONObject newInfo = newInformation;
		JSONObject addData= getExistingJSonData.put("Other Important Information ", newInfo);
		System.out.println(getExistingJSonData);

	}
}
