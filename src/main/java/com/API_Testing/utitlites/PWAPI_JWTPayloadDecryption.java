/**
 * Project Copyright:    Payworld
 * @author 			:	 Sumit Chaudhary
 *	DATE       		:	 05-Nov-2020
 *  FILE NAME  		: 	 PWAPI_JWTPayloadDecryption.java
 *  PROJECT NAME 	:	 payworldapis
 * 	Time			:    11:32:12 AM
 */
package com.API_Testing.utitlites;

import org.apache.commons.codec.binary.Base64;
import org.json.JSONObject;

public class PWAPI_JWTPayloadDecryption 
{
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
