package com.test.json.json.path;

import com.jayway.jsonpath.JsonPath;

/**
 * 
 * @author Ravi
 *
 */

public class JSONPathParser {

	public static String parseString(String json, String jsonPathStr) {
		JsonPath jsonPath = JsonPath.compile(jsonPathStr);
		return jsonPath.read(json);
	}
}
