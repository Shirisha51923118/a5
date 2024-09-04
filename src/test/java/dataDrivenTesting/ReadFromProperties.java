package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties {

	public static void main(String[] args) throws IOException {
		// Step 1: Convert physical file into java readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/data.properties");
		
		// Step 2: Create Properties class instance
		Properties property = new Properties();
		
		// Step 3: Load all key-value pairs to Properties instance from fis
		property.load(fis);
		
		// Step 4: Fetch data
		String browser = property.getProperty("browser");
		
		System.out.println(browser);
	}

}
