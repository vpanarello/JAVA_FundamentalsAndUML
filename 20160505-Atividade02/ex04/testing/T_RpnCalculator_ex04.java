package testing;

import static org.junit.Assert.*;
import org.junit.Test;
import ex01.RpnCalculator;

public class T_RpnCalculator_ex04 {
	
	RpnCalculator calc;

	@Test
	public void testOfOperations() throws Exception {
		
		calc = new RpnCalculator();
		
		calc.pushtoStack(10);
		calc.pushtoStack(2000);
		calc.pushtoStack(440);
		calc.pushtoStack(200);
		calc.pushtoStack(40);
		
		assertEquals(240, calc.operation("+"), 0);
		assertEquals(200, calc.operation("-"), 0);
		assertEquals(10, calc.operation("/"), 0);
		assertEquals(100, calc.operation("*"), 0);
	}

}

