package problemone;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathTest {

	@Test
	public void testAdd() {
		Math m = new Math();
		assertEquals(5, m.addValues(2, 3));
	}
	
	@Test
	public void testSubtract() {
		Math m = new Math();
		assertEquals(-1, m.subtractValues(2, 3));
	}
	
	@Test
	public void testMultiply() {
		Math m = new Math();
		assertEquals(6, m.multiplyValues(2, 3));
	}
	
	@Test
	public void testDivide() {
		Math m = new Math();
		assertEquals(2, m.divideValues(6, 3));
	}

}
