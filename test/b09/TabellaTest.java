package b09;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.Test;

class TabellaTest {

	@Test
	void test() {

		int x = 5;
		int y = 7;
		
		Tabella tab1 = new Tabella();
		tab1.add(y);
		tab1.add(x);
		
		Collection <Integer> actual = tab1.getData();
		Collection <Integer> expected = Arrays.asList(5, 7);
		assertEquals(expected, actual);
	}
	
	
	
	
	
	@Test
	void testCheck() {
		
		Tabella tab1 = new Tabella();
		boolean actualChecked = tab1.check(27);
		assertThat(actualChecked, is(false));
		
	}

	
	

}
