package assingment_08;

/*Create a method called cube. Write all required code inside this method in order to ask the user for a number and then prints the cubed value of that number:
Example:
input: 5
output: 125
*/

import java.util.Scanner;

public class Question_02 {

	public static void main(String[] args) {

		cube();
	}

	public static int cube() {
		System.out.println("Enter a number to calculate it's cube.");
		Scanner sc = new Scanner(System.in);
		System.out.print("Num : ");
		int number = sc.nextInt();
		System.out.println(number * number * number);
		sc.close();
		return number * number * number;

	}

}
