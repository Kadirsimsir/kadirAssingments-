package assingment_03;

public class Question_01 {

	public static void main(String[] args) {

		/*
		 * Write a program to convert gallons into Liters and display it.
		 * 
		 * Sample output:
		 * 
		 * 15 gallon is 56.7812 liter
		 */
        String result = copyString("Alo",4);
        System.err.println(result);
		double gallon = 15;

		double liter = galonToLiter(gallon);

		System.out.printf("15 gallon is %.2f liter", liter);

		int age = calculateAge(1985);

		System.out.println(calculateAge(1985));

		calculateAge(1985, 2021);
		String name = null;
		int height = 0;
		
		System.out.println(sacma("Ali", 185));
		System.out.println(sacma("Ali", 160));
		System.out.println(sacma("Aliii", 185));
		System.out.println(sacma("Aliii", 1));

	}

	private static String copyString(String string, int count) {
		
		return string.repeat(count);
	}

	private static boolean sacma(String name, int height) {
		boolean isLucky = name.length() > 4 && height > 180;
		return isLucky;
	}

	private static int calculateAge(int dateOFBirth, int currentYear) {
		return currentYear - dateOFBirth;

	}

	private static int calculateAge(int dateOfbirth) {

		int currentyear = 2021;
		int age = currentyear - dateOfbirth;

		return age;
	}

	public static double galonToLiter(double gallon) {
		double liter = gallon * 3.78;
		return liter;
	}

}
