/**
 * @author 			:	 Sumit Chaudhary
 *	DATE       		:	 06-Dec-2020
 *  FILE NAME  		: 	 All_Type_DataGenerator.java
 *  PROJECT NAME 	:	 payworldapis
 * 	Time			:    10:11:25 PM
 */
package com.API_Testing.utilities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.io.FileUtils;
import org.jose4j.jws.AlgorithmIdentifiers;
import org.jose4j.jws.JsonWebSignature;
import org.jose4j.keys.HmacKey;
import org.jose4j.lang.JoseException;
import org.json.*;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;
import java.util.regex.Pattern;

public class MasterController {

	/**
	 * @auther Sumit Kumar Chaudhary
	 * ConvertStringJsonIntoJsonFormate method helps to convert String JSON in the JSON formate.
	 * So that we can print readable formate
	 * @param jsonString require a string type param
	 *                   and this method prints the JSON data into the console
	 */
	public static void convertStringJsonIntoJsonFormat(String jsonString){
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
		String prettyJson = gson.toJson(jsonObject);
		System.out.println(prettyJson);
	}

	/**
	 * @author Sumit Kumar Chaudhary
	 * getAbsolutePath method help to read or fetch the file name by its name.
	 * It's responsible to search your file whenever the file is
	 * @param fileName require file name with extension
	 *                 example if you want to read JSON file, then you need to provide jsonFileName.json and so and so.
	 */

	public static String getAbsolutPath(String fileName) {
		String fileAbolutePath ="";
		try {
			boolean recursive = true;
			//Collection method
			Collection<File> files = FileUtils.listFiles(new File(System.getProperty("user.dir")), null, recursive);
            for (File file : files) {
                if (file.getName().equals(fileName))
                    fileAbolutePath = file.getAbsolutePath();
            }

		} catch (Exception e) {
			e.printStackTrace();
		}
		return fileAbolutePath;
	}

	public static Set<String> getJSONDataAllKeys(JSONObject jsonObject) {
		Set<String> keys = new HashSet<>();
		extractKeys(jsonObject, keys);
		return keys;
	}

	private static void extractKeys(JSONObject jsonObject, Set<String> keys) {
		for (String key : jsonObject.keySet()) {
			keys.add(key);
			Object value = jsonObject.get(key);

			if (value instanceof JSONObject) {
				extractKeys((JSONObject) value, keys); // Recursive call for nested JSON object
			} else if (value instanceof JSONArray) {
				extractKeysFromArray((JSONArray) value, keys); // Handling arrays
			}
		}
	}

	private static void extractKeysFromArray(JSONArray jsonArray, Set<String> keys) {
		for (Object obj : jsonArray) {
			if (obj instanceof JSONObject) {
				extractKeys((JSONObject) obj, keys); // Recursive call for objects within arrays
			} else if (obj instanceof JSONArray) {
				extractKeysFromArray((JSONArray) obj, keys); // Handle nested arrays
			}
		}
	}

	public static Properties loadProperties() {
		Properties prop = new Properties();
		String environment = System.getProperty("env");

		if (environment == null) {
			environment = "testEnv";
			//mvn test -Pint
		}

		String filePath = environment + ".properties";
		//System.out.println(filePath);

		try (InputStream resourceAsStream = MasterController.class.getClassLoader().getResourceAsStream(filePath)) {
			prop.load(resourceAsStream);
		} catch (IOException e) {
			System.err.println("Unable to load properties file : " + filePath);
		}

		return prop;
	}
	static Random secureRnD;
	public static String randomStringTypeData(int stringDataLength) {
		secureRnD= new Random();
		String alphabetSource ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		
		StringBuilder buildString = new StringBuilder(stringDataLength);
		for (int i = 0; i < stringDataLength; i++) {
			
			buildString.append(alphabetSource.charAt(secureRnD.nextInt(alphabetSource.length())));
			}	
		return buildString.toString();	
		}
	public static String randomUpperCaseStringTypeData(int stringDataLength) {
		secureRnD= new Random();
		String alphabetSource ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		StringBuilder buildString = new StringBuilder(stringDataLength);
		for (int i = 0; i < stringDataLength; i++) {
			
			buildString.append(alphabetSource.charAt(secureRnD.nextInt(alphabetSource.length())));
			}	
		return buildString.toString();	
		}
	
