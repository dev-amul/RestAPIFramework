/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 08-Oct-2019
 *  FILE NAME  		: 	 ReplaceVariablesValuesAsPerKeys.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.commoncontrollers;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.regex.Pattern;

import org.json.JSONException;
import org.json.JSONObject;

import com.API_Testing.utitlites.AllTypeDataRead;

public class ReplaceVariablesValuesAsPerKeys {
	public static String replaceVariablesAsPerKeys(String jsonFileName, String enterReplacementValues) throws FileNotFoundException, JSONException {
		// Call the JSON file reader method
		JSONObject storeJsonobj= AllTypeDataRead.readJsonFile(jsonFileName);
		//Get the keys from JSON file and store in iterator Variable
		Iterator<String> getJSONKeys = storeJsonobj.keys();
		//Convert JSON data in string and store in variables.
		String jsonBody = storeJsonobj.toString();
		
		String s3=null;
		//Using scanner class for taking input from console for replace all values as per variable of the jSOn file 
		// Run the while loops to get all keys one by one
		while(getJSONKeys.hasNext()) {
			//stores all values in string variable
			String jSonKeys= getJSONKeys.next();
			//get variables from jSon data as per keys 
			String getVariables= storeJsonobj.getString(jSonKeys);
			
			System.out.print(jSonKeys+"\t:\t");	
			//Replace the variable values
			jsonBody=jsonBody.replaceAll(Pattern.quote(getVariables), enterReplacementValues);
			s3=jsonBody;
		}
		System.out.println("********** Json before replace the variable ********** \n");
		System.out.println(storeJsonobj);
		System.out.println("********** json after replace the variable  ********** \n");
		return s3;
	}
}
