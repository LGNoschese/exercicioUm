import java.util.Locale;

public class galToLitTable {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	
		
		double gallons, liters, value;
		int counter;
		
		counter = 0;
		for (gallons = 1; gallons <= 100; gallons++) {
				liters = gallons * 3.7854;
				value = liters * 7.00;
				System.out.printf(gallons+ " gallons is "+ liters + " lts and US$ %.2f \n", value );
				counter++;
				if (counter == 10) {
					System.out.println();
					counter = 0;
			}
		}
	}

}
