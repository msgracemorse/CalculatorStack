package calculatorStack;

import java.util.Scanner;
import java.util.Stack;

public class CalculatorApp {

	public static void main(String[] args) {
		
		String choice = "y";
		
		Stack <Integer> s = new Stack <Integer>();
		Scanner scan1 = new Scanner(System.in);
		int x;
		int y;
		int result;
		
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.println("What do you want to calculate?");
			
			String input = scan1.nextLine();
			
										
			for (int i=0; i<input.length(); i++){
				char singleDigit = input.charAt(i);
				
//				if (singleDigit == '0' ||singleDigit == '1'|| singleDigit == '2'||singleDigit == '3' ||
//					singleDigit == '4' ||singleDigit == '5'|| singleDigit == '6'||singleDigit == '7' ||
//					singleDigit == '8' ||singleDigit == '9'){
				
				//this "isDigit" method does same as above
				if (Character.isDigit(singleDigit)) {
				
				int singDing = Character.getNumericValue(singleDigit);
			
				s.push(singDing);
				
				} else if (singleDigit == '*') {
				
				multiplication(s);
					
				} else if (singleDigit == '/') {
				
				division(s);
				
				} else if (singleDigit == '+') {
				
				addition(s);
				
				} else if (singleDigit == '-') {
				
				subtraction(s);
				
				}

						
			}
		
			System.out.println("Continue? y/n ");
			choice = scan1.nextLine();
	
		}	

	
	}

	private static void subtraction(Stack<Integer> s) {
		int x;
		int y;
		int result;
		x = s.pop();
		y = s.pop();
					
		result = y - x;
			
		System.out.println(y + " - " + x + " = " + result);
		
		s.push(result);
	}

	private static void addition(Stack<Integer> s) {
		int x;
		int y;
		int result;
		x = s.pop();
		y = s.pop();
					
		result = y + x;
			
		System.out.println(y + " + " + x + " = " + result);
				
		s.push(result);
	}

	private static void division(Stack<Integer> s) {
		int x;
		int y;
		int result;
		x = s.pop();
		y = s.pop();
		
		result = y / x;
			
		System.out.println(y + " / " + x + " = " + result);
		
		s.push(result);
	}

	private static void multiplication(Stack<Integer> s) {
		int x;
		int y;
		int result;
		x = s.pop();
		y = s.pop();
					
		result = y * x;
			
		System.out.println(y + " * " + x + " = " + result);
		
		s.push(result);
	}
	
}