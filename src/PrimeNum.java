import java.util.Arrays;

public class PrimeNum {

	/*
	 * String Calculator This classic kata guides you step by step through the
	 * implementation of a calculator that receives a String as input. It is a good
	 * exercise on refactoring and incremental implementation. It is also a good
	 * candidate for practising TDD.
	 * 
	 * First step Create a function add that takes a String and returns a String:
	 * 
	 * String add(String number) The method can take 0, 1 or 2 numbers separated by
	 * comma, and returns their sum. An empty string will return “0”. Example of
	 * inputs: "", "1", "1.1,2.2".
	 */
	
	public static String add(String num) {
	
		int str = 0;
		String str2 =null;
		
		if(num == "0") {
		str2 = "0";
		
		}else {
		String[] split = num.split(",");
		
		for(int i = 0; i< split.length; i++){
		 str += Integer.parseInt(split[i]);
	
		} 
		str2 = Integer.toString(str);
		}
		return str2;
}
}
