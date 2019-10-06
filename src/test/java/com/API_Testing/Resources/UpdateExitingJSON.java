/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 06-Oct-2019
 *  FILE NAME  		: 	 UpdateExitingJSON.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.Resources;

import org.json.JSONArray;
import org.json.JSONObject;

public class UpdateExitingJSON 
{
	public static String fetchAndUdateData(String jsonBody, String srcArrKey, String srhKey, String srhValue,String NewKey, String newData) 
	{
		// Get the jSon body and store in jSon object 
		JSONObject jsonData = new JSONObject(jsonBody);
		
		//Fetch the array value on behalf search key and store in array variable 
		JSONArray getArray = jsonData.getJSONArray(srcArrKey);
		
		//Taking here one more jSON Object variable for further use
		
		JSONObject getObject=null;
		//run the loop end of the array length
		for (int i=0 ; i<getArray.length(); i++) 
		{		
			//get the all object inner on array 
			getObject = getArray.getJSONObject(i);
			//run the loop end of the object length 
			for(int j=0; j<getObject.length(); j++) 
			{
				// compare the value on behalf of key 
				if(getObject.get(srhKey).equals(srhValue)) 
				{
					//add new object in existing object on data
					getObject.put(NewKey, newData);
					break;
				}	
			}	
		}
		// here return the percents data after update		
		return  jsonData.toString();
	}
}
