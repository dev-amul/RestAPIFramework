package com.API_Testing.TestCasesScripts.DummyApis;

import com.API_Testing.commoncontrollers.HTTP_MethodsControllers;
import com.API_Testing.utilities.MasterController;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class TestCompareResponseParametersKeys extends HTTP_MethodsControllers {

    Set<String> jsonFileDataKeys;
    Set<String> responseJSONDataKeys;
    @BeforeMethod
    public void fetchJsonDataFromFile(){
        jsonFileDataKeys= MasterController.getJSONDataAllKeys(MasterController.readJsonFile("RegresSingleUserResponse.json"));
    }
    @Test
    public void sendGetRequestByUserIdToGetUserResponse(){
      queryWithKey.put("id","2");
      res=GET_Request_With_QuaryParam("end_URL", queryWithKey);
      responseJSONDataKeys= MasterController.getJSONDataAllKeys(new JSONObject(res.getBody().asString()));
  }

  @AfterMethod
    public void compareBothKeysAndValidateDifference(){
      boolean compareStatus =jsonFileDataKeys.equals(responseJSONDataKeys);
      Assert.assertTrue(compareStatus);
  }
}

