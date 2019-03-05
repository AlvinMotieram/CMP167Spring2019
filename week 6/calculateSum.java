import java.util.Scanner;

public class calculateSum {
	public static void main(String[] args) {
		
		int num;
		int count;
		int total = 0;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter the value of n: ");
		num = scnr.nextInt();
		
		for(count =1; count <= num; count++) {
			total = total + count;
		}
		System.out.println("Sum of first"+num+"natural numbers is: "+ total);
	}
}
		
