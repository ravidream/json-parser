package com.test.json.object.parser;

import java.io.InputStream;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import com.test.json.JSONTest;

/**
 * This is an example using http://www.JSON.org lib
 * @author Ravi
 *
 */

public class JSONOrgLibParser {
	public static void parse() {
		//JSONObject object = new JSONObject(json);  // if you want to use the local json string you can comment the file read section
        InputStream is = JSONTest.class.getResourceAsStream("test-json.json");
        if (is == null) {
           throw new NullPointerException("Json File not found.");
        }
       System.out.println("\n\nJSON ORG Lib Example Output");
       JSONTokener tokener = new JSONTokener(is);
       JSONObject object = new JSONObject(tokener);
	        
       String dept = object.getJSONObject("employee").getString("dept");
       
	   System.out.println("dept : " + dept);
	   //System.out.println("\n");

       JSONArray arr = object.getJSONArray("personal_details");
       for (int i = 0; i < arr.length(); i++) {
           String id = arr.getJSONObject(i).getString("id");
           String name = arr.getJSONObject(i).getString("name");
           System.out.println("id : " + id);
           System.out.println("name : " + name);
       }
		
	}
}
