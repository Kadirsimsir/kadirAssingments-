package assingment_03;

public class Question_07 {

	public static void main(String[] args) {

		/*
		 * Write a program that determines the change to be dispensed from a vending
		 * machine. An item in the machine can cost between 25 cents and 1 dollar, in
		 * 5-cent increments (25, 30, 35, . . . , 90, 95, or 100), and the machine
		 * accepts only a single dollar bill to pay for the item.
		 * 
		 * Sample output
		 * 
		 * Price in cents : 95
		 * 
		 * Your change is 0 quarters, 0 dimes, and 1 nickles
		 */

		int input = 100;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;

		int price = 95;

		int exchange = input - price;

		System.out.println("Amount in Return:" + exchange + "cents");

		quarters = exchange / 25;
		exchange = exchange % 25;

		dimes = exchange / 10;
		exchange = exchange % 10;

		nickels = exchange / 5;
		exchange = nickels % 5;


		System.out.println(
				"Your change is Quarters:" + quarters + " Dimes:" + dimes + " Nickels:" + nickels );

	}

}
