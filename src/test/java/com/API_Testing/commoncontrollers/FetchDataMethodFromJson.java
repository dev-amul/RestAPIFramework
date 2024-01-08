/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 03-Dec-2019
 *  FILE NAME  		: 	 FetchDataMethodFromJson.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.commoncontrollers;

import java.io.FileNotFoundException;

import org.json.JSONArray;
import org.json.JSONObject;

import com.API_Testing.utitlites.AlltypeDataRead;

public class FetchDataMethodFromJson {
	public static String getValueFromJson(String srhObj, String srhArray, String srchArray, String srchKey, String srchValu, String gtExtData) throws FileNotFoundException{
		JSONObject jsonBody = AlltypeDataRead.readJsonFile("../RestAPI_Framework/DataFile/CoremrkData.json");
		JSONObject fetchedObject= jsonBody.getJSONObject(srhObj);//get the first Object value because jSon starting from jSon
		JSONArray getOptionalArr= fetchedObject.optJSONArray(srhArray);//here i'm assume as array but get the key value  
		JSONObject getNewObject = null; 
		for(int i=0; i<getOptionalArr.length(); i++)
		{
			JSONObject getNextObj = getOptionalArr.getJSONObject(i);
			
			JSONArray newArray = getNextObj.getJSONArray(srchArray);//get the next array which is under the previous  array
				//System.out.println(newArray.toString());
				
				for(int j=0 ; j<newArray.length(); j++)
				{
					 getNewObject = newArray.getJSONObject(j);
					
					if(getNewObject.get(srchKey).equals(srchValu))// enter the key and value so get the expected data 
					{
						break; 
					}
				}
		}
		return  getNewObject.get(gtExtData).toString();
	}
	/*
	public static void main(String[] args) throws FileNotFoundException{
		String expData= FetchDataMethodFromJson.getValueFromJson("Request", "NotificationList", "keyValuePairList", "key", "MobilePhoneNumber", "value");
		
		System.out.println(expData);
	}*/

}
