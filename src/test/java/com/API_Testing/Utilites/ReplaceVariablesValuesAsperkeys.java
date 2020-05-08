/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 08-Oct-2019
 *  FILE NAME  		: 	 ReplaceVariablesValuesAsperkeys.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.Utilites;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;
import org.json.JSONObject;
import com.API_Testing.Payloads.AlltypeDataRead;

/****** Method help to replace the value on dynamic json in place of variable {{variableName}} *******/
public class ReplaceVariablesValuesAsperkeys
{
	//Method use for replace the value on dynamic json file. 
	public static String replaceVariablesAsPerKeys(String jsonFileURL, String enterReplacementValues) throws FileNotFoundException
	{
		JSONObject storeJsonobj= AlltypeDataRead.readJsonFile(jsonFileURL);			// Call the jSon file reader method 
		Iterator getjSOnKeys= storeJsonobj.keys();									//Get the keys from from jSon file and store in iterator Variable
		String jsonBody = storeJsonobj.toString();									//Convert jSon data in string and store in variables.
		String s3=null;
		Scanner sc = new Scanner(System.in);					//Using scanner class for taking input from console for replace all values as per variable of the jSOn file 
		System.out.println("Enter replacement values as correspondence to variables");
		while(getjSOnKeys.hasNext()) 					// Run the while loops to get all keys one by one 
		{
			String jSonKeys=getjSOnKeys.next().toString();						//stores all values in string variable
			String getVariables=storeJsonobj.getString(jSonKeys).toString();	//get variables from jSon data as per keys 
			System.out.print(jSonKeys+"\t:\t");	
			enterReplacementValues=sc.next();     								//Taking  value from console as user per user input and storing in string variable 
			jsonBody=jsonBody.replaceAll(Pattern.quote(getVariables), enterReplacementValues); //Replace the variable values
			s3=jsonBody;
		}
		System.out.println("********** Json before replace the variable ********** \n");
		System.out.println(storeJsonobj.toString()); 										//print the actual json which we have 
		System.out.println("********** json after replace the variable  ********** \n");
		return s3;																			//Return the actual json after replace their values 
	}
}
