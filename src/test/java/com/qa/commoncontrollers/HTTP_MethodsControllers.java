/**
  * @author 			:	 sumitkumar
 *	DATE       		:	 15-Sep-2019
 *  FILE NAME  		: 	 HTTP_MethodsControllers.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.qa.commoncontrollers;

import java.util.Properties;
import com.qa.utitlites.MasterController;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;


/**HTTP Method class responsible for all methods. **/
public class HTTP_MethodsControllers {
	public static RequestSpecification reqSpec;
	public static Response res;
	public static ValidatableResponse valRes;
	public static Properties pr= MasterController.loadProperties();

	public static Response GET_Method(String endURL) {
		return res=given().
				baseUri(pr.getProperty("baseurl"))
				.accept(ContentType.JSON)
				.when()
				.get(endURL);
	}

	public static Response POST_Method(String requestBody, String endURL) {
		return given()
				.baseUri(pr.getProperty("baseurl"))
				.contentType(ContentType.JSON) // Taking JSon because pass the data in JSon format.
				.body(requestBody) // pass the expected data
				.when()
				.post(endURL);
	}

	public static Response PUT_Method(String requestBody, String endURL) {
		return given()
				.baseUri(pr.getProperty("baseurl"))
				.contentType(ContentType.JSON) // Taking JSon because pass the data in JSon format.
				.body(requestBody) // pass the expected data
				.when()
				.put(endURL);
	}
	public static Response PATCH_Method(String requestBody, String endURL) {
		return given()
				.baseUri(pr.getProperty("baseurl"))
				.contentType(ContentType.JSON) // Taking JSon because pass the data in JSon format.
				.body(requestBody) // pass the expected data
				.when()
				.patch(endURL);
	}
	public static Response DELETE_Method(String endURL) {
		return given()
				.baseUri(pr.getProperty("baseurl"))
				.when()
				.delete(endURL);
	}
}
