package com.API_Testing.TestCasesScripts.DummyApis;

import com.API_Testing.commoncontrollers.HTTP_MethodsControllers;
import com.API_Testing.utilities.MasterController;
import io.restassured.path.json.JsonPath;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.Set;

public class TestResponseJsonDataType extends HTTP_MethodsControllers {
    @Test
    public void getResponseJsonDataType() {
        queryWithKey.put("id", "1");
        res = GET_Request_With_QuaryParam("end_URL", queryWithKey);
        Set<String> jsonDataKeys=MasterController.getJSONDataAllKeys(new JSONObject(res.getBody().asString()));
        for(String key: jsonDataKeys){
            System.out.println("Key : "+key+" Value : "+res.jsonPath().getString("data."+key));
        }

    }
}
