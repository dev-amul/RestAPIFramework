package com.API_Testing.TestCasesScripts.DummyApis;

import com.API_Testing.commoncontrollers.HTTP_MethodsControllers;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestResponseHeaderValues extends HTTP_MethodsControllers {
    @Test
    public void sendRequestToFetchHeaderValue(){
        res=GET_Method("end_URL");
    }

    @AfterMethod
    public void fetchResponseHeaderValues(){
        System.out.println(res.getHeader("Date"));
    }
}
