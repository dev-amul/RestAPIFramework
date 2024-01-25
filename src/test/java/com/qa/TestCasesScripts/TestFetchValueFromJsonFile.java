package com.qa.TestCasesScripts;

import com.qa.commoncontrollers.FetchDataMethodFromJson;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class TestFetchValueFromJsonFile {

    @Test
    public void testFetch() throws FileNotFoundException {
        String expData= FetchDataMethodFromJson.getValueFromJson("Request", "NotificationList", "keyValuePairList", "key", "MobilePhoneNumber", "value");

        System.out.println(expData);
    }
}
