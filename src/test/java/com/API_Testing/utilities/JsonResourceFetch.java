/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 06-Oct-2019
 *  FILE NAME  		: 	 JsonResourceFetch.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

/************generic method for fetch the data as per pass key. **************/
public class JsonResourceFetch
{
	//Method fetch data as per key from json file. JSON must be start from array. 
	public static String fetchDatafromJSON(String jsonBody, String srcArrKey, String srhKey, String srhValue, String gtExtData) 
	{
		JSONObject jsonData = new JSONObject(jsonBody);				// Get the jSon body and store in jSon object 
		JSONArray getArray = jsonData.getJSONArray(srcArrKey);		//Fetch the array value on behalf search key and store in array variable 
		JSONObject getObject=null;									//Taking here one more jSON Object variable for further use
		for (int i=0 ; i<getArray.length(); i++) 					//run the loop end of the array length
		{
			getObject = getArray.getJSONObject(i);					//get the all object inner on array 
			for(int j=0; j<getObject.length(); j++) 				//run the loop end of the object length 
			{
				if(getObject.get(srhKey).equals(srhValue)) 			// compare the value on behalf of key 
				{		
					break;											//exit from the loop
				}
			}
		}
		//get the expected data on behalf search key and value and store in jSon object variable which i taking and  before run the loop and convert in string  data type
		return  getObject.get(gtExtData).toString();	
	}

}
