/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 11-Jul-2019
 *  FILE NAME  		: 	 TC11_ConvertXMLfileTOJson.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 11:07:20 pm
 */
package com.API_Testing.TestCasesScripts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONObject;
import org.json.XML;

public class TC11_ConvertXMLfileTOJson 
{
	public static void main(String[] args) throws IOException 
	{
		File  filePath = new File("../ResAssuredProject/studentInformation.xml");
		
		//Use for read the character of the file data and give the file object which contain file 
		FileReader readCharacter = new FileReader(filePath);
		
		// use for append the character and convert in to sentence 
		BufferedReader appendCharacter = new BufferedReader(readCharacter);
		
		// for storing all data
		String storeData; 
		//for string the all data and increasing 
		String xmlData= null; 
		
		while ((storeData=appendCharacter.readLine())!=null)
		{
			xmlData+=storeData; // here i'm string all readed data to second string object and increasing the value 
		}
		
		//Here I'm converting the XML data to json formate
		JSONObject converTOJson = XML.toJSONObject(xmlData);
		System.out.println(converTOJson.toString());
		
	}

}
