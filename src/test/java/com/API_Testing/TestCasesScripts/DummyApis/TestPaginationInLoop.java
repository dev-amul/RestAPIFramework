package com.API_Testing.TestCasesScripts.DummyApis;

import com.API_Testing.commoncontrollers.HTTP_MethodsControllers;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestPaginationInLoop extends HTTP_MethodsControllers {
    @Test
    public void validateDataInAllAccordingToPagination(){
       int totalPage= GET_Method("end_URL").jsonPath().getInt("total_pages");
        System.out.println("Total page is: "+totalPage);
       int i=1;
       while(i<=totalPage){
           queryWithKey.put("page",String.valueOf(i));
           res=GET_Request_With_QuaryParam("end_URL",queryWithKey);
           System.out.println("Current page no is: "+res.jsonPath().getString("page"));

           res.prettyPrint();
           i++;
       }
    }
    @AfterMethod
    public void validateStatusCodeAfterLoop(){
        Assert.assertEquals(res.getStatusCode(),200);
    }

}
