
import java.util.*;

public class Project4_1 {
	public static void main(String[] args){
		int[][] t = new int[4][4]; 
		int i = 1;
		for(int row = 0; row < t.length; row++){
			for(int col = 0; col < t[row].length; col++){
				t[row][col] = i++;
			}
		}
		Display(t);
		Calculate(t);
	}
	
	static void Display(int t[][]){
		System.out.println("This is our inventory");
		System.out.printf("%5s%5s%5s%5s%5s"," ", "S", "M", "L", "XL");
		System.out.println();
		for(int row = 0; row < t.length; row++){
			Color(row);
			for(int col = 0; col < t[row].length; col++){
				System.out.printf("%5d", t[row][col]);
			}
			System.out.println();
		}
	}
	
	static void Color(int row){
		String color = new String();
		switch (row){
			case 0: color = "RED"; break;
			case 1: color = "BLACK"; break;
			case 2: color = "BLUE"; break;
			case 3: color = "GREEN"; break;
			default: break;
			
		}
		System.out.printf("%5s", color);
	}
	
	static void Calculate(int t[][]){
		int all=0, red=0, large=0;
		for(int row = 0; row < t.length; row++){
			for(int col = 0; col < t[row].length; col++){
				all+= t[row][col];
				if(row == 0){
					red += t[row][col];
				}
				if(col == 2){
					large += t[row][col];
				}
			}
		}
		System.out.println("Total of all shirt: " + all);
		System.out.println("Total of red shirt: " + red);
		System.out.println("Total of large shirt: " + large);
	}
	
}

/*********output**********
This is our inventory
         S    M    L   XL
  RED    1    2    3    4
BLACK    5    6    7    8
 BLUE    9   10   11   12
GREEN   13   14   15   16
Total of all shirt: 136
Total of red shirt: 10
Total of large shirt: 36
*/
