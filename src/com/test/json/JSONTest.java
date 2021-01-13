package com.test.json;

import com.test.json.json.path.JSONPathParser;
import com.test.json.object.parser.GSONParser;
import com.test.json.object.parser.JSONOrgLibParser;
import com.test.json.object.parser.JSONSimple;

/**
 * 
 * @author Ravi
 *
 */

public class JSONTest {
	static String json = "{\r\n" + 
			"    \"employee\": {\r\n" + 
			"            \"dept\": \"Computer Science\",\r\n" + 
			"            \"url\": \"https://www.example.com\"\r\n" + 
			"    },\r\n" + 
			"    \"personal_details\": [\r\n" + 
			"            {\r\n" + 
			"                \"id\": \"123456\",\r\n" + 
			"                \"name\": \"Jane Doe\",\r\n" + 
			"            }\r\n" + 
			"    ]\r\n" + 
			"}\r\n" + 
			"";
	
	public static void main(String[] args) {		
		JSONOrgLibParser.parse();
        
        JSONSimple.parse();
         
        GSONParser.parser();
		System.out.println(JSONPathParser.parseString(json, "$.personal_details[0].name"));
	}

}
