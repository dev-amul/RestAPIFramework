package com.API_Testing.TestCasesScripts.Authentications;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class OAuth2Authentication {
    /*
    * OAuth2 (Open Authorization 2.0) is a widely used authorization framework that allows applications to obtain limited access
    * to user accounts on behalf of a third-party application. It’s commonly used to enable secure and controlled access to APIs
    * and resources without exposing the user’s credentials.
    * OAuth2 involves various roles, including the resource owner (user), client application (third-party app),
    * authorization server (handles authentication and issues access tokens), and resource server (holds the protected resources).
    * The process revolves around getting an access token, which serves as a temporary authorization token that allows the
    * client application to access specific resources on behalf of the user.
    *
    *
    * With .oauth2(“access_token”), Rest Assured automatically integrates the token into the request.
    * */
    @Test(enabled = false)
    public void oauth(){
        given()
                .auth()
                .oauth2("access_token")
                .when().get("https://api.example.com/resource");
    }
}
