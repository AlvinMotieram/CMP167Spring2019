import java.util.Scanner;

public class calcPower {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome to Power");
		System.out.println("This program calculates the first nth powers of 2");
		System.out.print("Please enter the value of n: ");
		int n = scnr.nextInt();
		
		System.out.println("\n_________________________");
		
		
		int power = 1;
		System.out.println(power);
		for(int i = 1; i <=n; i++) {
			
			power = power * 2;
			System.out.println(power);
		}
		
		
	}

}
