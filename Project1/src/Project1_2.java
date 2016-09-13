/*
 * 	Purpose: The program reads two integers and calculate the sum and average.
 */
import java.util.Scanner;

public class Project1_2 {
	public static void main(String[] args){
		int firstInt, secondInt;
		Scanner read = new Scanner(System.in);
		System.out.print("Enter two integer numbers: ");
		firstInt = read.nextInt(); secondInt = read.nextInt();
		//String temp = read.next();
		System.out.println(firstInt + " + " + secondInt + " = " + (firstInt+secondInt));
		System.out.println("the total of "+ firstInt + " and " + secondInt + " is " + (firstInt + secondInt));
		System.out.println("and their average is " + (firstInt + secondInt)/2);
	}
}

/* -------------output-----------------
	Enter two integer numbers: 12 14
	12 + 14 = 26
	the total of 12 and 14 is 26
	and their average is 13
*/