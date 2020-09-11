package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;


//import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	
	XSSFWorkbook wb;
	
	public ExcelDataProvider(){
		
		File src = new File("./TestData/testDataOne.xlsx");
		
		try {
			FileInputStream fir = new FileInputStream(src);
			wb = new XSSFWorkbook(fir);
		} catch (Exception e) {
			System.out.println("Unableto read Excel File "+ e.getMessage());
		}
	}
		
	public String getStringData(String sheetName, int row, int column){
		
	return	wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		
	}
	
	public String getStringData(int index, int row, int column){
		
		return	wb.getSheetAt(index).getRow(row).getCell(column).getStringCellValue();
			
		}
	
	public double getNumericData(String sheetName, int row, int column){
		
		return	wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}
//		XSSFSheet sheet1 = wb.getSheetAt(0);
//		String value1 = sheet1.getRow(0).getCell(0).getStringCellValue();
//		System.out.println(value1);
//		wb.close();
	
}
