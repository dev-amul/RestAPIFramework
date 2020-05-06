/**
  * @author 			:	 sumitkumar
 *	DATE       		:	 15-Sep-2019
 *  FILE NAME  		: 	 HTTP_Methods.java
 *  PROJECT NAME 	:	 RestAPI_Framework
 * 
 */
package com.API_Testing.TestStep_HTTP_Methods;

import java.util.Properties;

import com.jayway.restassured.specification.RequestSpecification;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HTTP_Methods 
{
	//Properties variable to pass the properties file read data. 
	Properties pr; 
	//Creating constructor for pass the variable to all test cases. 
	public HTTP_Methods(Properties pr) {
		
		this.pr=pr;
	}
	
	//Post method for create record. Method required 3  parameter 
	//dataForPost -- require the the data string in format, postBaseURI --require the base URL of the resource , URIendpoint -- require point of the url 
	public Response post_Request(String dataForPost, String postBaseURI, String URIendpoint) 
	{
		Response postRequestResponse = //Store all the response 
				given() 
				.contentType(ContentType.JSON) // Taking JSon because pass the data in JSon format. 
				.body(dataForPost) // pass the expected data 
				.when()
				.post(pr.getProperty(postBaseURI)+"/"+pr.getProperty(URIendpoint)); // method require the URL where we want to post the data. 
		
		return postRequestResponse;
		
	}
	//Method for fetch the all data as per the given URL 
	public Response get_Request(String baseURI, String gerFromURI) {
		
		Response fetchDataFromURI = 
				
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(pr.getProperty(baseURI)+"/"+pr.getProperty(gerFromURI));
				
				return fetchDataFromURI;
	}
	
	// Method for fetch the data as per given particular id or end url. 
	public Response get_PerticularID_Request(String baseURI, String gerFromURI, String dataId) {
		
		Response fetchDataFromId = 
				
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(pr.getProperty(baseURI)+"/"+pr.getProperty(gerFromURI)+"/"+dataId);
				return fetchDataFromId;
	}
	
	//Method for modify the existing data as per the given id or end url. 
	public Response put_Request(String payLoad, String baseuriForPut, String endURL, String expectedID) {
		
		Response putRequest_Respose = 
				given()
				.contentType(ContentType.JSON)
				.body(payLoad)
				.when()
				.put(pr.getProperty(baseuriForPut)+"/"+pr.getProperty(endURL)+"/"+expectedID);
				return putRequest_Respose;
	}
	
	//Method for update the data as per given id or end point. 
	public Response patch_UpdateData (String updateData, String baseuriForPut, String endURL, String expectedID)
	{
		 
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.when()
				.body(updateData.toString())
				.patch(pr.getProperty(baseuriForPut)+"/"+pr.getProperty(endURL)+"/"+expectedID);
		return res;
	}
	//Method for delete the data from the given url. 
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
