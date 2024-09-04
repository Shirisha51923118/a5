package groupExecution;

import org.testng.annotations.Test;

public class Test1 {

	@Test(groups = "smoke")
	public void test1() {
		System.out.println("Test1 -test1 - smoke");
	}
	
	@Test(groups = "sanity")
	public void test2() {
		System.out.println("Test1 -test2 - sanity");
	}
	
	@Test(groups = {"smoke", "sanity"})
	public void test3() {
		System.out.println("Test1 -test3 - smoke and sanity");
	}
}
