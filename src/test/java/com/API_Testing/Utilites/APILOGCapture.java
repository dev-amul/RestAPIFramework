/**
 * @author 			:	 Sumit Kumar
 *	DATE       		:	 09-May-2020
 *  FILE NAME  		: 	 APILOGCapture.java
 *  PROJECT NAME 	:	 RestAPIFramework
 * 
 */
package com.API_Testing.Utilites;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class APILOGCapture 
{
	public static void captureLog(String className, String logMessage)
	{
		// Fetch the log configure file from the directory. 
		DOMConfigurator.configure("../RestAPIFramework/APILOGConfigerSettings/captureLogConfigured.xml");
		
		//Take Apache log4G  class's get logger static method. 
		//Storing the expected class name 
		Logger l = Logger.getLogger(className);
		//Provide the message as per expectation
		l.info(logMessage);
	}
}
