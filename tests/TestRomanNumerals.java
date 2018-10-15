import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void test_1() {
		RomanNumerals rm = new RomanNumerals();
		int x = 0;
		x = rm.convertToInteger("V");
		assertEquals("Should be 5",5,x);
	}
	
	@Test
	public void test_2() {
		RomanNumerals rm = new RomanNumerals();
		int x = 0;
		x = rm.convertToInteger("X");
		assertEquals("Should be 10",10,x);
	}
	
	@Test
	public void test_3() {
		RomanNumerals rm = new RomanNumerals();
		int x = 0;
		x = rm.convertToInteger("IX");
		assertEquals("Should be 9",9,x);
	}
	
	@Test
	public void test_4() {
		RomanNumerals rm = new RomanNumerals();
		int x = 0;
		x = rm.convertToInteger("III");
		assertEquals("Should be 3",3,x);
	}
	
	@Test
	public void test_5() {
		RomanNumerals rm = new RomanNumerals();
		int x = 0;
		x = rm.convertToInteger("XI");	
		assertEquals("11",11,x);
	}
	
	@Test
	public void test_6() {
		RomanNumerals rm = new RomanNumerals();
		int x = 0;
		x = rm.convertToInteger("MDI");	
		assertEquals("1501",1501,x);
	}
	
	@Test
	public void test_7() {
		RomanNumerals rm = new RomanNumerals();
		int x = 0;
		x = rm.convertToInteger("VV");	
		assertEquals("Shouldn't be valid",10,x);
	}
	
	@Test
	public void test_8() {
		RomanNumerals rm = new RomanNumerals();
		int x = 0;
		x = rm.convertToInteger("VVV");	
		assertEquals("Shouldn't be valid",10,x);
	}	
	
	@Test
	public void test_9() {
		RomanNumerals rm = new RomanNumerals();
		int x = 0;
		x = rm.convertToInteger("XXX");	
		assertEquals("Should be 30",30,x);
	}	
	
	@Test
	public void test_10() {
		RomanNumerals rm = new RomanNumerals();
		boolean x = true;
		x = rm.validateRoman("XXX");	
		assertEquals("Should be true",true,x);
	}
	
	@Test
	public void test_11() {
		RomanNumerals rm = new RomanNumerals();
		boolean x = true;
		x = rm.validateRoman("IIII");	
		assertEquals("Should be false",false,x);
	}
	
	@Test
	public void test_12() {
		RomanNumerals rm = new RomanNumerals();
		boolean x = true;
		x = rm.validateRoman("XXXXX");	
		assertEquals("Should be false",false,x);
	}
	@Test
	public void test_13() {
		RomanNumerals rm = new RomanNumerals();
		boolean x = true;
		x = rm.validateRoman("DD");	
		assertEquals("Should be false",false,x);
	}
	
	@Test
	public void test_14() {
		RomanNumerals rm = new RomanNumerals();
		boolean x = true;
		x = rm.validateRoman("XV");	
		assertEquals("Should be true",true,x);
	}
	
	@Test
	public void test_15() {
		RomanNumerals rm = new RomanNumerals();
		boolean x = true;
		x = rm.validateRoman("MMM");	
		assertEquals("Should be true",true,x);
	}	
}
