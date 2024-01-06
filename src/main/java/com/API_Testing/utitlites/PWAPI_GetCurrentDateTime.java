/**
 * Project Copyright:    Payworld
 * @author 			:	 Sumit Chaudhary
 *	DATE       		:	 23-Dec-2020
 *  FILE NAME  		: 	 PWAPI_GetCurrentDateTime.java
 *  PROJECT NAME 	:	 payworldapis
 * 	Time			:    4:34:11 PM
 */
package com.API_Testing.utitlites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PWAPI_GetCurrentDateTime {

	public static String getCurrentDateTime(){
		SimpleDateFormat formatDate= new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a");
		String currtDateTime=formatDate.format(new Date());
		
		return currtDateTime;
	}
	
	public static String getCurrectTimeExcMeridiem() {
		SimpleDateFormat formatDate= new SimpleDateFormat("ddMMyyhhmmss");
		String currtDateTime=formatDate.format(new Date());
		return currtDateTime;
	}
}
