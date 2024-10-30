package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromColumns {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Step 1: Convert physical file into java readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");

		// Step 2: Open Workbook
		Workbook wb = WorkbookFactory.create(fis);

		// Step 3: Go to particular sheet
		Sheet sheet = wb.getSheet("Sheet1");

		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			System.out.println(sheet.getRow(i).getCell(0).getStringCellValue());
		}

		wb.close();
	}

}
