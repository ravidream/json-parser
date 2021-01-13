package com.test.json.object.parser;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URL;

import com.google.gson.Gson;
import com.test.json.dto.DataDTO;

/**
 * 
 * @author Ravi
 *
 */

public class GSONParser {
	public static void parser() {
		 Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
		 URL path = GSONParser.class.getResource("test-json.json");
		 File file = new File(path.getFile());
	        //try (Reader reader = new FileReader("Complete path\\test-json.json")) {
		     try (Reader reader = new FileReader(file)) {
	            // Convert JSON File to Java Object
	        	DataDTO dataDTO = gson.fromJson(reader, DataDTO.class);
	            
	            String data = gson.toJson(dataDTO);
	            System.out.println("data : " +  data);
	            
	            data = gson.toJson(dataDTO);
	            System.out.println("data : " +  data);            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}
