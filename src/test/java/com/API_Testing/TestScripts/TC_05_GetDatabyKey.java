/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 06-Oct-2019
 *  FILE NAME  		: 	 TC_05_GetDatabyKey.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.API_Testing.utilities.AlltypeDataRead;
import com.API_Testing.utilities.JsonResourceFetch;

public class TC_05_GetDatabyKey 
{
	@Test
	public void fetchValuedata() throws FileNotFoundException
	{
		JSONObject jsondummydata= AlltypeDataRead.readJsonFile("/Users/docquity/git/restassuredautomation_framwork/src/test/java/com/API_Testing/Resources/dummyJsonForkey.json");
		
		String getDatafinal= JsonResourceFetch.fetchDatafromJSON(jsondummydata.toString(), "phoneNumbers", "type", "iPhone", "number");
		
		System.out.println("#######Expected Data###########\n");
		
		System.out.println("The Data is \t:\t"+getDatafinal);
		
	}

}
