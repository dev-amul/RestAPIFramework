package com.API_Testing.TestCasesScripts.DataEncryptionDecryption;

import com.API_Testing.utitlites.AllTypeDataRead;
import com.API_Testing.utitlites.GenerateChecksum_Auth;
import com.API_Testing.utitlites.JWT_Payload_Encryption_Decryption_Generator;
import org.jose4j.lang.JoseException;
import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;

public class TestPayLoadDecryption {
    JSONObject jsonPayload;
    @BeforeMethod
    public void generateJsonPayload(){
        jsonPayload= AllTypeDataRead.readJsonFile("dummyJsonForKey.json");
    }
    @Test
    public void generateDecryption() throws JoseException, UnsupportedEncodingException {
        String s= JWT_Payload_Encryption_Decryption_Generator.generateEncryptedJson(GenerateChecksum_Auth.fetchCheckSumAndTimeStamp().getCheckSum(), jsonPayload.toString());
        System.out.println(JWT_Payload_Encryption_Decryption_Generator.decryptJWTPayload(s));

    }
}
