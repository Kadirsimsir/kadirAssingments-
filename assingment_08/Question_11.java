package assingment_08;

public class Question_11 {

	public static void main(String[] args) {
		System.out.println(calProfits(100, 200));

	}

	public static String calProfits(int sellPrice, int buyPrice) {
	
		boolean noLoss = sellPrice == buyPrice;
		if (noLoss)
			return "No Loss";
		boolean loss = buyPrice > sellPrice;
		if (loss)
			return "Loss";
		else
			return "Profit";
		

	}

}
