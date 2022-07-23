import java.util.Scanner;

public class galToLit {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double gallons = 3.7854;
		double liters;
		double x;
		double y;
		
		
		liters = sc.nextDouble();
		
		x = liters * gallons;
		y = x * 7.00;
		
		System.out.printf("A quantidade de liters é = "+ x + " lt and value = R$ %.2f", y);
		
		sc.close();
	}

}
