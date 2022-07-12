package ExcelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("C:\\Selenium\\ExcelSheet26thMar.xlsx");
		
		//Dynamic coding 
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		
		// now we have to count total num of rows in excel
		
		int totalnumofrows = mysheet.getLastRowNum();// will give total row count
		int rowcount = totalnumofrows;// it starts from 0 to 2
		System.out.println("total num of rows "+rowcount);
	
		// now we have to count total num of cell in excel
		// as we know totalnumofrow=totalnumofcell
		
		short totalnumofcell = mysheet.getRow(totalnumofrows).getLastCellNum();
		int cellcount = totalnumofcell-1;// it starts from 1 to 3
		System.out.println("total num of cell are "+cellcount);
		
		// now we have to traverse the element from excel sheet using for loop
		
		for(int i=0; i<=rowcount; i++)// outer for loop for rows
		{
		
			for(int j=0; j<=cellcount; j++)//inner for loop for rows
			{
				Cell cellValue = mysheet.getRow(i).getCell(j);// it will give each value data type present in excel
				CellType dataType = cellValue.getCellType();
				if(dataType==CellType.STRING)
				{
					 String value = cellValue.getStringCellValue();
					 System.out.print(value+" ");
				}		
				// muitple verfication point we are using else if
				else if (dataType==CellType.NUMERIC)
				{
					double value = cellValue.getNumericCellValue();
					System.out.print(value+" ");
				}	
	
				else if(dataType==CellType.BOOLEAN)
				{
					boolean value = cellValue.getBooleanCellValue();
					System.out.print(value+" ");
				}
			
				else if(dataType==CellType.BLANK)
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();		
		}
		
	}
}