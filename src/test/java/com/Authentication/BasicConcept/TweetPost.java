/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 19-Jul-2019
 *  FILE NAME  		: 	 TweetPost.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 10:14:05 pm
 */
package com.Authentication.BasicConcept;



public class TweetPost {
	public static void main(String[] args)
	{
		String consumer_key = "Eteg94c0dSfEHmeMsZhaHk24L";
		String consumer_Secret = "kCiLXlABjoIbzulmTCvU6e0RVcuNCfl7phJNsyeHdNqa5FJG10";
		String access_Token ="1152060055908315136-2JokFSnkDHIjowM1QS7ANzUbb01OsC";
		String token_Secret ="JXHJ5YMGzJ6lJOfH4Ng7dBFGTb9Xfc5g57VhR7TATBVu9";
	   /*
	    RestAssured.baseURI="https://api.twitter.com/1.1/statuses";
			Response res=
			given()
			.contentType(ContentType.JSON)
			.auth()		
			.oauth(consumer_key, consumer_Secret, access_Token, token_Secret)
			.queryParam("status","Tody is 10 december and tweet using seleneium")
			.when()
			.post("/update.json");
		
			System.out.println(res.asString());*/
			
		
		}


}