	public static String randomAlphaStringTypeData(int stringDataLength) {
		secureRnD= new Random();
		String alphabetSource ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
		
		StringBuilder buildString = new StringBuilder(stringDataLength);
		for (int i = 0; i < stringDataLength; i++) {
			
			buildString.append(alphabetSource.charAt(secureRnD.nextInt(alphabetSource.length())));
			}	
		return buildString.toString();	
		}
	public static String randomStringWithSpecialCharTypeData(int stringDataLength) {
		secureRnD= new Random();
		String alphabetSource ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*/.,<>?";
		
		StringBuilder buildString = new StringBuilder(stringDataLength);
		for (int i = 0; i < stringDataLength; i++) {
			
			buildString.append(alphabetSource.charAt(secureRnD.nextInt(alphabetSource.length())));
			}	
		return buildString.toString();	
		}
	
	public static String randomAlphaStringSpecialTypeData(int stringDataLength) {
		secureRnD= new Random();
		String alphabetSource ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*/.,<>?";
		
		StringBuilder buildString = new StringBuilder(stringDataLength);
		for (int i = 0; i < stringDataLength; i++) {
			
			buildString.append(alphabetSource.charAt(secureRnD.nextInt(alphabetSource.length())));
			}	
		return buildString.toString();	
		}
	
	public static String getRandomNumberString(String noOfDigit) {
	    Random rnd = new Random(); // It will generate 6 digit random Number.
		int number = rnd.nextInt(999999); // From 0 to 999,999
		// this will convert any number sequence into character 6.
	    return String.format("%0"+noOfDigit+"d", number);
	}
	public static double randomDoubleData() {
		secureRnD = new Random();
        return secureRnD.nextDouble();
	}
	
	public static String getUniqueEnginTransNo(String providerId) {
		//provider_id+date('ymdH')+AAA(Increase after every txn) //6320120911AAAB
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; // Note: zero based!
		int day = now.get(Calendar.DAY_OF_MONTH);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		String engineTransNo =providerId+String.valueOf(year).substring(2)+month+""+day+""+hour+randomUpperCaseStringTypeData(4);	
		return engineTransNo;
	}
	public static String getCashoutUniqueEnginTransNo() {
		//provider_id+date('ymdH')+AAA(Increase after every txn) //AWFNG20110939617757
																 //GYTDL20123018732867
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; // Note: zero based!
		int day = now.get(Calendar.DAY_OF_MONTH);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		String engineTransNo =randomUpperCaseStringTypeData(5)+String.valueOf(year).substring(2)+month+""+day+""+hour+""+getRandomNumberString("6");	
		return engineTransNo;
	}
	
	public static String removeCharAt(String s, int pos) {
	      return s.substring(0, pos) + s.substring(pos + 1);
	   }
	
	public static String getCurrentDateTime(){
		SimpleDateFormat formatDate= new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a");
		String currtDateTime=formatDate.format(new Date());
		
		return currtDateTime;
	}
	
	public static String getCurrectTimeExcMeridiem() {
		SimpleDateFormat formatDate= new SimpleDateFormat("ddMMyyhhmmss");
		String currtDateTime=formatDate.format(new Date());
		return currtDateTime;
	}
	public static String getRoundValue(int numberOfDigitsAfterDecimalPoint, String expectedValue) {
		BigDecimal bDecimal = new BigDecimal(expectedValue);
		bDecimal=bDecimal.setScale(numberOfDigitsAfterDecimalPoint, BigDecimal.ROUND_HALF_UP);
		return bDecimal.toString();
	}

