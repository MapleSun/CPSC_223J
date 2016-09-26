import java.util.*;
public class Project4_3 {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int[] a = new int[7];
		System.out.print("Enter 7 int number: ");
		for(int i = 0; i< a.length; i++){
			a[i] = read.nextInt();
		}
		System.out.print("Original data: ");
		Display(a);
		java.util.Arrays.sort(a);
		System.out.print("Sorted data: ");
		Display(a);
		
		System.out.print("Enter an int number: ");
		int bs = read.nextInt();
		int index_bs = java.util.Arrays.binarySearch(a, bs);
		System.out.println(bs + " is at location " + index_bs + " of the sorted array");
	
	}
	
	static void Display(int[] a){
		for(int i = 0; i< a.length; i++){
			System.out.printf("%4d",a[i]); 
		}
		System.out.println();
	}
}

/*********output**********
Enter 7 int number: 10 15 40 70 30 9 11
Original data:   10  15  40  70  30   9  11
Sorted data:    9  10  11  15  30  40  70
Enter an int number: 11
11 is at location 2 of the sorted array
*/
