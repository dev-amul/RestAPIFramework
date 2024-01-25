package com.qa.TestCasesScripts;

import com.qa.utitlites.AlltypeDataRead;
import com.qa.utitlites.GenerateChecksum_Auth;
import com.qa.utitlites.JWT_Payload_Encryption_Decryption_Generator;
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
