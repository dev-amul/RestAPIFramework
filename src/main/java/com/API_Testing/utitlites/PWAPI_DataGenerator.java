/**
 * Project Copyright:    Payworld
 * @author 			:	 Sumit Chaudhary
 *	DATE       		:	 06-Dec-2020
 *  FILE NAME  		: 	 PWAPI_DataGenerator.java
 *  PROJECT NAME 	:	 payworldapis
 * 	Time			:    10:11:25 PM
 */
package com.API_Testing.utitlites;

import java.util.Calendar;
import java.util.Random;

public class PWAPI_DataGenerator {
	static Random secureRnD;
	public static String randomStringTypeData(int stringDataLength) {
		secureRnD= new Random();
		String alphabetSource ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		
		StringBuilder buildString = new StringBuilder(stringDataLength);
		for (int i = 0; i < stringDataLength; i++) {
			
			buildString.append(alphabetSource.charAt(secureRnD.nextInt(alphabetSource.length())));
			}	
		return buildString.toString();	
		}
	public static String randomUpperCaseStringTypeData(int stringDataLength) {
		secureRnD= new Random();
		String alphabetSource ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		StringBuilder buildString = new StringBuilder(stringDataLength);
		for (int i = 0; i < stringDataLength; i++) {
			
			buildString.append(alphabetSource.charAt(secureRnD.nextInt(alphabetSource.length())));
			}	
		return buildString.toString();	
		}
	
	public static String randomAlphaStringTypeData(int stringDataLength) {
		secureRnD= new Random();
		String alphabetSource ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
		
		StringBuilder buildString = new StringBuilder(stringDataLength);
		for (int i = 0; i < stringDataLength; i++) {
			
			buildString.append(alphabetSource.charAt(secureRnD.nextInt(alphabetSource.length())));
			}	
		return buildString.toString();	
		}
	public static String randomStringwithSpecialCharTypeData(int stringDataLength) {
		secureRnD= new Random();
		String alphabetSource ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*/.,<>?";
		
		StringBuilder buildString = new StringBuilder(stringDataLength);
		for (int i = 0; i < stringDataLength; i++) {
			
			buildString.append(alphabetSource.charAt(secureRnD.nextInt(alphabetSource.length())));
			}	
		return buildString.toString();	
		}
	
	public static String randomAlphaStringSpecialTypeData(int stringDataLength) {
		secureRnD= new Random();
		String alphabetSource ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*/.,<>?";
		
		StringBuilder buildString = new StringBuilder(stringDataLength);
		for (int i = 0; i < stringDataLength; i++) {
			
			buildString.append(alphabetSource.charAt(secureRnD.nextInt(alphabetSource.length())));
			}	
		return buildString.toString();	
		}
	
	public static String getRandomNumberString(String noOfDigit) {
	    // It will generate 6 digit random Number.
	    // from 0 to 999999
	    Random rnd = new Random();
	    int number = rnd.nextInt(999999);

	    // this will convert any number sequence into 6 character.
	    return String.format("%0"+noOfDigit+"d", number);
	}
	public static double randomDoubleData()
	{
		secureRnD = new Random();
		double randomNum=secureRnD.nextDouble();
		return randomNum;
	}
	
	public static String getUniqueEnginTransNo(String providerId) {
		//provider_id+date('ymdH')+AAA(Increase after every txn) //6320120911AAAB
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; // Note: zero based!
		int day = now.get(Calendar.DAY_OF_MONTH);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		String engineTransNo =providerId+String.valueOf(year).substring(2)+month+""+day+""+hour+randomUpperCaseStringTypeData(4);	
		return engineTransNo;
	}
	public static String getCashoutUniqueEnginTransNo() {
		//provider_id+date('ymdH')+AAA(Increase after every txn) //AWFNG20110939617757
																 //GYTDL20123018732867
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; // Note: zero based!
		int day = now.get(Calendar.DAY_OF_MONTH);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		String engineTransNo =randomUpperCaseStringTypeData(5)+String.valueOf(year).substring(2)+month+""+day+""+hour+""+getRandomNumberString("6");	
		return engineTransNo;
	}
	
	
}

