/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 03-Dec-2019
 *  FILE NAME  		: 	 FetchDataMethodFromJson.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.Resources;

import java.io.FileNotFoundException;
import java.util.Objects;

import org.json.JSONArray;
import org.json.JSONObject;

public class FetchDataMethodFromJson 

{
	public static void main(String[] args) throws FileNotFoundException
	{
		JSONObject jsonBody = AlltypeDataRead.readJsonFile("../RestAPI_Framework/DataFile/CoremrkData.json");
		
		JSONObject fetchedObject= jsonBody.getJSONObject("Request");
		
		JSONArray getOptionalArr= fetchedObject.optJSONArray("NotificationList");
		
		for(int i=0; i<getOptionalArr.length(); i++)
		{
			JSONObject getNextObj = getOptionalArr.getJSONObject(i);
			
			JSONArray newArray = getNextObj.getJSONArray("keyValuePairList");
				//System.out.println(newArray.toString());
				
				for(int j=0 ; j<newArray.length(); j++)
				{
					JSONObject getNewObject = newArray.getJSONObject(j);
					
					if(getNewObject.get("key").equals("AmountDue"))
					{
						System.out.println(getNewObject.get("value").toString());
					}
				}
		}
		
	}

}
