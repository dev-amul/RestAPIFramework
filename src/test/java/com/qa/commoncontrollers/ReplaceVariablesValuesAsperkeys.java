/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 08-Oct-2019
 *  FILE NAME  		: 	 ReplaceVariablesValuesAsperkeys.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.qa.commoncontrollers;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.json.JSONException;
import org.json.JSONObject;

import com.qa.utitlites.AlltypeDataRead;

public class ReplaceVariablesValuesAsperkeys
{
	public static String replaceVariablesAsPerKeys(String jsonFileName, String enterReplacementValues) throws FileNotFoundException, JSONException {
		// Call the jSon file reader method 
		JSONObject storeJsonobj= AlltypeDataRead.readJsonFile(jsonFileName);
		//Get the keys from from jSon file and store in iterator Variable
		Iterator getjSOnKeys= storeJsonobj.keys();
		//Convert jSon data in string and store in variables.
		String jsonBody = storeJsonobj.toString();
		
		String s3=null;
		//Using scanner class for taking input from console for replace all values as per variable of the jSOn file 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter replacement values as correspondence to variables");
		// Run the while loops to get all keys one by one 
		while(getjSOnKeys.hasNext()) 
		{
			//stores all values in string variable
			String jSonKeys=getjSOnKeys.next().toString();
			//get variables from jSon data as per keys 
			String getVariables=storeJsonobj.getString(jSonKeys).toString();
			
			System.out.print(jSonKeys+"\t:\t");	
			//Taking 
			enterReplacementValues=sc.next();
			//Replace the variable values 
			jsonBody=jsonBody.replaceAll(Pattern.quote(getVariables), enterReplacementValues);
			s3=jsonBody;
		}
		System.out.println("********** Json before replace the variable ********** \n");
		System.out.println(storeJsonobj.toString());
		System.out.println("********** json after replace the variable  ********** \n");
		return s3;
	}
}
