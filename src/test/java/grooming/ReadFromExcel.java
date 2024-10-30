package grooming;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadFromExcel {

	@Test
	public void readFromExcel() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data1 = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		double data2 = wb.getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
		
		System.out.println(data1);
		System.out.println(data2);
		
		wb.close();		
	}
}
