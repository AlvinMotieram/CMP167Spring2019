/*
 * Author: Alvin
 * Desc: Using arrays
 * Created: 4/9/19
 */
public class Calculate2 {
	public static int sumList(int[] list) {
		int total = 0;
		for (int i=0; i<list.length; i++) {
			total +=list[i];
			
		}
		return total;
	}
	public static int averageList(int[] iArray) {
		int avg=0;
		avg=sumList(iArray)/iArray.length;
		return avg;
	}
	public static int oddElements(int[] iArray) {
		int num=0;
		for (int i=0; i<iArray.length; i++) {
			if (iArray [i]%2!=0)
				num++;
		}
		return num; 
	}
	
	
	public static void main(String[] args) {
		int[] iArray1= {54,45,78,57,63};
		int[] iArray2= {5,52,8,57,64,48,23};
		int sum2 = sumList(iArray2);
		int avg2= averageList(iArray2);
		
		System.out.printf("The sum of all elements is %d and the average is %d", sumList(iArray1), averageList(iArray1));
		System.out.printf("The sum of all elements is %d and the average is %d",sum2,avg2);
	}
}

