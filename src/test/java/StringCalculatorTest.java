import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

	StringCalculator calculator;

	@Before
	public void setup() {
	calculator = new StringCalculator();}
	
	@Test
	public void shouldReturnBasicValues() {
			assertEquals(0, calculator.add(""));
		assertEquals(1, calculator.add("1"));
	}

	@Test
	public void shouldReturnSum() throws Exception {
		assertEquals(3, calculator.add("1,2"));
		assertEquals(13, calculator.add("1,2,5,4,1"));
	}
	
	@Test
	
}
