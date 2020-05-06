/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 06-Oct-2019
 *  FILE NAME  		: 	 UpdateExitingJSON.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

/**Method for add the data in existing JSON file **/
public class UpdateExitingJSON 
{
	public static String fetchAndUdateData(String jsonBody, String srcArrKey, String srhKey, String srhValue,String NewKey, String newValue) 
	{
		JSONObject jsonData = new JSONObject(jsonBody); 		 		// Get the jSon body and store in jSon object 
		JSONArray getArray = jsonData.getJSONArray(srcArrKey);			//Fetch the array value on behalf search key and store in array variable 
		JSONObject getObject=null;										//Taking here one more jSON Object variable for further use
		for (int i=0 ; i<getArray.length(); i++)					 	//run the loop end of the array length
		{		
			getObject = getArray.getJSONObject(i);						//get the all object inner on array 
			for(int j=0; j<getObject.length(); j++) 					//run the loop end of the object length 
			{ 
				if(getObject.get(srhKey).equals(srhValue)) 				// compare the value on behalf of key
				{	
					getObject.put(NewKey, newValue);					//add new object in existing object on data
					break;
				}	
			}	
		}		
		return  jsonData.toString();									// here return the percents data after update
	}
}
