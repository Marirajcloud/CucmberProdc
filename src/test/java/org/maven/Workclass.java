package org.maven;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Workclass {
	
public static void main(String[] args) throws IOException {
	BaseClass.browser("chrome");
	BaseClass.get("https://www.flipkart.com/");
//    BaseClass.driver.findElement(By.xpath("//a[text() = 'Login']")).click();
   
    WebElement user = BaseClass.driver.findElement(By.xpath("(//input[@type = 'text'])[2]"));
    BaseClass.FileRed(user, "user1");
	
	
	
}

	
	
	
	
//	BaseClass.browser("chrome");
//	BaseClass.get("http://www.adactin.com/HotelApp/ ");
//	BaseClass.maximaize();    
//    BaseClass.driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
//    WebElement user = BaseClass.driver.findElement(By.xpath("//input[@name='username']"));
//    WebElement pass = BaseClass.driver.findElement(By.xpath("//input[@name='password']"));
//    WebElement cnfrmpass = BaseClass.driver.findElement(By.xpath("//input[@name ='re_password']"));
//    WebElement fullname = BaseClass.driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//    WebElement mail = BaseClass.driver.findElement(By.xpath("(//input[@type='text'])[3]")); 
//    BaseClass.dataSendByExcel(user, 0, 0);
//    BaseClass.dataSendByExcel(pass, 1, 0);
//    BaseClass.dataSendByExcel(cnfrmpass, 1, 0);
//    BaseClass.dataSendByExcel(fullname, 1, 1);
//    BaseClass.dataSendByExcel(mail, 2, 0);
//    WebElement clk = 
//BaseClass.driver.findElement(By.xpath("//input[@type='checkbox']")); 
//    clk.click();
//    
		
		
		
		
    
	
}
