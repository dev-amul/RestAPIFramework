/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 08-Oct-2019
 *  FILE NAME  		: 	 GetjSOnObjectKey.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.Resources;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.json.JSONObject;
public class GetjSOnObjectKey
{
	public static void main(String[] args) throws FileNotFoundException
	{
		// Call the jSon file reader method 
		JSONObject storeJsonobj= AlltypeDataRead.readJsonFile("../RestAPI_Framework/DataFile/dynamicVariableBody.json");		
		
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
			String replacement=sc.next();
			jsonBody=jsonBody.replaceAll(Pattern.quote(getVariables), replacement);
			s3=jsonBody;
		}
		System.out.println("********** Json before replace the variable ********** \n"+storeJsonobj.toString());
		System.out.println("********** json after replace the variable  ********** \n"+s3);
	}
}
