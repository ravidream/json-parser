package com.test.json.object.parser;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Json Simple library
 * 
 * @author Ravi
 *
 */

public class JSONSimple {
	public static void parse() {
		JSONParser parser = new JSONParser();
		URL path = GSONParser.class.getResource("test-json.json");
		File file = new File(path.getFile());
		 
        try (Reader reader = new FileReader(file)) {
        	System.out.println("\n\nJSON Simple Example Output");
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            //System.out.println("jsonObject : " + jsonObject);

            String title = (String) jsonObject.get("title");
            System.out.println("title : " + title);
            
            JSONArray pd = (JSONArray) jsonObject.get("personal_details");
            System.out.println("personal_details : " + pd);
            
            for(int i = 0; i < pd.size(); i++) {
            	JSONObject jsonObj = (JSONObject) pd.get(i);
            	String id = (String) jsonObj.get("id");
            	System.out.println("id : " + id);
            	String name = (String) jsonObj.get("name");
            	System.out.println("name : " + name);
            }			 

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
	}
}//end of the class
