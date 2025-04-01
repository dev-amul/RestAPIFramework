/**
  * @author 			:	 sumitkumar
 *	DATE       		:	 15-Sep-2019
 *  FILE NAME  		: 	 HTTP_MethodsControllers.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.commoncontrollers;

import java.util.HashMap;
import java.util.Properties;
import com.API_Testing.utilities.MasterController;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
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
		 res=getRequestSpec()
				.accept(ContentType.JSON)
				.when()
				.get(pr.getProperty(end_URL));
		 return res;
	}
	public static HashMap<String, String> queryWithKey =new  HashMap<>();

	public static Response GET_Request_With_QuaryParam(String end_URL, HashMap<String, String> queryWithKey){
		res=getRequestSpec()
				.accept(ContentType.JSON)
				.queryParams(queryWithKey)
				.when()
				.get(pr.getProperty(end_URL));
		return res;
	}

	public static Response POST_Method(String requestBody, String end_URL) {
		res=getRequestSpec()
				.contentType(ContentType.JSON) // Taking JSON because pass the data in JSON format.
				.body(requestBody) // pass the expected data
				.when()
				.post(end_URL);
		return  res;
	}

	public static Response PUT_Method(String requestBody, String end_URL) {
		return res=getRequestSpec()
				.contentType(ContentType.JSON) // Taking JSON because pass the data in JSON format.
				.body(requestBody) // pass the expected data
				.when()
				.put(end_URL);
	}
	public static Response PATCH_Method(String requestBody, String end_URL) {
		return res=getRequestSpec()
				.contentType(ContentType.JSON) // Taking JSON because pass the data in JSON format.
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
