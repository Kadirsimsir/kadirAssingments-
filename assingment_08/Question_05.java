package assingment_08;

import java.util.Scanner;

public class Question_05 {

	public static void main(String[] args) {
		/*
		 * Create a method called sign. It gets a number and tells you if its positive,
		 * negative or zero. for example : sign(5) => 1 sign(-30)=> -1 sign(0) => 0 sign
		 * gets an int parameter. print out 1,-1 or 0 depending on the input the
		 * parameter should be entered by user (create a scanner object)
		 */

		sing();
		
		
		
		
		
		
		
		
	}

	private static int sing() {
		System.out.println("Enter a number to check it's sing :");
		
		Scanner sc = new Scanner(System.in);
		int sign = sc.nextInt();
		
		 sign = sign == 0 ? 0 : sign > 0 ? 1 : -1;
		 System.out.println(sign);
		 sc.close();
		 return sign;
		
		
	}

}
