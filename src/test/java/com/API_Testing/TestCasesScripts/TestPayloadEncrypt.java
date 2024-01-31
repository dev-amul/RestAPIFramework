package com.API_Testing.TestCasesScripts;

import com.API_Testing.utitlites.AlltypeDataRead;
import com.API_Testing.utitlites.GenerateChecksum_Auth;
import com.API_Testing.utitlites.JWT_Payload_Encryption_Decryption_Generator;
import com.API_Testing.utitlites.MasterController;
import org.jose4j.lang.JoseException;
import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;

public class TestPayloadEncrypt {
   JSONObject jsonPayload;
    @BeforeMethod
   public void generateJsonPayload(){
        jsonPayload= AlltypeDataRead.readJsonFile("employeeData.json");
    }
    @Test
    public void encryptJson() throws JoseException, UnsupportedEncodingException {
        String s=JWT_Payload_Encryption_Decryption_Generator.generateEncryptedJson(GenerateChecksum_Auth.fetchCheckSumAndTimeStamp().getCheckSum(), jsonPayload.toString());
        System.out.println(s);
    }
}
