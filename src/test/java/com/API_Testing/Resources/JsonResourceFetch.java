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
	/**/
	public static String jsonBodysample = "{\n" + 
			"  \"firstName\": \"John\",\n" + 
			"  \"lastName\" : \"doe\",\n" + 
			"  \"age\"      : 26,\n" + 
			"  \"address\"  : {\n" + 
			"    \"streetAddress\": \"naist street\",\n" + 
			"    \"city\"         : \"Nara\",\n" + 
			"    \"postalCode\"   : \"630-0192\"\n" + 
			"  },\n" + 
			"  \"phoneNumbers\": [\n" + 
			"    {\n" + 
			"      \"type\"  : \"iPhone\",\n" + 
			"      \"number\": \"0123-4567-8888\"\n" + 
			"    },\n" + 
			"    {\n" + 
			"      \"type\"  : \"home\",\n" + 
			"      \"number\": \"0123-4567-8910\"\n" + 
			"    }\n" + 
			"  ]\n" + 
			"}";
	
	public static String fetchDatafromJSON(String jsonBody, String srcArrKey, String srhKey, String srhValue, String gtExtData) 
	{
		JSONObject jsonData = new JSONObject(jsonBody);
		
		JSONArray getArray = jsonData.getJSONArray(srcArrKey);
		
		for (int i=0 ; i<getArray.length(); i++) {
				
			JSONObject getObject = getArray.getJSONObject(i);
			
			for(int j=0; j<getObject.length(); j++) 
			{
				if(getObject.get(srhKey).equals(srhValue)) {
					
					String getExactData = getObject.get(gtExtData).toString();
					break;
				}
				
			}
			
		}
		return gtExtData;
		
	}
	
	public static void main(String[] args) 
	{
		String getDatafinal= fetchDatafromJSON(jsonBodysample, "phoneNumbers", "type", "iPhone", "number");
		
		System.out.println(getDatafinal);
		
	}
}
