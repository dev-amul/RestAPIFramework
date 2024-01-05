/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 15-Sep-2019
 *  FILE NAME  		: 	 Load_PropertiestFile.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.Utilites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Load_PropertiestFile {
	public static Properties getPropertyFile(){
		FileInputStream getFile=null;
		Properties pr = new Properties();
		try {
			getFile = new FileInputStream(new File(GetAbsolutePathByFileNameController.getAbsolutPath("Environment_URI.properties")));
			pr.load(getFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pr;//return the data 
	}
	/*
	public static void main(String[] args) {
		System.out.println(getPropertyFile().getProperty("baseURL"));
	}*/
}
