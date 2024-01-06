/**
 * Project Copyright:    Payworld
 * @author 			:	 Sumit Chaudhary
 *	DATE       		:	 04-Nov-2020
 *  FILE NAME  		: 	 PWAPI_JWTEncryptedPayloadGenerator.java
 *  PROJECT NAME 	:	 payworldapis
 * 	Time			:    10:53:05 AM
 */
package com.API_Testing.utitlites;

import java.io.UnsupportedEncodingException;
import java.security.Key;
import org.jose4j.jws.AlgorithmIdentifiers;
import org.jose4j.jws.JsonWebSignature;
import org.jose4j.keys.HmacKey;
import org.jose4j.lang.JoseException;

public class PWAPI_JWTEncryptedPayloadGenerator 
{
	public static String generateEncryptedJson(String secretKey, String payLoad) throws UnsupportedEncodingException, JoseException
	{
		//= "12345678";
		Key verifyKey = new HmacKey(secretKey.getBytes("UTF-8"));
		
		JsonWebSignature jws = new JsonWebSignature();
		jws.setHeader("alg", "HS256");
		jws.setHeader("typ","JWT");
		jws.setPayload(payLoad);
		jws.setAlgorithmHeaderValue(AlgorithmIdentifiers.HMAC_SHA256);
		jws.setKey(verifyKey);
		jws.setDoKeyValidation(false);
		
		String encryptedPayload = jws.getCompactSerialization();
		
		return encryptedPayload;
		
	}

}
