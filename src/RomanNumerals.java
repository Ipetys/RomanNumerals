import java.util.*;

public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		
		//if the length is 0 or string is empty, return 0
		if (romanNum == null || romanNum.length() == 0) {
			return 0;
		}
		
		//if romanNum isn't a valid roman numeral return -1
		if (!validateRoman(romanNum)) {
			return -1;
		}
		
		//hashmap for roman numerals and their values
		Map<Character, Integer> romanValues = new HashMap<>();
		romanValues.put('I',1);
		romanValues.put('V',5);
		romanValues.put('X',10);
		romanValues.put('L',50);
		romanValues.put('C',100);
		romanValues.put('D',500);
		romanValues.put('M',1000);
		
		int length = romanNum.length();
		int result = romanValues.get(romanNum.charAt(length - 1));
		
		for (int i = length - 2; i >= 0; i--) {
			if (romanValues.get(romanNum.charAt(i)) >= romanValues.get(romanNum.charAt(i + 1))) {
				result += romanValues.get(romanNum.charAt(i));
			}else {
				result -= romanValues.get(romanNum.charAt(i));
			}
		}		
		return result;		
	}
	
	//here we check, if the romanNum is a valid Roman numeral
	public boolean validateRoman(String romanNum) {
		boolean valid = romanNum.matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
		if (!valid) {
			System.out.println("Not a valid roman numeral: " + romanNum);
		}		
		return valid;
	}
}

