package com.API_Testing.Authentication;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PreemptiveAuthentication {
   /*
   Pre-emptive Authentication is an authentication strategy employed in HTTP clients to proactively send authentication credentials
   with the initial request, rather than waiting for the server to respond with a 401 Unauthorized status code.
   In the context of Rest Assured and other HTTP client libraries, pre-emptive authentication means sending authentication
   credentials in the very first request, even before receiving any response from the server. This can be especially useful
   when dealing with APIs that require authentication for every request and do not challenge with a 401 status code.

   By using .preemptive() before .basic(), Rest Assured takes the initiative in including the credentials.
   * */
    @Test
    public void preemtive(){
        Response res = given()
                .auth()
                .preemptive().basic("username","password" )
                .when().get("https://api.example.com/resource");
        System.out.println(res.getStatusCode());
    }
}
