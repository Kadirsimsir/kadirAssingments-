package assingment_03;

public class Question_02 {

	public static void main(String[] args) {

		/*
		 * Write a program - > Declare variables for your name and birth year, and the
		 * program will display:
		 * 
		 * " Hello, Ozzy! Based on your input, your age is 15 :) "
		 */

		String name = "Ozzy";

		int birthyear = 1985;

		int age = (2021 - birthyear);

		System.out.println("Hello " + name + "!" + " Based on your input, your age is " + age);

		System.out.printf("Hello %s !. Based on your input, your age is %d ", name, age);
		
		

		
	}

}
