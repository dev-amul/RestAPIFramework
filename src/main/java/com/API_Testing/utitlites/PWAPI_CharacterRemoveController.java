/**
 * Project Copyright:    Payworld
 * @author 			:	 Sumit Chaudhary
 *	DATE       		:	 05-Nov-2020
 *  FILE NAME  		: 	 PWAPI_CharacterRemoveController.java
 *  PROJECT NAME 	:	 payworldapis
 * 	Time			:    5:15:27 PM
 */
package com.API_Testing.utitlites;
public class PWAPI_CharacterRemoveController
{
	public static String removeCharAt(String s, int pos) {
	      return s.substring(0, pos) + s.substring(pos + 1);
	   }

}
