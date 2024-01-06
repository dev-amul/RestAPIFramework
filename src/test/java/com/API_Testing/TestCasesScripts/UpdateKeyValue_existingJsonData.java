/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 15-Sep-2019
 *  FILE NAME  		: 	 UpdateKeyValue_existingJsonData.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 10:09:05 am
 */
package com.API_Testing.TestCasesScripts;

import java.io.FileNotFoundException;

import org.json.JSONObject;

import com.API_Testing.pojopayload.ReadJSonFile;

public class UpdateKeyValue_existingJsonData 
{
	
		public static void main(String[] args) throws FileNotFoundException 
		{
			// ReadjSon file method and store the response in JSon Object variable 
			JSONObject getJSonData = ReadJSonFile.readJSonFile();
			
			// get the object key where i add Or update the data 
			JSONObject getkey =  getJSonData.getJSONObject("address");
			
			// update new key 
			JSONObject updatedata= getkey.put("streetAddress", "Sector 49 Noida");
			
			// print the whole json again to view the updation 
			System.out.println(getJSonData);
			
			
		}
		
	

}
