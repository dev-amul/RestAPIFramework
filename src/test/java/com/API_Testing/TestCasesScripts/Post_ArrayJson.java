/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 14-Sep-2019
 *  FILE NAME  		: 	 Post_ArrayJson.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 12:24:23 am
 */
package com.API_Testing.TestCasesScripts;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Post_ArrayJson {
	public static void main(String[] args) {
		JSONObject userInfo = new JSONObject();
		userInfo.put("id", "user_0");
		userInfo.put("Name", "Sumit");
		userInfo.put("dob", "17 June 1990");
		userInfo.put("add", "Sector 50 Noida UP ");
		userInfo.put("city", "Noida");
		userInfo.put("Contact Number", "9971458090");
		
		
		JSONObject userOrder = new JSONObject();
		
		userOrder.put("Order_id", "Order_001");
		userOrder.put("Order Type", "Cake");
		userOrder.put("Flavor", "Chocolate");
		userOrder.put("Order Qty", "1");
		userOrder.put("Order Size", "Mediam");
		userOrder.put("Order Date", "14 Sep 2019");
		
		
		JSONObject seconOrder = new JSONObject();
		
		seconOrder.put("Order_id", "Order_002");
		seconOrder.put("Order Type", "Pizza");
		seconOrder.put("Flavor", "Corn Slice");
		seconOrder.put("Order Qty", "1");
		seconOrder.put("Order Size", "large");
		seconOrder.put("Order Date", "14 Sep 2019");
		
		
		JSONObject userDetail= new JSONObject();
		userDetail.put("User Details", userInfo);
	
		
		JSONObject orderDetails = new JSONObject();
		
		orderDetails.put("Cake Details", userOrder);
		orderDetails.put("Pizza Order", seconOrder);
		
		JSONArray or = new JSONArray();
		
		or.put(orderDetails);
		
		userInfo.put("Order Items List", or);
		
		JSONArray userIndex= new JSONArray();
		
		userIndex.put(userDetail);
		
		
		
		String data = userIndex.toString();
		
		Response responseData = given().contentType(ContentType.JSON).body(data).when().post("http://localhost:3000/Json_Array");
		
		int postStatusCode = responseData.getStatusCode();
		String finalData = responseData.asString();
		
		System.out.println("Post Request Status Code is \t:\t"+postStatusCode);
		System.out.println("Data send to json server using post request\n"+finalData);
		
		
	}

}
