package org.maven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.apache.xmlbeans.impl.schema.FileResourceLoader;

public class FileProperties {
	
//	public static void FileRed() throws IOException {
//		FileReader  f = new FileReader("C:\\Users\\ELCOT\\eclipse-workspace\\mavenBase\\src\\test"
//				+ "\\resources\\xl\\Properties");
//		Properties prop = new Properties();
//		prop.load(f);
//		System.out.println(prop.getProperty("User"));
	
//	
//		public static String FileRed(String key ) throws IOException {
//	FileReader  f = new FileReader("C:\\Users\\ELCOT\\eclipse-workspace\\mavenBase\\src\\test"
//			+ "\\resources\\xl\\Properties");
//	Properties prop = new Properties();
//	prop.load(f);
//	prop.getProperty(key);
//	return key;
	
	
	public static void FileRed( ) throws IOException {
		FileWriter  f = new FileWriter("C:\\Users\\ELCOT\\eclipse-workspace\\mavenBase\\src\\test"
				+ "\\resources\\xl\\Properties");
		Properties prop = new Properties();
		prop.setProperty("user1", "Mari");
		prop.store(f, "File saved");
		
		FileReader  fs= new FileReader("C:\\Users\\ELCOT\\eclipse-workspace\\mavenBase\\src\\test"
				+ "\\resources\\xl\\Properties");	
		
		Properties pro = new Properties();
		prop.load(fs);
		System.out.println(prop.getProperty("user1"));
		
	System.out.println("finish");
//	
	

}
public static void main(String[] args) throws IOException {
	FileRed();
}}
