package com.API_Testing.TestCasesScripts.DummyApis;

import com.API_Testing.commoncontrollers.HTTP_MethodsControllers;
import com.API_Testing.utitlites.AllTypeDataRead;
import com.API_Testing.utitlites.MasterController;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestCompareResponseParametersKeys extends HTTP_MethodsControllers {
        public static Set<String> getAllKeys(JSONObject jsonObject) {
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

        public static void main(String[] args) {
            String jsonString = "{\n" +
                    "  \"data\": {\n" +
                    "    \"id\": 2,\n" +
                    "    \"email\": \"janet.weaver@reqres.in\",\n" +
                    "    \"first_name\": \"Janet\",\n" +
                    "    \"last_name\": \"Weaver\",\n" +
                    "    \"avatar\": \"https://reqres.in/img/faces/2-image.jpg\"\n" +
                    "  },\n" +
                    "  \"support\": {\n" +
                    "    \"url\": \"https://contentcaddy.io?utm_source=reqres&utm_medium=json&utm_campaign=referral\",\n" +
                    "    \"text\": \"Tired of writing endless social media content? Let Content Caddy generate it for you.\"\n" +
                    "  }\n" +
                    "}";

            JSONObject jsonObject = new JSONObject(jsonString);
            Set<String> allKeys = getAllKeys(jsonObject);

            for (String key : allKeys) {
                System.out.println(key);
            }
        }
}

