/*
 * purpose: The program displays the menu 
 * 			and read the number of drinks, chips and nuts.
 * 			And calculate the total bill.
 */
import java.util.Scanner;
public class Project1_5 {
	public static void main(String[] args){
		float drinks = 1.25f, chips=1.09f, nuts=1.18f;
		int numDrinks, numChips, numNuts;
		Scanner read = new Scanner(System.in);
		System.out.println("------------MENU---------");
		System.out.printf("Drinks %10.2f %n", drinks);
		System.out.printf("Chips %11.2f  %n", chips);
		System.out.printf("Nuts %12.2f   %n", nuts);
		System.out.print("How many drinks? ");
		numDrinks = read.nextInt();
		System.out.print("How many chips? ");
		numChips = read.nextInt();
		System.out.print("How many nuts? ");
		numNuts = read.nextInt();
		float total = numDrinks * drinks + numChips * chips + numNuts * nuts;
		System.out.println("Total bill = " + total);
	}
}

/* --------------output-------------------
		------------MENU---------
		Drinks       1.25 
		Chips        1.09  
		Nuts         1.18   
		How many drinks? 2
		How many chips? 1
		How many nuts? 2
		Total bill = 5.95
*/