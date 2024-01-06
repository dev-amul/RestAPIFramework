/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 01-Sep-2019
 *  FILE NAME  		: 	 ComplexBody_JO.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 6:01:15 pm
 */
package com.BodyCreation.OrgJson;

import org.json.JSONArray;
import org.json.JSONObject;

public class ComplexBody_JO{
	public static void main(String[] args) {
		JSONObject allInformation = new JSONObject();
		
		allInformation.put("First Name", "Sumit");
		allInformation.put("Last Name", "Kumar");
		allInformation.put("Contact Number", "9971458090");
		
		JSONObject primaryAddress = new JSONObject(); 
		
		primaryAddress.put("House No", "1234");
		primaryAddress.put("Locality", "Sector 50");
		primaryAddress.put("City", "Noida");
		primaryAddress.put("State", "U.P");
		primaryAddress.put("Pincode", "123456");
		
		JSONObject priAdd = new JSONObject();
		
		priAdd.put("Primary Address", primaryAddress);
		JSONObject permanentAdd = new JSONObject(); 
		
		permanentAdd.put("House No", "591B");
		permanentAdd.put("Locality", "Sector 124");
		permanentAdd.put("City", "GreaterNoida");
		permanentAdd.put("State", "U.P");
		permanentAdd.put("Pincode", "201035");
		
		JSONObject secAdd = new JSONObject();
		
		secAdd.put("Permanent Address", permanentAdd);
		
		JSONArray userinfoBody = new JSONArray();
		
		userinfoBody.put(priAdd);
		userinfoBody.put(secAdd);
		
		
		allInformation.put("Address", userinfoBody);
		
		System.out.println(allInformation.toString());
		
		
		
		
	}

}
