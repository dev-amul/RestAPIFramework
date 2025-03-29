package com.API_Testing.TestCasesScripts;

import com.API_Testing.commoncontrollers.HTTP_MethodsControllers;
import io.restassured.RestAssured;
import io.restassured.config.HttpClientConfig;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class TimeoutAndRetry extends HTTP_MethodsControllers {

//    @Test
    public void verifyTimeout(){
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(5000) // 5 seconds connection timeout
                .setSocketTimeout(5000) // 5 seconds socket timeout
                .build();

        CloseableHttpClient httpClient = HttpClients.custom()
                .setDefaultRequestConfig(requestConfig)
                .build();

        // Configure Rest-Assured to use the custom HttpClient
        RestAssured.config = RestAssured.config().httpClient(
                HttpClientConfig.httpClientConfig().httpClientFactory(() -> httpClient)
        );

        GET_Method("/api/users/2");
    }

 //   @AfterMethod
    public void verifyStatusCodeAfterTimeout(){
        Assert.assertEquals(res.getStatusCode(),200);
    }

    //   @Test
    public void getResponse(){
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(5000) // 5 seconds connection timeout
                .setSocketTimeout(5000) // 5 seconds socket timeout
                .build();

        CloseableHttpClient httpClient = HttpClients.custom()
                .setDefaultRequestConfig(requestConfig)
                .build();

        // Configure Rest-Assured to use the custom HttpClient
        RestAssured.config = RestAssured.config().httpClient(
                HttpClientConfig.httpClientConfig().httpClientFactory(() -> httpClient)
        );

        GET_Method("end_URL"+"/2");
    }

    @AfterMethod
    public void validateGETResponseCode(){
        res.prettyPrint();
        Assert.assertEquals(res.getStatusCode(), 200);
    }

}
