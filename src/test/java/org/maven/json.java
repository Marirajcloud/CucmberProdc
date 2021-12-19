package org.maven;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class json {
	public static void jsonRead() throws FileNotFoundException {
		FileReader f = new FileReader("C:\\Users\\ELCOT\\eclipse-workspace\\mavenBase\\src\\test\\resources\\xl\\jsonFile.json");
		JSONParser parse = new JSONParser();
		Object object;
		try {
		Object j = parse.parse(f);
		 JSONObject obj = (JSONObject) j ;
		String name =  (String) obj.get("Name");
		String course =  (String) obj.get("Course");
		System.out.println(name);
		System.out.println(course);
		JSONArray a = (JSONArray)obj.get("subjects");
		for (Object object2 : a) {
			System.out.println(a);
		}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
public static void main(String[] args) throws FileNotFoundException {
	jsonRead();
}
}
