/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 08-Oct-2019
 *  FILE NAME  		: 	 GetjSOnObjectKey.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.Resources;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONObject;
public class GetjSOnObjectKey
{
	public static String getKeyobjectFromJsondata() throws FileNotFoundException
	{
		// Call the jSon file reader method 
		JSONObject storeJsonobj= AlltypeDataRead.readJsonFile("../RestAPI_Framework/DataFile/dynamicVariableBody.json");		
		
		//Take the set type to store key without any null and no duplicates 
		Set<String> hash_Set = new HashSet<String>();
		
		// Run the while loop end the jSon data length
		int i=0;
		while(i<storeJsonobj.length())
		{
			// Get the key and store in set object 
			hash_Set= storeJsonobj.keySet();
			break;
		}
		// taking iterator for getting all element from the hash_Set array one by one
		Iterator bodyVariable = hash_Set.iterator();
		String obj=null; 
		System.out.println("********************** Keys and Variables from the json body *******************************\n");
		// Run while loop for getting array elements one by one. 
		while(bodyVariable.hasNext())
		{
			//Store all array elements in string variables 
			String 	storeKey=bodyVariable.next().toString();
			//Store all variable in string 
			obj=storeJsonobj.getString(storeKey);
			System.out.println(storeKey	+ "\t : \t"+obj);	
		}
		return obj;
	}
	public static void main(String[] args) throws FileNotFoundException {
		getKeyobjectFromJsondata();
	}
}
