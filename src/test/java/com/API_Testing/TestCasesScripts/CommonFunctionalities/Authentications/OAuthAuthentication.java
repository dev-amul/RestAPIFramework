package com.API_Testing.TestCasesScripts.CommonFunctionalities.Authentications;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class OAuthAuthentication {

    // https://www.postman.com/postman/workspace/published-postman-templates/documentation/631643-f695cab7-6878-eb55-7943-ad88e1ccfd65?ctx=documentation
    /*
    OAuth1, often referred to simply as OAuth, is an earlier version of the OAuth protocol that focuses on granting third-party
    applications-limited access to user resources on various online services. It’s designed to enable secure access to resources
    without the need for sharing the user’s actual credentials (username and password) with the third-party application.
    OAuth1 authentication involves three main parties: the user (resource owner), the client application (consumer),
    and the resource server (service provider).

    Through .oauth(), you provide the required credentials.b
    * */

    @Test(enabled = false)
    public void auth(){
     given()
                .auth()
                .oauth("consumerKey", "consumerSecret", "accessToken", "secretToken")
                .when().get("https://api.example.com/resource");
    }

}
