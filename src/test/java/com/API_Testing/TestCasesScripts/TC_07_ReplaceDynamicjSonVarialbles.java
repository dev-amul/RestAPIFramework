/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 09-Oct-2019
 *  FILE NAME  		: 	 TC_07_ReplaceDynamicjSonVarialbles.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.TestCasesScripts;

import org.testng.annotations.Test;

import com.API_Testing.Utilites.ReplaceVariablesValuesAsperkeys;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.testng.annotations.Test;

public class TC_07_ReplaceDynamicjSonVarialbles
{
	@Test
	public void replaceVarialbes() throws FileNotFoundException
	{
		String enterReplacementValues=null;
		String replaceVaules= 
		
		ReplaceVariablesValuesAsperkeys.replaceVariablesAsPerKeys("../RestAPI_Automation_Framwork/Resources/dynamicVariableBody.json", enterReplacementValues);
		System.out.println("##############---------TC07_Relace the data----------#######");
		System.out.println(replaceVaules);
		

	}
	

}
