package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider = "data")
	public void bookTicketTest(String from, String to) {
		System.out.println("From: " + from + "\tTo: " + to);
	}
	
	@DataProvider
	public Object[][] data(){
		Object[][] obj = new Object[3][2];
		
		obj[0][0] = "hyd";
		obj[0][1] = "Delhi";
		
		obj[1][0] ="Hyd";
		obj[1][1] = "Kolkata";
		
		obj[2][0] = "Hyd";
		obj[2][1] = "Kochi";
		
		return obj;
	}
}
