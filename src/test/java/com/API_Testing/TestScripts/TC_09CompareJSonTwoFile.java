/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 04-Dec-2019
 *  FILE NAME  		: 	 TC_09CompareJSonTwoFile.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.TestScripts;

import java.io.FileNotFoundException;

import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import com.API_Testing.utilities.AlltypeDataRead;


public class TC_09CompareJSonTwoFile 
{
	public static void main(String[] args) throws FileNotFoundException {
		
		
		String expectedJson = AlltypeDataRead.readJsonFile("../RestAPI_Framework/DataFile/CoremrkData.json").toString();
		String actualJson = AlltypeDataRead.readJsonFile("../RestAPI_Framework/DataFile/jsonBodydumm.json").toString();
		
		JSONAssert.assertEquals("Match", expectedJson, actualJson, JSONCompareMode.STRICT);
	}

}