	public static JSONObject readJsonFile (String fileName) {
		try {
			JSONTokener parseFileToJSOn = new JSONTokener(new FileReader(MasterController.getAbsolutPath(fileName)));//parse the string data in to json format. Because file get the data in string format.
			return new JSONObject(parseFileToJSOn);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}


	public static String convertJSON_TO_XML(String fileName) throws RuntimeException {
		try {
			FileReader readFile = new FileReader(MasterController.getAbsolutPath(fileName));
			JSONTokener parseFile = new JSONTokener(readFile);
			JSONObject storeObj = new JSONObject(parseFile);
			return XML.toString(storeObj);

		}catch(Exception e){
			throw new RuntimeException();
		}
	}

	public static JSONObject covertXML_TO_JSON (String fileName) {

		try {
			FileReader readFile = new FileReader(MasterController.getAbsolutPath(fileName));
			BufferedReader getFileData = new BufferedReader(readFile);
			String store;
			String increaseData = null;
			while ((store = getFileData.readLine()) != null) {
				increaseData += store;
			}
			JSONObject convertedJSOn = XML.toJSONObject(increaseData);
			getFileData.close();
			return convertedJSOn;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public String checkSum;
	public String unixTimeStamp;


	public String getCheckSum() {
		return checkSum;
	}
	public void setCheckSum(String checkSum) {
		this.checkSum = checkSum;
	}
	public String getUnixTimeStamp() {
		return unixTimeStamp;
	}
	public void setUnixTimeStamp(String unixTimeStamp) {
		this.unixTimeStamp = unixTimeStamp;
	}

	private static String getClientSecret() {
		return "CwGju0QUdQ1ua6G6YrQQwoUl9WA5luFUDip9api9";
	}

	public static MasterController fetchCheckSumAndTimeStamp() {
		MasterController obj= new MasterController();
		try {
			Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
			SecretKeySpec secret_key = new SecretKeySpec(getClientSecret().getBytes(StandardCharsets.UTF_8), "HmacSHA256");
			sha256_HMAC.init(secret_key);
			String unixTime = String.valueOf(Instant.now().getEpochSecond());
			obj.setCheckSum(Hex.encodeHexString(sha256_HMAC.doFinal(unixTime.getBytes(StandardCharsets.UTF_8))));
			obj.setUnixTimeStamp(unixTime);
		} catch (Exception e) {
			e.getStackTrace();
		}
		return obj;
	}


	public static String generateEncryptedJson(String secretKey, String payLoad) throws UnsupportedEncodingException, JoseException {
		Key verifyKey = new HmacKey(secretKey.getBytes(StandardCharsets.UTF_8));
		JsonWebSignature jws = new JsonWebSignature();
		jws.setHeader("alg", "HS256");
		jws.setHeader("typ","JWT");
		jws.setPayload(payLoad);
		jws.setAlgorithmHeaderValue(AlgorithmIdentifiers.HMAC_SHA256);
		jws.setKey(verifyKey);
		jws.setDoKeyValidation(false);
		return jws.getCompactSerialization();
	}

	public static JSONObject decryptJWTPayload(String encryptedPayload) {
		String[] split_string = encryptedPayload.split("\\.");
		//String base64EncodedHeader = split_string[0];	//uncomment line if you want to decode the header part
		String base64EncodedBody = split_string[1];
		//String base64EncodedSignature = split_string[2];		//uncomment line if want to decode Signature part
		org.apache.commons.codec.binary.Base64 base64Url = new Base64(true);
	    /*
	    String header = new String(base64Url.decode(base64EncodedHeader));
		*/
		String decryptedBody = new String(base64Url.decode(base64EncodedBody));
		return new JSONObject(decryptedBody);
	}

	public static String getValueFromJson(String srhObj, String srhArray, String srchArray, String srchKey, String srchValu, String gtExtData) throws FileNotFoundException{
		JSONObject jsonBody = MasterController.readJsonFile("CoremrkData.json");
		JSONObject fetchedObject= jsonBody.getJSONObject(srhObj);//get the first Object value because jSon starting from jSon
		JSONArray getOptionalArr= fetchedObject.optJSONArray(srhArray);//here I'm assumed as an array but get the key value
		JSONObject getNewObject = null;
		for(int i=0; i<getOptionalArr.length(); i++) {
			JSONObject getNextObj = getOptionalArr.getJSONObject(i);
			JSONArray newArray = getNextObj.getJSONArray(srchArray);
			for(int j=0 ; j<newArray.length(); j++) {
				getNewObject = newArray.getJSONObject(j);
				if(getNewObject.get(srchKey).equals(srchValu)){
					break;
				}
			}
		}
		assert getNewObject != null;
		return  getNewObject.get(gtExtData).toString();
	}
	public static String fetchDataFromJSON(String jsonBody, String srcArrKey, String srhKey, String srhValue, String gtExtData) throws JSONException {
		JSONObject jsonData = new JSONObject(jsonBody);
		JSONArray getArray = jsonData.getJSONArray(srcArrKey);
		JSONObject getObject=new JSONObject();
		for (int i=0 ; i<getArray.length(); i++) {
			getObject = getArray.getJSONObject(i);
			for(int j=0; j<getObject.length(); j++){
				if(getObject.get(srhKey).equals(srhValue)) {
					break;
				}
			}
		}
		return  getObject.get(gtExtData).toString();
	}
	public static String replaceVariablesAsPerKeys(String jsonFileName, String enterReplacementValues) throws FileNotFoundException, JSONException {
		// Call the JSON file reader method
		JSONObject storeJsonobj= MasterController.readJsonFile(jsonFileName);
		//Get the keys from JSON file and store in iterator Variable
		Iterator<String> getJSONKeys = storeJsonobj.keys();
		//Convert JSON data in string and store in variables.
		String jsonBody = storeJsonobj.toString();

		String s3=null;
		//Using scanner class for taking input from console for replace all values as per variable of the jSOn file
		// Run the while loops to get all keys one by one
		while(getJSONKeys.hasNext()) {
			//stores all values in string variable
			String jSonKeys= getJSONKeys.next();
			//get variables from jSon data as per keys
			String getVariables= storeJsonobj.getString(jSonKeys);

			System.out.print(jSonKeys+"\t:\t");
			//Replace the variable values
			jsonBody=jsonBody.replaceAll(Pattern.quote(getVariables), enterReplacementValues);
			s3=jsonBody;
		}
		System.out.println("********** Json before replace the variable ********** \n");
		System.out.println(storeJsonobj);
		System.out.println("********** json after replace the variable  ********** \n");
		return s3;
	}
	public static String fetchAndUpdateData(String jsonBody, String srcArrKey, String srhKey, String srhValue, String NewKey, String newValue) throws JSONException {
		// Get the JSON body and store in JSON object
		JSONObject jsonData = new JSONObject(jsonBody);
		//Fetch the array value on a behalf search key and store in array variable
		JSONArray getArray = jsonData.getJSONArray(srcArrKey);
		//Taking here one more JSON Object variable for further use
		JSONObject getObject=null;
		//run the loop end of the array length
		for (int i=0 ; i<getArray.length(); i++) {
			//get the all objects inner on an array
			getObject = getArray.getJSONObject(i);
			//run the loop end of the object length
			for(int j=0; j<getObject.length(); j++) {
				// compare the value on behalf of a key
				if(getObject.get(srhKey).equals(srhValue)) {
					//add a new object in an existing object on data
					getObject.put(NewKey, newValue);
					break;
				}
			}
		}
		// here return the percent's data after update
		return  jsonData.toString();
	}


}

