/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 12-Jul-2019
 *  FILE NAME  		: 	 JsonTOXML.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 12:37:15 am
 */
package com.API_Testing.TestCasesScripts;

import org.json.JSONObject;
import org.json.XML;

public class JsonTOXML 
{
	public static void main(String[] args) 
	{
		
		String jsonData = "{\n" + 
				"    \"quiz\": {\n" + 
				"        \"sport\": {\n" + 
				"            \"q1\": {\n" + 
				"                \"question\": \"Which one is correct team name in NBA?\",\n" + 
				"                \"options\": [\n" + 
				"                    \"New York Bulls\",\n" + 
				"                    \"Los Angeles Kings\",\n" + 
				"                    \"Golden State Warriros\",\n" + 
				"                    \"Huston Rocket\"\n" + 
				"                ],\n" + 
				"                \"answer\": \"Huston Rocket\"\n" + 
				"            }\n" + 
				"        },\n" + 
				"        \"maths\": {\n" + 
				"            \"q1\": {\n" + 
				"                \"question\": \"5 + 7 = ?\",\n" + 
				"                \"options\": [\n" + 
				"                    \"10\",\n" + 
				"                    \"11\",\n" + 
				"                    \"12\",\n" + 
				"                    \"13\"\n" + 
				"                ],\n" + 
				"                \"answer\": \"12\"\n" + 
				"            },\n" + 
				"            \"q2\": {\n" + 
				"                \"question\": \"12 - 8 = ?\",\n" + 
				"                \"options\": [\n" + 
				"                    \"1\",\n" + 
				"                    \"2\",\n" + 
				"                    \"3\",\n" + 
				"                    \"4\"\n" + 
				"                ],\n" + 
				"                \"answer\": \"4\"\n" + 
				"            }\n" + 
				"        }\n" + 
				"    }\n" + 
				"}";
		
		JSONObject storeObj = new JSONObject(jsonData);
		
		String xml_DataString = XML.toString(storeObj);
		System.out.println(xml_DataString);
		
	}

}
