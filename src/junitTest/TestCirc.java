package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCirc {

	@Test
	void testCalcCirc() {
		double result = WinCalc.calcCirc(9.98);
		assertEquals(312.90, result);
	}

}
