/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 06-Oct-2019
 *  FILE NAME  		: 	 TC_06_AddValueInExsitingData.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.TestCasesScripts.testng;

import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.API_Testing.commoncontrollers.UpdateExitingJSON;
import com.API_Testing.utitlites.AlltypeDataRead;

public class TC_06_AddValueInExsitingData 
{
	@Test
	public void addValueExsitingData() throws FileNotFoundException {
		
		JSONObject jsondummydata= AlltypeDataRead.readJsonFile("../RestAPI_Framework/DataFile/jsonBodydumm.json");
		
		String str= UpdateExitingJSON.fetchAndUdateData(jsondummydata.toString(), "phoneNumbers", "type", "home", "emailId", "dummy@gmai.com");
		
		System.out.println("#######Expected Data###########\n");
		
		System.out.println(str);
		
		
	}

}
