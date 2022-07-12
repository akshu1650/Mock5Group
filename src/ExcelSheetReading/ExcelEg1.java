package ExcelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//create excel sheet and pass the path along with name & extension in file
		File myfile=new File("C:\\Selenium\\ExcelSheet26thMar.xlsx");
		
		// using workbookfactory class read excel sheet
		
		// 1. String type
		String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(name);
		
		//2. numeric value
		double num1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
		System.out.println(num1);
		
		//3. char value
		String char1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		System.out.println(char1);
		
		//4. boolean value
		boolean abc = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(4).getBooleanCellValue();
		System.out.println(abc);
	
	
	
	}

}
