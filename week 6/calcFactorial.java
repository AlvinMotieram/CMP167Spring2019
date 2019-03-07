import java.util.Scanner;

public class calcFactorial {
	public static void main(String[] args ) {  
		 Scanner scnr = new Scanner(System.in);
		 
		 System.out.println("Welcome to Factorial:");
		 System.out.println("This program calculates factorial");
		 
		 System.out.print("Please enter value of n: ");
		 int n = scnr.nextInt();
		 int fact = 1;
		 
		 for(int i=1; i<=n; i++)
			 fact *= i;
		 
		 System.out.printf("The factorial of %d is %d%n", n, fact);
		 
		  

}
}