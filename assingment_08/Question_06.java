package assingment_08;

public class Question_06 {

	public static void main(String[] args) {
		/*
		 * Create a method called next3 . This method gets an int argument and prints
		 * the next 3 numbers after that number. Call the method from main method and
		 * pass num to it. enter number 1 next 3 are: 2 3 4 (put a space between
		 * numbers)
		 */

		next3(20);
	}

	public static void next3(int num) {
		 
		for (int i = 0; i < 3; i++) {
			
			System.out.print((++num)+" ");
		}
		
		
	}
	

}
