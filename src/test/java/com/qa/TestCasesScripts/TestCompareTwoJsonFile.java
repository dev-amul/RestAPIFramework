/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 04-Dec-2019
 *  FILE NAME  		: 	 TestCompareTwoJsonFile.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.qa.TestCasesScripts;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;
import com.qa.utitlites.AlltypeDataRead;
import java.io.FileNotFoundException;
import org.json.JSONException;


/**Test Case for compare two JSON***/
public class TestCompareTwoJsonFile {
	@Test
	public  void comparetoJson() throws FileNotFoundException, JSONException {
		String expectedJson = AlltypeDataRead.readJsonFile("JSONforCompare1.json").toString();
		String actualJson = AlltypeDataRead.readJsonFile("JSONforCompare2.json").toString();
		JSONAssert.assertNotEquals("Match", expectedJson, actualJson, JSONCompareMode.STRICT);
	}
}
