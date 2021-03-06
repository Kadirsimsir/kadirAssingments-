package assingment_08;

public class Question_13 {

	public static void main(String[] args) {
		System.out.println(waterTax(50d));
		System.out.println(waterTax(55d));
		System.out.println(waterTax(101d));
		System.out.println(waterTax(151d));
		System.out.println(waterTax(50f));
		System.out.println(waterTax(55f));
		System.out.println(waterTax(101f));
		System.out.println(waterTax(151f));
	}

	public static double waterTax(double waterUsed) {
		double tax = 0;
		tax = waterUsed <= 50 ? (waterUsed * 0.60)
				: waterUsed > 50 && waterUsed <= 100 ? ((waterUsed * 0.90))
						: waterUsed > 100 && waterUsed <= 150 ? (50 + (waterUsed * 0.90)) : (100 + (waterUsed * 0.90));
		return tax;
	}

	public static double waterTax(float waterUsed) {
		double tax;
		double fine, ratio;
		boolean lessThan50 = waterUsed <= 50;
		if (lessThan50) {
			ratio = 0.6;
			fine = 0;
		} else {
			boolean between50and100 = waterUsed > 50 && waterUsed <= 100;
			if (between50and100) {
				ratio = 0.9;
				fine = 0;
			} else if (waterUsed > 100 && waterUsed <= 150) {
				ratio = 0.9;
				fine = 50;
			} else {
				ratio = 0.9;
				fine = 100;

			}
		}
		tax = waterUsed * ratio + fine;
		return tax;

	}

}
