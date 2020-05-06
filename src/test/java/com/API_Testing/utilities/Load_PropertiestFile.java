/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 15-Sep-2019
 *  FILE NAME  		: 	 Load_PropertiestFile.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.utilities;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Load_PropertiestFile 
{
	//Returnable method for read the properties file and provide the data as per key. Read all value from the given environment file. 
	public static Properties getPropertyFile() throws IOException
	{
		//Passing the properties file path in fileInpustream object.  
		FileInputStream getFile = new FileInputStream("../restassuredautomation_framwork/src/main/java/com/API_Testing/EnvironmentFiles/Environment_URI.properties");
		//Initialize   the properties class variable 
		Properties pr = new Properties();
		//pass the file object which store the file path 
		pr.load(getFile);
		
		return pr;//return the data 
	}
	
	

}
