public class DMV {
	public static void generateDL(int age, boolean testPass) {
		if (testPass && age >=17) 
				System.out.println("DL generated");
		else
			System.out.println("Cannot generate DL");
		}
	
	public static int calculateExpirationDate(int yearGenerated) {
		return yearGenerated + 10;
	}
	public static void main(String[] args) {
		generateDL(14,false);
		System.out.println(calculateExpirationDate(2011));
	}
}

	

