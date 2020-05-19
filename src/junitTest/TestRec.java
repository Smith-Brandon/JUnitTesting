package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestRec {

	@Test
	void testCalcRect() {
		double result = WinCalc.calcRect(4, 8.87);
		assertEquals(35.48, result);
	}

}
