/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 15-Sep-2019
 *  FILE NAME  		: 	 HTTP_Methods.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.TestStepts;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HTTP_Methods 
{
	Properties pr; 
	public HTTP_Methods(Properties pr) {
		
		this.pr=pr;
	}
	
	public Response post_Request(String dataForPost, String postOnURI) 
	{
		Response postRequestResponse = 
				given()
				.contentType(ContentType.JSON)
				.body(dataForPost)
				.when()
				.post(pr.getProperty(postOnURI));
		
		return postRequestResponse;
		
	}
	public Response get_Request(String getFromURI) {
		
		Response fetchDataFromURI = 
				
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(pr.getProperty(getFromURI));
				
				return fetchDataFromURI;
	}
	public Response put_Request(String payLoad, String uriForPut) {
		
		Response putRequest_Respose = 
				
				given()
				.contentType(ContentType.JSON)
				.body(payLoad)
				.when()
				.put(pr.getProperty(uriForPut));
				
				
				return putRequest_Respose;
	}
	public Response patch_Request(String existingData, String updateOnURI) {
		
		Response patchRequestResponse = 
				
				given()
				.contentType(ContentType.JSON)
				.body(existingData)
				.when()
				.patch(pr.getProperty(updateOnURI));
		
		return patchRequestResponse; 
		
	}
	
	public Response delete_Request( String delete_URI) 
	{
		Response deleteRequest_response = 
				
				given()
				.contentType(ContentType.JSON)
				.when()
				.delete(pr.getProperty(delete_URI));
		
				return deleteRequest_response; 
		
	}

}
