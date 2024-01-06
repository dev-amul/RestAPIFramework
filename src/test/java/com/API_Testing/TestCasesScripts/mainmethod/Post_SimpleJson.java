/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 11-Sep-2019
 *  FILE NAME  		: 	 Post_SimpleJson.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 7:05:56 pm
 */
package com.API_Testing.TestCasesScripts.mainmethod;

import org.json.JSONObject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class Post_SimpleJson {
	public static void main(String[] args) {	
		JSONObject empDetail = new JSONObject();
		
		empDetail.put("First Name", "Sumit");
		empDetail.put("Last Name", "Kumar Chaudhary");
		empDetail.put("Age", "28");
		empDetail.put("Gender", "Male");
		empDetail.put("Designname", "Software QA Engineer");
		empDetail.put("Experience", "2.6");
		
	Response res= 
				given()
				.contentType(ContentType.JSON)
				.when()
				.body(empDetail.toString())
				.post("http://localhost:3000/Simple_Json");
	
	int postStatusCode = res.getStatusCode();
	String finalData = res.asString();
	
	System.out.println("Post Request Status Code is \t:\t"+postStatusCode);
	System.out.println("Data send to json server using post request\n"+finalData);
		
	}

}
