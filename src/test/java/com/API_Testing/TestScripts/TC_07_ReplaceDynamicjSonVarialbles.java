/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 09-Oct-2019
 *  FILE NAME  		: 	 TC_07_ReplaceDynamicjSonVarialbles.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.TestScripts;

import java.io.FileNotFoundException;
import java.util.Scanner;

import org.testng.annotations.Test;
import com.API_Testing.Resources.ReplaceVariablesValuesAsperkeys;

public class TC_07_ReplaceDynamicjSonVarialbles
{
	@Test
	public void replaceVarialbes() throws FileNotFoundException
	{
		String enterReplacementValues=null;
		String replaceVaules= 
		
		ReplaceVariablesValuesAsperkeys.replaceVariablesAsPerKeys("../RestAPI_Framework/DataFile/dynamicVariableBody.json", enterReplacementValues);
		
		System.out.println(replaceVaules);
		

	}
	

}
