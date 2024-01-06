/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 01-Sep-2019
 *  FILE NAME  		: 	 BodyCreation_ObjectINObj.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 5:42:48 pm
 */
package com.BodyCreation.OrgJson;

import org.json.JSONObject;

public class BodyCreation_ObjectINObj{
	public static void main(String[] args) {
		JSONObject userName = new JSONObject();
		
		userName.put("First Name", "Sumit");
		userName.put("Last Name", "Chaudhary");
		
		
		JSONObject addAddress = new JSONObject();
		
		addAddress.put("H.N", "H.n 14");
		addAddress.put("Sector", "Sector 50");
		addAddress.put("Land Mark", "Neo Hospital");
		addAddress.put("City", "Noida");
		addAddress.put("State", "UP");
		addAddress.put("Pin code", 201301);
		
		userName.put("Address", addAddress);
		
		String userBody = userName.toString();
		
		System.out.println(userBody);
		
	}

}
