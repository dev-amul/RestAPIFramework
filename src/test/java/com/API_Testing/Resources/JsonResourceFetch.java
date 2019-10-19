/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 06-Oct-2019
 *  FILE NAME  		: 	 JsonResourceFetch.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.Resources;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonResourceFetch
{
	public static String fetchDatafromJSON(String jsonBody, String srcArrKey, String srhKey, String srhValue, String gtExtData) 
	{
		// Get the jSon body and store in jSon object 
		JSONObject jsonData = new JSONObject(jsonBody);
		
		//Fetch the array value on behalf search key and store in array variable 
		JSONArray getArray = jsonData.getJSONArray(srcArrKey);
		
		//Taking here one more jSON Object variable for further use
		
		JSONObject getObject=null;
		//run the loop end of the array length
		for (int i=0 ; i<getArray.length(); i++) {
				
			//get the all object inner on array 
			getObject = getArray.getJSONObject(i);
			//run the loop end of the object length 
			for(int j=0; j<getObject.length(); j++) 
			{
				// compare the value on behalf of key 
				if(getObject.get(srhKey).equals(srhValue)) {
					//exit from the loop
					break;
				}
				
			}
			
		}
		//get the expected data on behalf search key and value and store in jSon object variable which i taking and  before run the loop and convert in string  data type
		return  getObject.get(gtExtData).toString();
		
	}

}
