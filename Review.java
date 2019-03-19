/*
 * Alvin Motieram
 * March 19, 2019
 * Review
 */

import java.util.Scanner;

public class Review {
	static Scanner scnr = new Scanner(System.in);
	
	public static void Greet() {
		System.out.print("Hello, ");
	}
	public static void title() {
		
		System.out.println("What's your name? ");
		String name = scnr.next();
		Greet();
		if(name.endsWith("e") || name.endsWith("a")) {
			System.out.println("Miss " +name);
		}
		else {
			System.out.println("Mister " +name);
		}
	}
	public static void greetPeople(int numOfPeople) {
		for(int i=0; i<numOfPeople; i++) {
			title();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter number of Poeple");
		int num = scnr.nextInt();
		greetPeople(num);
	}
		
	
}
                      