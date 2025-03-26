/**
  * @author 			:	 sumitkumar
 *	DATE       		:	 15-Sep-2019
 *  FILE NAME  		: 	 HTTP_MethodsControllers.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.commoncontrollers;

import java.util.Properties;
import com.API_Testing.utitlites.MasterController;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;


/**HTTP Method class responsible for all methods. **/
public class HTTP_MethodsControllers {
	public static Response res;
	public static Properties pr= MasterController.loadProperties();

	protected static RequestSpecification getRequestSpec() {
		return given().baseUri(pr.getProperty("base_URL"));
	}

	public static Response GET_Method(String end_URL) {
		return res=getRequestSpec()
				.accept(ContentType.JSON)
				.when()
				.get(end_URL);
	}

	public static Response POST_Method(String requestBody, String end_URL) {
		res=getRequestSpec()
				.contentType(ContentType.JSON) // Taking JSon because pass the data in JSon format.
				.body(requestBody) // pass the expected data
				.when()
				.post(end_URL);
		return  res;
	}

	public static Response PUT_Method(String requestBody, String end_URL) {
		return res=getRequestSpec()
				.contentType(ContentType.JSON) // Taking JSon because pass the data in JSon format.
				.body(requestBody) // pass the expected data
				.when()
				.put(end_URL);
	}
	public static Response PATCH_Method(String requestBody, String end_URL) {
		return res=getRequestSpec()
				.contentType(ContentType.JSON) // Taking JSon because pass the data in JSon format.
				.body(requestBody) // pass the expected data
				.when()
				.patch(end_URL);
	}
	public static Response DELETE_Method(String end_URL) {
		return res=getRequestSpec()
				.when()
				.delete(end_URL);
	}
}
