package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTri {

	@Test
	void testCalcTri() {
		double result = WinCalc.calcTri(10, 8.86);
		assertEquals(44.3, result);
	}

}
