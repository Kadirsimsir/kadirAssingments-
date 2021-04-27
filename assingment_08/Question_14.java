package assingment_08;

public class Question_14 {

	public static void main(String[] args) {
		System.out.println(truthTable(true,true,true));
		System.out.println(truthTable(true,false,true));
		System.out.println(truthTable(false,false,true));
		System.out.println(truthTable(true,true,false));
		System.out.println(truthTable(true,false,true));
	}

	public static boolean truthTable(boolean a,  boolean b, boolean c) {
		return a&&b||c;//if c true result true; if c false a and b both should be to be true;

	}

}
