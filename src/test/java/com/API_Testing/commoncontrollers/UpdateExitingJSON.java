/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 06-Oct-2019
 *  FILE NAME  		: 	 UpdateExitingJSON.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.commoncontrollers;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class UpdateExitingJSON {
	public static String fetchAndUpdateData(String jsonBody, String srcArrKey, String srhKey, String srhValue, String NewKey, String newValue) throws JSONException {
		// Get the JSON body and store in JSON object
		JSONObject jsonData = new JSONObject(jsonBody);
		//Fetch the array value on a behalf search key and store in array variable
		JSONArray getArray = jsonData.getJSONArray(srcArrKey);
		//Taking here one more JSON Object variable for further use
		JSONObject getObject=null;
		//run the loop end of the array length
		for (int i=0 ; i<getArray.length(); i++) {
			//get the all objects inner on an array
			getObject = getArray.getJSONObject(i);
			//run the loop end of the object length 
			for(int j=0; j<getObject.length(); j++) {
				// compare the value on behalf of a key
				if(getObject.get(srhKey).equals(srhValue)) {
					//add a new object in an existing object on data
					getObject.put(NewKey, newValue);
					break;
				}	
			}	
		}
		// here return the percent's data after update
		return  jsonData.toString();
	}
}
