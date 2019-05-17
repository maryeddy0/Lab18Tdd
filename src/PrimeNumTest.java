import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeNumTest {

//	@Test
//	public void testSplit() {
//		String expected = "2";
//		String actual = PrimeNum.add("1,0,1");
//		assertEquals(expected, actual);
//	}
	
	@Test
	public void testSplit0() {
		String expected = "0";
		String actual = PrimeNum.add("0");
		assertEquals(expected, actual);	
	}
	
	@Test
	public void testSplit1() {
		String expected = "1";
		String actual = PrimeNum.add("1");
		assertEquals(expected, actual);	
	}

	@Test
	public void testSplit2() {
		String expected = "2";
		String actual = PrimeNum.add("1,1");
		assertEquals(expected, actual);	
	}
@Test
public void testSplit3(){
String expected = "4";
String actual = PrimeNum.add("1,1,2");
assertEquals(expected, actual);
}
}
