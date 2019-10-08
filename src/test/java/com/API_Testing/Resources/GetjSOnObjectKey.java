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
import org.json.JSONObject;
public class GetjSOnObjectKey
{
	public static void main(String[] args) throws FileNotFoundException
	{
		// Call the jSon file reader method 
		JSONObject storeJsonobj= AlltypeDataRead.readJsonFile("../RestAPI_Framework/DataFile/dynamicVariableBody.json");		
		
		Iterator arr= storeJsonobj.keys();
		
		String s=null;
		while(arr.hasNext()) 
		{
			s=arr.next().toString();
			System.out.println(s);
		}	
		 //return obj;
	}
}
