/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 08-Oct-2019
 *  FILE NAME  		: 	 ReplaceVariablesValuesAsperkeys.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.Resources;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.json.JSONObject;
public class ReplaceVariablesValuesAsperkeys
{
	public static String replaceVariablesAsPerKeys(String jsonFileURL, String enterReplacementValues) throws FileNotFoundException
	{
		// Call the jSon file reader method 
		JSONObject storeJsonobj= AlltypeDataRead.readJsonFile(jsonFileURL);		
		
		Iterator getjSOnKeys= storeJsonobj.keys();
		
		String jsonBody = storeJsonobj.toString();
		
		String s3=null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter replacement values as correspondence to variables");
		
		while(getjSOnKeys.hasNext()) 
		{
			String jSonKeys=getjSOnKeys.next().toString();
			String getVariables=storeJsonobj.getString(jSonKeys).toString();
		//	System.out.println(s1);
			System.out.print(jSonKeys+"\t:\t");			
			enterReplacementValues=sc.next();
			jsonBody=jsonBody.replaceAll(Pattern.quote(getVariables), enterReplacementValues);
			s3=jsonBody;
		}
		System.out.println("********** Json before replace the variable ********** \n"+storeJsonobj.toString());
		System.out.println("********** json after replace the variable  ********** \n");
		
		return s3;
	}
}
