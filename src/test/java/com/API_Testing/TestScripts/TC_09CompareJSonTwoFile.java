/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 04-Dec-2019
 *  FILE NAME  		: 	 TC_09CompareJSonTwoFile.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.TestScripts;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;

import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

import com.API_Testing.utilities.AlltypeDataRead;


public class TC_09CompareJSonTwoFile 
{
	@Test
	public  void comparetoJson() throws FileNotFoundException {
		
		
		String expectedJson = AlltypeDataRead.readJsonFile("../restassuredautomation_framwork/src/test/java/com/API_Testing/Resources/EmployeeAddress.json").toString();
		String actualJson = AlltypeDataRead.readJsonFile("../restassuredautomation_framwork/src/test/java/com/API_Testing/Resources/EmployeeAddress.json").toString();
		
		JSONAssert.assertEquals("Match", expectedJson, actualJson, JSONCompareMode.STRICT);
	}

}
