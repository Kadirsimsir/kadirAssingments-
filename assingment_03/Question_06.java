package assingment_03;

public class Question_06 {

	public static void main(String[] args) {

		/*
		 * Question-6
		 * 
		 * Scientists estimate that roughly 10 grams of caffeine consumed at one time is
		 * a lethal overdose.
		 * 
		 * Write a program with a variable that holds the number of milligrams of
		 * caffeine in a drink and outputs how many drinks it takes to kill a person.
		 * 
		 * Sample Output
		 * 
		 * Number of milligrams in drink: 500 It would take about 20 drinks for a lethal
		 * overdose
		 */

		int lethalOverdose = 10000 ; // int lethalOverdose = 10 gr = 10000 mg
		
		int caffeine= 500; // enter the num of caffeine milligrams in drink.
		
	    int maxDrink ;
	    
	    maxDrink=lethalOverdose/caffeine;
	    
	    System.out.println("It would take about " + maxDrink +  " drinks for a lethal overdose");
		
		
	}

}
