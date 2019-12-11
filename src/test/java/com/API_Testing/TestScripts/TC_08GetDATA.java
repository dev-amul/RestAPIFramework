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

<<<<<<< HEAD
import com.API_Testing.utilities.AlltypeDataRead;
import com.API_Testing.utilities.FetchDataMethodFromJson;
import com.API_Testing.utilities.JsonResourceFetch;
=======
import com.API_Testing.Resources.AlltypeDataRead;
import com.API_Testing.Resources.JsonResourceFetch;
>>>>>>> 117778ca740fe583442d95d0ee765be00686ee8c

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
