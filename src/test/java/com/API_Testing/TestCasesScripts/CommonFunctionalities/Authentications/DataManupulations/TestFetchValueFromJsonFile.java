package com.API_Testing.TestCasesScripts.CommonFunctionalities.Authentications.DataManupulations;

import com.API_Testing.commoncontrollers.FetchDataMethodFromJson;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class TestFetchValueFromJsonFile {

    @Test
    public void testFetch() throws FileNotFoundException {
        String expData=
                FetchDataMethodFromJson
                        .getValueFromJson("Request",
                                "NotificationList",
                                "keyValuePairList",
                                "key",
                                "MobilePhoneNumber",
                                "value");

        System.out.println(expData);
    }
}
