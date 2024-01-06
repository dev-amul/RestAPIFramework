/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 11-Jul-2019
 *  FILE NAME  		: 	 XmlTOJson.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 10:53:27 pm
 */
package com.API_Testing.TestCasesScripts;

import org.json.JSONObject;
import org.json.XML;

public class XmlTOJson 
{
	public static String TEST_XML_STRING = "<employee>\n" + 
			"<firstName>Sumit</firstName>\n" + 
			"<lastName>Kumar</lastName>\n" + 
			"<designation>Software Tester</designation>\n" + 
			"<address>\n" + 
			"    <Primaryaddress>\n" + 
			"<street>F-14</street>\n" + 
			"<city>Noida</city>\n" + 
			"<state>UP</state>\n" + 
			"</Primaryaddress>\n" + 
			"</address>\n" + 
			"<address>\n" + 
			"<SecondaryAddress>\n" + 
			"<street>F-14</street>\n" + 
			"<city>Noida</city>\n" + 
			"<state>UP</state>\n" + 
			"</SecondaryAddress>\n" + 
			"</address>\n" + 
			"</employee>";
	
	public static void main(String[] args) 
	{
		JSONObject obj = XML.toJSONObject(TEST_XML_STRING);
		
		System.out.println(obj.toString());
		
	}
	
	

}
