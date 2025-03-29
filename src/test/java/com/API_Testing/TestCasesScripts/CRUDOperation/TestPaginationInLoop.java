package com.API_Testing.TestCasesScripts.CRUDOperation;

import com.API_Testing.commoncontrollers.HTTP_MethodsControllers;
import org.testng.annotations.Test;

public class TestPaginationInLoop extends HTTP_MethodsControllers {
    @Test
    public void validateDataInAllAccordingToPagination(){
       int totalPage= GET_Method("end_URL").jsonPath().getInt("total_pages");
        System.out.println(totalPage);
    }

}
