package javatour;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FractionTests {

	@Test
	void testFraction() {
		new Fraction(2,3);
	}

	@Test
	void testToString() {
		Fraction f = new Fraction(2,3);
		assertEquals(f.toString(), "2/3");
		
		//TODO add more tests!
	}

	@Test
	void testEqualsObject() {
		Fraction f = new Fraction(2,3);
		
		assertEquals(f, f);
		
		assertFalse(f.equals(null));
		
		assertFalse(f.equals("Bad"));

		Fraction f1 = new Fraction(1,3);
		assertFalse(f.equals(f1));
		
		Fraction f2 = new Fraction(2,3);
		assertEquals(f, f2);

		Fraction f4by6 = new Fraction(4,6);
		assertEquals(f, f4by6);
		
		//TODO add more tests!
	}

	@Test
	void testEval() {
		Fraction f = new Fraction(1,2);
		
		assertEquals(0.5, f.eval());
		
		//TODO add more tests!
	}

	@Test
	void testPlus() {
		Fraction f = new Fraction(1,3);
		
		assertEquals(new Fraction(2, 3), f.plus(f));
		
		//TODO add more tests!
	}

	@Test
	void testMinus() {
		Fraction f1 = new Fraction(1,3);
		Fraction f2 = new Fraction(2,3);
		
		assertEquals(new Fraction(-1, 3), f1.minus(f2));
		
		//TODO add more tests!
	}

	@Test
	void testTimes() {
		Fraction f1 = new Fraction(1,3);
		Fraction f2 = new Fraction(2,3);
		
		assertEquals(new Fraction(2, 9), f1.times(f2));
		
		//TODO add more tests!
	}

	@Test
	void testDivide() {
		Fraction f1 = new Fraction(1,3);
		Fraction f2 = new Fraction(2,3);
		
		assertEquals(new Fraction(1, 2), f1.divide(f2));
		
		//TODO add more tests!
	}

	@Test
	void testLargerThan() {
		Fraction f1 = new Fraction(1,3);
		Fraction f2 = new Fraction(2,3);

		assertFalse(f1.largerThan(f2));
		assertTrue(f2.largerThan(f1));
		
		//TODO add more tests!
	}

	@Test
	void testLessThan() {
		Fraction f1 = new Fraction(1,3);
		Fraction f2 = new Fraction(2,3);
		
		assertTrue(f1.lessThan(f2));
		assertFalse(f2.lessThan(f2));
		
		//TODO add more tests!
	}

}
