package calculatorStack;

import java.util.Scanner;
import java.util.Stack;

public class CalculatorApp {

	public static void main(String[] args) {
		
		Stack <Integer> s = new Stack <Integer>();
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("What do you want to calculate?");
		
		String input = scan1.nextLine();
		scan1.nextLine();
		int singDing = 0;
			
		for (int i=0; i<input.length(); i++){
			char singleDigit = input.charAt(i);
			
//			if (singleDigit == '0' ||singleDigit == '1'|| singleDigit == '2'||singleDigit == '3' ||
//				singleDigit == '4' ||singleDigit == '5'|| singleDigit == '6'||singleDigit == '7' ||
//				singleDigit == '8' ||singleDigit == '9'){
	
			if (Character.isDigit(singleDigit)) {
			
			singDing = Character.getNumericValue(singleDigit);
		
			s.push(singDing);
			
		}   else if (singleDigit == '+'){
			
			int x = s.pop();
			int y = s.pop();
						
			int result = y + x;
				
			System.out.println(y + "+" + x + "=" + result);
			
			s.push(result);
				
		}	else if (singleDigit == '-'){
			
			int x = s.pop();
			int y = s.pop();
						
			int result = y - x;
				
			System.out.println(y + "-" + x + "=" + result);
			
			s.push(result);
			
		}	else if (singleDigit == '*'){
			
			int x = s.pop();
			int y = s.pop();
						
			int result = y * x;
				
			System.out.println(y + "*" + x + "=" + result);
					
			s.push(result);
			
		}   else if (singleDigit == '/'){
			
			int x = s.pop();
			int y = s.pop();
						
			int result = y / x;
				
			System.out.println(y + "/" + x + "=" + result);
			
			s.push(result);
		}
}	
}	
}