package JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {

	@Test 
	public void test() {
		Addition s=new Addition();
		
		assertEquals(2,s.divide(5, 2));
		
		
	}
	@Test (expected=ArithmeticException.class)
	public void test1(){
		Addition s=new Addition();
		
				assertEquals(0,s.divide(5, 0));
	}

}
