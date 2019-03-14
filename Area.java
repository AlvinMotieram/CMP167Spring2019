import java.util.Scanner;

/*
 * Area.java
 * Alvin
 * This program implements area functions/methods
 * modified : 3.14.19
 */

public class Area {
		static Scanner scnr = new Scanner(System.in);
		
		/*
		 * getRecArea : int
		 * params : width: int, length: int
		 * calculates rectangle area
		 */
		
		public static int getRecArea(int width, int length) {
			return width * length;
		}
		
		
		/*
		 * rectArea: void
		 * inputs: width and length
		 * process: area= width*length
		 * output: area
		 */
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
		
		
		/*
		 * getCircArea : double
		 * params : area:double, radius: double
		 * calculates circle area
		 */
		
		public static double getCircArea(double radius) {
			return Math.PI * (radius * radius);
		}
		/*
		 * circArea: void
		 * inputs: radius
		 * process: area= Pi*(radius * radius)
		 * output: area
		 */
		public static void circArea() {
			double radius, area;
			System.out.println("Welcome to circle area calculator");
		
			System.out.println("Enter radius: ");
			radius = scnr.nextDouble();
		
			area = Math.PI * (radius * radius);
		
			System.out.println("The circ area is: "+area);
			System.out.println();
		
		
		}
		
		/*
		 * getTriArea : int
		 * params : base: int, height: int
		 * calculates triangle area
		 */
		
		public static int getTriArea(int base, int height) {
			return (base * height) / 2;
		}
		/*
		 * triArea: void
		 * inputs: height base area
		 * process: area= (height * base) / 2;
		 * output: area
		 */
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
			System.out.println("Enter width and length: ");
			int width = scnr.nextInt();
			int length = scnr.nextInt();
			int area = getRecArea(width, length);
			System.out.println("Area: "+ area);
		}


	}

