package com.java.globant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class GlobantEnigma {
	public static void main(String...args) {
		
		List<Character> letters = Arrays.asList('A','B','C','D','E','F','G','H','I','J');
		List<Integer> digits = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		List<Integer> number = new ArrayList<>(digits);
		Predicate<Long> rule = a->Math.sqrt(a)==Math.floor(Math.sqrt(a));
		Boolean isFoundNumber = createCombination(digits, number, rule);
		if(isFoundNumber) {
			System.out.println(isFoundNumber?"Number Was Found!"+" and the solution is: ":"Number Was Not Found");
			System.out.println(letters);
			System.out.println(number);
		}
		else {
			System.out.println(isFoundNumber?"Number Was Found!"+" and the solution is: ":"Number Was Not Found");
		}
	}
	
	public static boolean verifyRule(List<Long> numbers, Predicate<Long> rule) {
		for(Long number: numbers) {
			if(!rule.test(number)) {
				return false;
			}
		}
		return true;
	}
	
	public static List<Long> initializeTestNumbers(List<Integer> digits) {
		List<Long> squares = new ArrayList<>();
		squares.add(concatenateNumbers(digits.get(0), digits.get(1)));
		squares.add(concatenateNumbers(digits.get(4), digits.get(5)));
		squares.add(concatenateNumbers(digits.get(8), digits.get(9)));
		Integer[] digitsArray = new Integer[digits.size()];
		squares.add(concatenateNumbers(digits.toArray(digitsArray)));
		return squares;
	}
	
	public static boolean createCombination(List<Integer> digits, List<Integer> number, Predicate<Long> rule) {
		int numberPos = 10-digits.size();
		if(digits.size()==1) {
			number.set(numberPos, digits.get(0));
			List<Long> squares = initializeTestNumbers(number);
			return verifyRule(squares, rule);
		}else {
			for(int i=0; i<digits.size();i++) {
				List<Integer> nextDigits = new ArrayList<>(digits);
				number.set(numberPos, nextDigits.remove(i));
				if(createCombination(nextDigits, number, rule)) return true;
			}
			return false;
		}
	}
	
	public static Long concatenateNumbers(Integer...numbers) {
		StringBuilder concatenatedNumber=new StringBuilder();
		Arrays.stream(numbers).forEach(number -> 
			concatenatedNumber.append(number)
		);
		return Long.valueOf(concatenatedNumber.toString()); 
	}
}

