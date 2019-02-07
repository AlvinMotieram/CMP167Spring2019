
import java.util.Scanner;

public class TestZero {

	public static void main(String[] args) {
	
	int num1, num2, num3;
	double average;
		
	Scanner scnr = new Scanner(System.in);
	
	System.out.println("Please enter three numbers:");
	
	num1 =scnr.nextInt();
	num2 =scnr.nextInt();
	num3 =scnr.nextInt();
	
	scnr.close();
	
	average = (double) (num1+num2+num3)/3;
	
	System.out.println("Your average is " + average);
	}
}