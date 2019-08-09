package b05;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class SimpleTest {
	
	 
	@Test
	void isEvenFalse() {
		Simple simple = new Simple();
		boolean result = simple.isEven(43);
		
		assertFalse(result);
	}
}
