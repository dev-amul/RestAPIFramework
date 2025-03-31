/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 04-Dec-2019
 *  FILE NAME  		: 	 TestCompareTwoJsonFile.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.TestCasesScripts.DataManupulations;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;
import com.API_Testing.utitlites.AllTypeDataRead;
import java.io.FileNotFoundException;
import org.json.JSONException;


/**Test Case for compare two JSON***/
public class TestCompareTwoJsonFile {
	@Test
	public  void compareTwoJsonFile() throws FileNotFoundException, JSONException {
		String expectedJson = AllTypeDataRead.readJsonFile("dummyJsonForKey.json").toString();
		String actualJson = AllTypeDataRead.readJsonFile("JSONForCompare.json").toString();
		JSONAssert.assertNotEquals("Match", expectedJson, actualJson, JSONCompareMode.STRICT);
	}
}
