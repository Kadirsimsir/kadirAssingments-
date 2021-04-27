package assingment_08;

public class Question_04 {

	public static void main(String[] args) {
		/*
		 * Create a method printHollowRect that prints a 5 on 5 hollow rectangle:
		 * hint: you will need to use two nested for loops for that, and an if that
		 * checks if its the last or first iteration of the loop (so you will know what
		 * to print "*" or " ") 
		 */

		printHollowRect(5);
		
		
		
	}

	private static void printHollowRect(int rows) {
		
		for (int j = 1; j <= rows; j++) {

			if (j == 1 || j == rows) {
				for (int i = 1; i <= rows; i++) {
					System.out.print("* ");
				}
				System.out.println();
			} else {
				for (int i = 1; i <= rows; i++) {
					if (i == 1 || i == rows) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
		
	}

}
		
	}
	

}
