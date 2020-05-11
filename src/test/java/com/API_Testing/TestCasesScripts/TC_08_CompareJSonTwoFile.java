/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 04-Dec-2019
 *  FILE NAME  		: 	 TC_08_CompareJSonTwoFile.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.TestCasesScripts;

import org.testng.annotations.Test;
import com.API_Testing.Payloads.AlltypeDataRead;
import com.API_Testing.Utilites.APILOGCapture;

import java.io.FileNotFoundException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

/**Test Case for compare two JSON***/
public class TC_08_CompareJSonTwoFile 
{
	@Test
	public  void comparetoJson() throws FileNotFoundException {
		
		
		String expectedJson = AlltypeDataRead.readJsonFile("../RestAPIFramework/Resources/JSONforCompare1.json").toString();
		String actualJson = AlltypeDataRead.readJsonFile("../RestAPIFramework/Resources/JSONforCompare2.json").toString();
		System.out.println("##############---TC_08 Compare json----#############\n");
		
		JSONAssert.assertNotEquals("Match", expectedJson, actualJson, JSONCompareMode.STRICT);
		APILOGCapture.captureLog("TC_08_CompareJSON", "Both json file has compared");
	}

}
