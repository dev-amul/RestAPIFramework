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
import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.XML;


public class AlltypeDataRead {
	//Methods for read json file 
	public static JSONObject readJsonFile (String fileName) {
        try {
			JSONTokener parseFileToJSOn = new JSONTokener(new FileReader(MasterController.getAbsolutPath(fileName)));//parse the string data in to json format. Because file get the data in string format.
			return new JSONObject(parseFileToJSOn);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
	}
	

	public static String convertJSON_TO_XML(String fileName) throws RuntimeException {
		try {
			FileReader readFile = new FileReader(MasterController.getAbsolutPath(fileName));
			JSONTokener parseFile = new JSONTokener(readFile);
			JSONObject storeObj = new JSONObject(parseFile);
			return XML.toString(storeObj);

		}catch(Exception e){
			throw new RuntimeException();
		}
	}
	
	public static JSONObject covertXML_TO_JSON (String fileName) {

        try {
			FileReader readFile = new FileReader(MasterController.getAbsolutPath(fileName));
			BufferedReader getFileData = new BufferedReader(readFile);
			String store ;
			String increaseData=null;
			while ((store=getFileData.readLine())!=null){
				increaseData+=store;
			}
			JSONObject convertedJSOn = XML.toJSONObject(increaseData);
			getFileData.close();
			return convertedJSOn;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

	}


}
