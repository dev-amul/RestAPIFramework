/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 06-Oct-2019
 *  FILE NAME  		: 	 TC_08_GetDatabyKey.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.TestCasesScripts;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import org.json.JSONObject;
import com.API_Testing.Payloads.AlltypeDataRead;
import com.API_Testing.utilities.JsonResourceFetch;

/****Test case for fetch the data as per given key******/
public class TC_08_GetDatabyKey 
{
	
	@Test
	public void fetchValuedata() throws FileNotFoundException
	{
		//call the json file static method from the ALLtpeDataRead class and pass the json file.
		JSONObject jsondummydata= AlltypeDataRead.readJsonFile("../RestAPI_Automation_Framwork/src/test/java/com/API_Testing/Resources/dummyJsonForkey.json");

		System.out.println("##############---TC_08-Get Data key----#############\n");
		
		
		//Print the desire data 
		System.out.println("The Data is \t:\t"+JsonResourceFetch.fetchDatafromJSON(jsondummydata.toString(), "phoneNumbers", "type", "iPhone", "number"));
		
	}

}
