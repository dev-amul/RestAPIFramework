/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 15-Sep-2019
 *  FILE NAME  		: 	 Laod_PropertiestFile.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.utilities;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Laod_PropertiestFile 
{
	public static Properties getPropertyFile() throws IOException
	{
		
		FileInputStream getFile = new FileInputStream("../restassuredautomation_framwork/Environment_URI.properties");
		
		Properties pr = new Properties();
		
		pr.load(getFile);
		
		return pr;
	}
	
	

}
