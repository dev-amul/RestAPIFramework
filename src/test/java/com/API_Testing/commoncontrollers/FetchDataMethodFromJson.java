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
import org.json.JSONException;
import org.json.JSONObject;

import com.API_Testing.utitlites.AllTypeDataRead;

public class FetchDataMethodFromJson {
	public static String getValueFromJson(String srhObj, String srhArray, String srchArray, String srchKey, String srchValu, String gtExtData) throws FileNotFoundException{
		JSONObject jsonBody = AllTypeDataRead.readJsonFile("CoremrkData.json");
		JSONObject fetchedObject= jsonBody.getJSONObject(srhObj);//get the first Object value because jSon starting from jSon
		JSONArray getOptionalArr= fetchedObject.optJSONArray(srhArray);//here i'm assume as array but get the key value  
		JSONObject getNewObject = null; 
		for(int i=0; i<getOptionalArr.length(); i++) {
			JSONObject getNextObj = getOptionalArr.getJSONObject(i);
			JSONArray newArray = getNextObj.getJSONArray(srchArray);
				for(int j=0 ; j<newArray.length(); j++) {
					 getNewObject = newArray.getJSONObject(j);
					if(getNewObject.get(srchKey).equals(srchValu)){
						break; 
					}
				}
		}
		return  getNewObject.get(gtExtData).toString();
	}
	public static String fetchDatafromJSON(String jsonBody, String srcArrKey, String srhKey, String srhValue, String gtExtData) throws JSONException {
		JSONObject jsonData = new JSONObject(jsonBody);
		JSONArray getArray = jsonData.getJSONArray(srcArrKey);
		JSONObject getObject=new JSONObject();
		for (int i=0 ; i<getArray.length(); i++) {
			getObject = getArray.getJSONObject(i);
			for(int j=0; j<getObject.length(); j++){
				if(getObject.get(srhKey).equals(srhValue)) {
					break;
				}
			}

		}
		return  getObject.get(gtExtData).toString();

	}

}
