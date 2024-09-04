package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Step 1: Convert physical file into java readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		
		// Step 2: Open Workbook
		Workbook wb = WorkbookFactory.create(fis);
		
		// Step 3: Go to particular sheet
		Sheet sheet = wb.getSheet("Sheet1");
		
		// Step 4: Go to particular row
		Row row = sheet.getRow(3);
		
		// Step 5: Go to particular cell
		Cell cell = row.getCell(1);
		
		// Step 6: Fetch Data
		String data = cell.getStringCellValue();
		System.out.println(data);
		
		// Step 7: Close Workbook
		wb.close();		
	}

}
