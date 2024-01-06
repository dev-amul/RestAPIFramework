/**
 * Project Copyright:    Payworld
 * @author 			:	 Sumit Chaudhary
 *	DATE       		:	 04-Nov-2020
 *  FILE NAME  		: 	 JWT_Payload_Encryption_Decryption_Generator.java
 *  PROJECT NAME 	:	 payworldapis
 * 	Time			:    10:53:05 AM
 */
package com.API_Testing.utitlites;

import java.io.UnsupportedEncodingException;
import java.security.Key;

import org.apache.commons.codec.binary.Base64;
import org.jose4j.jws.AlgorithmIdentifiers;
import org.jose4j.jws.JsonWebSignature;
import org.jose4j.keys.HmacKey;
import org.jose4j.lang.JoseException;
import org.json.JSONObject;

public class JWT_Payload_Encryption_Decryption_Generator 
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
	
	public static JSONObject decryptJWTPayload(String encryptedPayload)
	{
		String[] split_string = encryptedPayload.split("\\.");
	    //String base64EncodedHeader = split_string[0];   		//uncomment line if want to decode header part 
	    String base64EncodedBody = split_string[1];
	    //String base64EncodedSignature = split_string[2];		//uncomment line if want to decode Signature part
	    
	    Base64 base64Url = new Base64(true);
	    /*
	    String header = new String(base64Url.decode(base64EncodedHeader));
		*/
	    String decryptedBody = new String(base64Url.decode(base64EncodedBody));
	    
	    JSONObject stringToJSON = new JSONObject(decryptedBody);
	    return stringToJSON;
	}


}
