package com.API_Testing.TestCasesScripts.Authentication;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DigestAuthentication {
   /*
   Digest Authentication is an authentication mechanism used in HTTP to enhance the security of Basic Authentication.
   It addresses some of the security vulnerabilities present inBasic Authentication, such as the transmission of credentials in
   plain text, by using a more secure approach. Digest Authentication challenges the client with a server-generated nonce (a unique
   token) and requires the client to respond with a hashed value of the nonce, username, password, and other request-specific
   information.

   Through .digest(“username”, “password”), Digest Authentication is configured.
   */

    @Test(enabled = false)
    public void digest(){
        given()
                .auth()
                .digest("username","password")
                .when().get("https://api.example.com/resource");
    }
}
