import java.util.Scanner;

public class Area {
	static Scanner scnr = new Scanner(System.in);
	
	public static void rectArea() {
		int width, length, area;
		
		System.out.println("Let's calculate area");
		System.out.println("Enter width:");
		width = scnr.nextInt();
		System.out.println("Enter length:");
		length = scnr.nextInt();
		
		area = width * length;
		
		System.out.println("The rect area is: " + area);
		System.out.println();
		
		
	}
	

public static void circArea() {
	double radius, area;
	System.out.println("Welcome to circle area calculator");
	
	System.out.println("Enter radius: ");
	radius = scnr.nextDouble();
	
	area = Math.PI * (radius * radius);
	
	System.out.println("The circ area is: "+area);
	System.out.println();
	
	
}

public static void triArea() {
	double height, base, area;
	System.out.println("Welcome to triangle area calculator");
	
	System.out.println("Enter height: ");
	height = scnr.nextDouble();
	System.out.println("Enter base: ");
	base = scnr.nextDouble();
	
	area = (height * base) / 2;
	
	System.out.println("The tri area is: " + area);
	
	
}
public static void main(String[] args) {
	rectArea();
	circArea();
	triArea();
}


}
