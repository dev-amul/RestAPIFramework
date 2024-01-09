/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 06-Oct-2019
 *  FILE NAME  		: 	 JsonResourceFetch.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.commoncontrollers;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonResourceFetch{
	public static String fetchDatafromJSON(String jsonBody, String srcArrKey, String srhKey, String srhValue, String gtExtData) throws JSONException {
		JSONObject jsonData = new JSONObject(jsonBody);
		JSONArray getArray = jsonData.getJSONArray(srcArrKey);
		JSONObject getObject=null;
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
