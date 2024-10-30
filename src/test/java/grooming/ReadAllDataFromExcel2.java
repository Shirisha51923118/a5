package grooming;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadAllDataFromExcel2 {

	@Test
	public void readMultipleData() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");

		DataFormatter df = new DataFormatter();
		List<Map<String, String>> list = new ArrayList<Map<String,String>>();
		Map<String, String> map = new HashMap<String, String>();
		
		for (int i = 1; i < sheet.getRow(i).getLastCellNum(); i++) {
			for(int j = 0; j <= sheet.getLastRowNum(); j++) {
				map.put(df.formatCellValue(sheet.getRow(j).getCell(0)), 
						df.formatCellValue(sheet.getRow(j).getCell(i)));
			}
			list.add(map);
		}
		
		System.out.println(list);
		wb.close();
	}
}
