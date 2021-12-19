package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	

	
	public static WebDriver driver;
	
	public static void browser (String browser) {
		switch (browser) {
		
		case  ("chrome") :
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case  ("firefox"):
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selinium\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
			break;
}
		}
	
	public static Object[][] getExcelDataforprovider() throws IOException{
		Object[][] value = null;
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\saams\\src\\test\\resources\\resrcc\\dataprovider.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
         Sheet sh = wb.getSheet("Sheet1");
         Row row = sh.getRow(0);
         int NumRows = sh.getPhysicalNumberOfRows();
         int Numcloumns = row.getLastCellNum();
        Cell cell;
        value = new Object[NumRows-1][Numcloumns];
        for(int i =1;i<=NumRows;i++) {
        	for(int j  =0;j<=Numcloumns;j++) {
        		row = sh.getRow(i);
        		cell = row.getCell(j);
        		value[i-1][j]=cell.getStringCellValue();
        		
        	}
        }
         
	  	return value;
	}
	
	public static void get(String link) {
		driver.get(link);
	}
	
	public static void maximaize() {
		driver.manage().window().maximize();
	}
	
	public static void send(WebElement element , String data) {
	element.sendKeys(data);
	
		
	}
	
	public static void clk(WebElement element) {
		element.click();
	}
	
	public static void getAttribute(WebElement element) {
		String data = element.getAttribute("value");
		System.out.println(data);
		
	}
	
	public static String dataSendByExcel(WebElement element,int i, int j) throws IOException {
		String value = null;
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\mavenBase\\src\\test\\resources\\xl\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
	
		Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(i);
				Cell cell = row.getCell(j);
				value = cell.getStringCellValue();
				element.sendKeys(value);
			return value;
	}
	
	public static String FileRed(WebElement element, String key ) throws IOException {
		FileReader  f = new FileReader("C:\\Users\\ELCOT\\eclipse-workspace\\mavenBase\\src\\test"
				+ "\\resources\\xl\\Properties");
		Properties prop = new Properties();
		prop.load(f);
		String s = prop.getProperty(key);
		element.sendKeys(s);
		return key;
		
	}}
