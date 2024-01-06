/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 01-Sep-2019
 *  FILE NAME  		: 	 BodyCreation_JSSONObject.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 5:26:26 pm
 */
package com.BodyCreation.OrgJson;

import org.json.JSONArray;
import org.json.JSONObject;

public class BodyCreation_JSSONObject{
	public static void main(String[] args) {
		JSONObject jsobj = new JSONObject();
		
		jsobj.put("First_Name", "Sumit ");
		jsobj.put("Last_name", "Kumar");
		jsobj.put("Last_name", "Chaudhary");
		
		//put method create new value correspondence of the define key. And the key is already available then it overide the 
		//value
		
		JSONArray jsArray = new JSONArray();
		
	//	jsArray.put(jsobj);
		
		jsArray.put(0, "Basic Information");
		jsArray.put(1, jsobj);
		
		String body = jsArray.toString();
		
		System.out.println(body);
	}

}
