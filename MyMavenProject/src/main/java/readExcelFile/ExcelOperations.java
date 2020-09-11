package readExcelFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File src = new File("D:\\My Excel Data\\FirstFile.xlsx");
		FileInputStream fir = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fir);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String value1 = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value1);
		wb.close();

	}

}
