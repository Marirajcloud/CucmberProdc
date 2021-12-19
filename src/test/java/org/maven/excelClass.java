
package org.maven;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
public class excelClass extends BaseClass{
	
//	public static void dataExcel() throws IOException {
		
  
		
		//		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\mavenBase\\src\\test\\resources\\xl\\Book1.xlsx");
//		FileInputStream fs = new FileInputStream(f);
//		Workbook wb = new XSSFWorkbook(fs);
//		Sheet s = wb.createSheet("new");
//		Row r = s.createRow(0);
//		Cell c = r.createCell(0);
//		 c.setCellValue("xxx");
//		 FileOutputStream ot = new FileOutputStream(f);
//		 wb.write(ot);
//		 wb.close();
//		public static void readbyExcel() throws IOException {
////			String value = null;
////			File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Juitworkout\\target\\aadctn hotel data.xlsx");
////			FileInputStream fis = new FileInputStream(f);
////			Workbook wb = new XSSFWorkbook(fis);
////
////			Sheet sheet = wb.getSheet("Sheet");
////			Row row = sheet.getRow(i);
////			Cell cell = row.getCell(j);
//		   System.out.println("cell");
	
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
		

//		}
		public static void main(String[] args) throws IOException {
//			readbyExcel();
			System.out.println(BaseClass.getExcelDataforprovider());
		}}







