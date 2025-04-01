package com.API_Testing.TestCasesScripts.DataEncryptionDecryption;

import com.API_Testing.utilities.MasterController;
import org.jose4j.lang.JoseException;
import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;

public class TestPayLoadDecryption {
    JSONObject jsonPayload;
    @BeforeMethod
    public void generateJsonPayload(){
        jsonPayload= MasterController.readJsonFile("dummyJsonForKey.json");
    }
    @Test
    public void generateDecryption() throws JoseException, UnsupportedEncodingException {
        String s= MasterController.generateEncryptedJson(MasterController.fetchCheckSumAndTimeStamp().getCheckSum(), jsonPayload.toString());
        System.out.println(MasterController.decryptJWTPayload(s));

    }
}
