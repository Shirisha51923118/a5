package groupExecution;

import org.testng.annotations.Test;

public class Test4 {

	@Test
	public void test1() {
		System.out.println("Test4 -test1 - no group");
	}
	
	@Test(groups = {"smoke", "sanity", "regression"})
	public void test2() {
		System.out.println("Test4 -test2 - smoke and sanity and regression");
	}
}
