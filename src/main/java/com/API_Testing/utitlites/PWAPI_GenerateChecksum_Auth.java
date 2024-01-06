/**
 * Project Copyright:    Payworld
 * @author 			:	 Sumit Chaudhary
 *	DATE       		:	 Aug 18, 2020
 *  FILE NAME  		: 	 Test.java
 *  PROJECT NAME 	:	 Payworld_RESTAPI
 * 	Time			:    3:09:26 PM
 */
package com.API_Testing.utitlites;

import java.time.Instant;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Hex;

public class PWAPI_GenerateChecksum_Auth{
	public String checkSum;
	public String unixTimeStamp;
	
	public String getCheckSum() {
		return checkSum;
	}
	public void setCheckSum(String checkSum) {
		this.checkSum = checkSum;
	}
	public String getUnixTimeStamp() {
		return unixTimeStamp;
	}
	public void setUnixTimeStamp(String unixTimeStamp) {
		this.unixTimeStamp = unixTimeStamp;
	}
	
	private static String clientSecret;
	private static String getClientSecret() {
		clientSecret="CwGju0QUdQ1ua6G6YrQQwoUl9WA5luFUDip9api9";
		return clientSecret;
	}
	
	public static PWAPI_GenerateChecksum_Auth fetchCheckSumAndTimeStamp() {
		PWAPI_GenerateChecksum_Auth obj= new PWAPI_GenerateChecksum_Auth();
		try {
			Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
			SecretKeySpec secret_key = new SecretKeySpec(getClientSecret().getBytes("UTF-8"), "HmacSHA256");
			sha256_HMAC.init(secret_key);
			String unixTime = String.valueOf(Instant.now().getEpochSecond());
			
			obj.setCheckSum(Hex.encodeHexString(sha256_HMAC.doFinal(unixTime.getBytes("UTF-8"))));
			obj.setUnixTimeStamp(unixTime);
		} catch (Exception e) {
			e.getStackTrace();
		}
		return obj;
	}
	/*
	public static void main(String[] args) {
		System.out.println(PWAPI_GenerateChecksum_Auth.fetchCheckSumAndTimeStamp().getCheckSum());
	}*/
}
