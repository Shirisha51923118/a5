package annotations;

import org.testng.annotations.Test;

public class TestClass extends BaseClass {

	@Test
	public void testMethod() {
		System.out.println("@Test");
	}
}
