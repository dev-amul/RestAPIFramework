/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 09-Oct-2019
 *  FILE NAME  		: 	 TestReplaceDynamicJSONVariables.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.qa.TestCasesScripts;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import com.qa.commoncontrollers.ReplaceVariablesValuesAsperkeys;

public class TestReplaceDynamicJSONVariables {
	@Test
	public void replaceVariables() throws FileNotFoundException {
		String enterReplacementValues=null;
		String replaceValues=
				ReplaceVariablesValuesAsperkeys.replaceVariablesAsPerKeys("dynamicVariableBody.json", enterReplacementValues);
		
		System.out.println(replaceValues);
	}
}
