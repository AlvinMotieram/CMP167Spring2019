 import java.util.Scanner;
 
 public class calcAverage {
	 public static void main(String[] args) {
		 Scanner scnr = new Scanner(System.in);
		 
		 System.out.println("Welcome to Average");
		 System.out.println("This program calculates average of first nth number");
		 
		 System.out.print("Please enter value of n: ");
		 int n = scnr.nextInt();
		 
		 int sum = 0;
		 System.out.println("\n*****************");
		 
		 for(int i=1; i<=n; i++)
			 sum += i;
		 
		 int average = sum/n;
		 System.out.println("The average is "+average);
		 
		 System.out.println("\n*****************");
		 
		 
		 
		 
	 }
 }