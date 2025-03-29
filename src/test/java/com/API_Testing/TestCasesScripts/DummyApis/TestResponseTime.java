package com.API_Testing.TestCasesScripts.DummyApis;

import com.API_Testing.commoncontrollers.HTTP_MethodsControllers;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestResponseTime extends HTTP_MethodsControllers {
    @Test
    public void validateResponseTime(){
        res=GET_Method("end_URL");
    }

    @AfterMethod
    public void validateTimeResponse(){
       long responseTime= res.thenReturn().time();
        System.out.println("Response time:\t"+responseTime);
        Assert.assertTrue(responseTime < 1500, "Response time exceeded the threshold!");
    }
}
