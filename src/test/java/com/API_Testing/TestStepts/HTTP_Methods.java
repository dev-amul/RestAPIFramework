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
	
	public Response post_Request(String dataForPost, String postBaseURI, String URIendpoint) 
	{
		Response postRequestResponse = 
				given()
				.contentType(ContentType.JSON)
				.body(dataForPost)
				.when()
				.post(pr.getProperty(postBaseURI)+"/"+pr.getProperty(URIendpoint));
		
		return postRequestResponse;
		
	}
	public Response get_Request(String baseURI, String gerFromURI) {
		
		Response fetchDataFromURI = 
				
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(pr.getProperty(baseURI)+"/"+pr.getProperty(gerFromURI));
				
				return fetchDataFromURI;
	}
 public Response get_PerticularID_Request(String baseURI, String gerFromURI, String dataId) {
		
		Response fetchDataFromId = 
				
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(pr.getProperty(baseURI)+"/"+pr.getProperty(gerFromURI)+"/"+dataId);
				
				return fetchDataFromId;
	}
	public Response put_Request(String payLoad, String baseuriForPut, String endURL, String expectedID) {
		
		Response putRequest_Respose = 
				
				given()
				.contentType(ContentType.JSON)
				.body(payLoad)
				.when()
				.put(pr.getProperty(baseuriForPut)+"/"+pr.getProperty(endURL)+"/"+expectedID);
				
				
				return putRequest_Respose;
	}
	public Response patch_Request(String existingData, String updateOnBaseURI, String endRUI) {
		
		Response patchRequestResponse = 
				
				given()
				.contentType(ContentType.JSON)
				.body(existingData)
				.when()
				.patch(pr.getProperty(updateOnBaseURI)+"/"+pr.getProperty(endRUI));
		
		return patchRequestResponse; 
		
	}
	
	public Response delete_Request( String delete_BaseURI, String endURI, String id) 
	{
		Response deleteRequest_response = 
				
				given()
				.contentType(ContentType.JSON)
				.when()
				.delete(pr.getProperty(delete_BaseURI)+"/"+pr.getProperty(endURI)+"/"+id);
		
				return deleteRequest_response; 
		
	}

}
