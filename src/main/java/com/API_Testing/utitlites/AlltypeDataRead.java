/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 06-Oct-2019
 *  FILE NAME  		: 	 AlltypeDataRead.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.utitlites;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.XML;


public class AlltypeDataRead {
	//Methods for read json file 
	public static JSONObject readJsonFile (String fileURL) throws FileNotFoundException, JSONException {
		FileReader getFile = new FileReader(fileURL);//fetch the json file as per given path
		JSONTokener parseFileToJSOn = new JSONTokener(getFile);//parse the string data in to json format. Because file get the data in string format. 
		JSONObject convertToJSonObject = new JSONObject(parseFileToJSOn);// convert to the json object. 
		return convertToJSonObject;		//return the data  
	}
	

	public static String convertJSON_TO_XML(String fileURL) throws IOException, JSONException{
		FileReader readFile = new FileReader(fileURL);
		JSONTokener parseFile = new JSONTokener(readFile);
		JSONObject storeObj = new JSONObject(parseFile);
		String xmlConvert = XML.toString(storeObj);
		return xmlConvert;
		 
	}
	
	public static JSONObject covertXML_TO_JSON (String fileURL) throws IOException, JSONException {
		FileReader readFile = new FileReader(fileURL);
		BufferedReader getFileData = new BufferedReader(readFile);
		String store ; 
		String increaseData=null;
		while ((store=getFileData.readLine())!=null){
			increaseData+=store;
		}
		JSONObject convertedJSOn = XML.toJSONObject(increaseData);
		
		return convertedJSOn;
	}


}
