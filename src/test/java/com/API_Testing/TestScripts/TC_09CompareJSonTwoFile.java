/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 04-Dec-2019
 *  FILE NAME  		: 	 TC_09CompareJSonTwoFile.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.TestScripts;

import org.testng.annotations.Test;
import com.API_Testing.Payloads.AlltypeDataRead;
import java.io.FileNotFoundException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

/**Test Case for compare two JSON***/
public class TC_09CompareJSonTwoFile 
{
	@Test
	public  void comparetoJson() throws FileNotFoundException {
		
		
		String expectedJson = AlltypeDataRead.readJsonFile("../RestAPI_Automation_Framwork/src/test/java/com/API_Testing/Resources/JSONforCompare1.json").toString();
		String actualJson = AlltypeDataRead.readJsonFile("../RestAPI_Automation_Framwork/src/test/java/com/API_Testing/Resources/JSONforCompare2.json").toString();
		System.out.println("##############---TC_9 Compare json----#############\n");
		
		JSONAssert.assertNotEquals("Match", expectedJson, actualJson, JSONCompareMode.STRICT);
		
	}

}
