package com.API_Testing.TestCasesScripts.CommonFunctionalities;

import com.API_Testing.utilities.MasterController;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class TestFetchValueFromJsonFile {

    @Test
    public void testFetch() throws FileNotFoundException {
        String expData=
                MasterController
                        .getValueFromJson("Request",
                                "NotificationList",
                                "keyValuePairList",
                                "key",
                                "MobilePhoneNumber",
                                "value");

        System.out.println(expData);
    }
}
