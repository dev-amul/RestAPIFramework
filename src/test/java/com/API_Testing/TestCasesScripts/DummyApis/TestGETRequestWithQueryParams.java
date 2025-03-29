package com.API_Testing.TestCasesScripts.DummyApis;

import com.API_Testing.commoncontrollers.HTTP_MethodsControllers;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestGETRequestWithQueryParams extends HTTP_MethodsControllers {
    @Test
    public  void validateResponseAsPerPageNo(){
        queryWithKey.put("page","2");
        GET_Request_With_QuaryParam("end_URL",queryWithKey);
    }
    @AfterMethod
    public void validateDataOnPage(){
        Assert.assertEquals(res.jsonPath().getString("data[0].first_name"),"Michael");
    }
}
