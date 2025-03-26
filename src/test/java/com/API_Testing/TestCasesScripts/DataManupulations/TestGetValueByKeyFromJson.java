/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 06-Oct-2019
 *  FILE NAME  		: 	 TestGetValueByKeyFromJson.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.TestCasesScripts.DataManupulations;

import com.API_Testing.commoncontrollers.FetchDataMethodFromJson;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;
import com.API_Testing.utitlites.AlltypeDataRead;

/****Test case for fetch the data as per given key******/
public class TestGetValueByKeyFromJson {
	
	@Test
	public void fetchValuedata() throws JSONException {
		JSONObject jsondummydata= AlltypeDataRead.readJsonFile("dummyJsonForkey.json");
		System.out.println("The Data is \t:\t"+ FetchDataMethodFromJson.fetchDatafromJSON(jsondummydata.toString(), "phoneNumbers", "type", "iPhone", "number"));
	}

}
