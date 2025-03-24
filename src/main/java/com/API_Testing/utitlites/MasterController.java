/**
 * @author 			:	 Sumit Chaudhary
 *	DATE       		:	 06-Dec-2020
 *  FILE NAME  		: 	 All_Type_DataGenerator.java
 *  PROJECT NAME 	:	 payworldapis
 * 	Time			:    10:11:25 PM
 */
package com.API_Testing.utitlites;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

public class MasterController {
	public static String getAbsolutPath(String fileName) {

		String fileAbolutePath ="";
		try {
			boolean recursive = true;
			//Collection method
			Collection files = FileUtils.listFiles(new File(System.getProperty("user.dir")), null, recursive);
			for (Iterator iterator = files.iterator(); iterator.hasNext();) {
				File file = (File) iterator.next();
				if (file.getName().equals(fileName))
					fileAbolutePath=file.getAbsolutePath();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return fileAbolutePath;
	}
	/**
	 * @author Sumit Kumar Chaudhary
	 * PPAAS_PropertiesFileControler is class which contain fetchPropertyFileValueAsPerKey method that help
	 * us to read the value from the properties file as per given key and return the value.
	 *
	 * fetchPropertyFileValueAsPerKey(String propertyFileName) method is parameter method that require property fileName with the
	 * .properties extension. You know need to give full path of the file
	 */


	public static Properties loadProperties() {
		Properties prop = new Properties();
		String environment = System.getProperty("env");

		if (environment == null) {
			environment = "testEnv";
			//mvn test -Pint
		}

		String filePath = environment + ".properties";
		//System.out.println(filePath);

		try (InputStream resourceAsStream = MasterController.class.getClassLoader().getResourceAsStream(filePath)) {
			prop.load(resourceAsStream);
		} catch (IOException e) {
			System.err.println("Unable to load properties file : " + filePath);
		}

		return prop;
	}
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
	
	public static String removeCharAt(String s, int pos) {
	      return s.substring(0, pos) + s.substring(pos + 1);
	   }
	
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
	public static String getRoundValue(int numberOfDigitsAfterDecimalPoint, String expectedValue) {
		BigDecimal bDecimal = new BigDecimal(expectedValue);
		bDecimal=bDecimal.setScale(numberOfDigitsAfterDecimalPoint, BigDecimal.ROUND_HALF_UP);
		return bDecimal.toString();
	}

}

