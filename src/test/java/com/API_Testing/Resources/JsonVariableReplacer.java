/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 08-Oct-2019
 *  FILE NAME  		: 	 JsonVariableReplacer.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.Resources;

import java.io.FileNotFoundException;
import java.util.regex.Pattern;

public class JsonVariableReplacer
{
	public static void replaceVariable(String jsonBody, String expectedVariable, String replacement)
	{
		jsonBody=jsonBody.replaceAll(Pattern.quote(expectedVariable), replacement);	
	}
	
	

}
