/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 03-Dec-2019
 *  FILE NAME  		: 	 TC_08GetDATA.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.TestScripts;

import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.API_Testing.Resources.AlltypeDataRead;
import com.API_Testing.Resources.FetchDataMethodFromJson;
import com.API_Testing.Resources.JsonResourceFetch;

public class TC_08GetDATA {
	
	@Test
	public void fetchValuedata() throws FileNotFoundException
	{
		JSONObject jsondummydata= AlltypeDataRead.readJsonFile("../RestAPI_Framework/DataFile/CoremrkData.json");
		
		//String getDatafinal= FetchDataMethodFromJson.dataFetch(jsondummydata.toString(), "NotificationList", "keyValuePairList", "key", "AmountDue", "value");
		System.out.println("#######Expected Data###########\n");
		
		//System.out.println("The Data is \t:\t"+getDatafinal);
		
	}

}
