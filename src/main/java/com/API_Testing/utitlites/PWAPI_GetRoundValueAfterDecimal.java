/**
 * Project Copyright:    Payworld
 * @author 			:	 Sumit Chaudhary
 *	DATE       		:	 23-Dec-2020
 *  FILE NAME  		: 	 PWAPI_GetRoundValueAfterDecimal.java
 *  PROJECT NAME 	:	 payworldapis
 * 	Time			:    3:12:22 PM
 */
package com.API_Testing.utitlites;

import java.math.BigDecimal;

public class PWAPI_GetRoundValueAfterDecimal 
{
	public static String getRoundValue(int numberOfDigitsAfterDecimalPoint, String expectedValue) {
		BigDecimal bDecimal = new BigDecimal(expectedValue);
		bDecimal=bDecimal.setScale(numberOfDigitsAfterDecimalPoint, BigDecimal.ROUND_HALF_UP);
		return bDecimal.toString();
	}

}
