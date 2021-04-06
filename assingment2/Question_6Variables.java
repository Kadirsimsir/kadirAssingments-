package assingment2;

public class Question_6Variables {

	public static void main(String[] args) {
		/*
		 * Five friends are going to the theater. They have purchased a row of five
		 * seats with an aisle on either end. Declare 5 String variables and store their
		 * names.
		 * 
		 * James doesn't want to sit next to Jill Betty and Herb are dating and want to
		 * sit next to each other Bob wants to sit on a left side aisle James wants to
		 * sit on the aisle Provide a seating order that conforms to the above rules. An
		 * example of an invalid seating order is: James, Betty, Herb, Bob, Jill
		 * 
		 * The above arrangement is invalid because: Bob is not sitting on the left
		 * aisle.
		 * 
		 * Specify the seating order as the names separated by commas and space (as in
		 * the above example). Use variables and print names in the right order.
		 */

		String name1, name2, name3, name4, name5;

		name1 = "James";
		name2 = "Betty";
		name3 = "Herb";
		name4 = "Bob";
		name5 = "Jill";

		System.out.printf("%s, %s, %s, %s, %s\n", name4, name5, name2, name3, name1);

		System.out.println(name4 + ", " + name5 + ", " + name2 + ", " + name3 + ", " + name1);

	}
}
