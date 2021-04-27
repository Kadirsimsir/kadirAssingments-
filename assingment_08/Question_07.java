package assingment_08;

public class Question_07 {

	/*
	 * Complete a method isPalindrome() that will check if the number is a
	 * palindrome. Print your result as a boolean (true or false). Do not convert
	 * int into a string! Example: input: 1001 output: true Example: input: 1234
	 * output: false
	 */

	public static boolean isPalindrome(int num) {

		int i = 1,counter=0;
		while (num / i > 0) {
			counter++;
			i = i * 10;
		}
		i = i / 10;
		int k = 10;
		int digits = 0,temp=0;
		for (int j = 0; j < counter; j++, k = k * 10, i = i / 10) {
			digits = (num - (num - num % k)) / (k / 10) * i;
			temp = temp + digits;
		}
		if (num == temp) {
			System.out.println("Yes your number is palindrome :" + num);
		} else {
			System.out.println("No your number is not a Palindrome number :" + num);
		}
		return num == temp;
	}

	public static void main(String[] args) {
		isPalindrome(121);
		
		
		
		
	}

}
