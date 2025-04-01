/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 06-Oct-2019
 *  FILE NAME  		: 	 TestAddValueInExistingData.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.TestCasesScripts.CommonFunctionalities;

import java.io.FileNotFoundException;

import com.API_Testing.utilities.MasterController;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class TestAddValueInExistingData {
	@Test
	public void addValueExistingData() throws FileNotFoundException {
		
		JSONObject jsondummydata= MasterController.readJsonFile("dummyJsonForKey.json");
		System.out.println("####### Json file data before adding any data ###########\n");

		MasterController.convertStringJsonIntoJsonFormat(jsondummydata.toString());
		String str= MasterController.fetchAndUpdateData(jsondummydata.toString(), "phoneNumbers", "type", "home", "emailId", "dummy@gmai.com");
		System.out.println("#######Expected Data###########\n");
		MasterController.convertStringJsonIntoJsonFormat(str);
	}
}
