/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 06-Oct-2019
 *  FILE NAME  		: 	 TC_11_AddValueInExsitingData.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.TestScripts;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import org.json.JSONObject;
import com.API_Testing.Payloads.AlltypeDataRead;
import com.API_Testing.utilities.UpdateExitingJSON;

public class TC_11_AddValueInExsitingData 
{
	@Test
	public void addValueExsitingData() throws FileNotFoundException {
		
		JSONObject jsondummydata= AlltypeDataRead.readJsonFile("../RestAPI_Automation_Framwork/src/test/java/com/API_Testing/Resources/dummyJsonForkey.json");
		
		String UpdatedJsonFileData= UpdateExitingJSON.fetchAndUdateData(jsondummydata.toString(), "phoneNumbers", "type", "home", "emailId", "dummy@gmai.com");
		
		System.out.println("#######---TC_11---Expected Data###########\n");
		
		System.out.println(UpdatedJsonFileData);
		
		
	}

}
