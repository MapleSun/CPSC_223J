/*
 * purpose: the program reads your first name, mid initial and last name
 * 			and send a birthday card.
 */
import java.util.Scanner;
public class Project1_4 {
	public static void main(String[] args){
		String firstName, midName, lastName;
		Scanner read = new Scanner(System.in);
		System.out.println("Give me your name, I will send a birthday card");
		System.out.print("What is your first name? ");
		firstName = read.next();
		System.out.print("What is your middle initial? ");
		midName = read.next(); 
		System.out.print("What is your last name? ");
		lastName = read.next();
		System.out.println("<<<<<<< Happy Birthday " + firstName + " " + midName +  ". " + lastName + " >>>>>>>");
	}
}


/* --------------output-------------------
	Give me your name, I will send a birthday card
	What is your first name? Barack
	What is your middle initial? H
	What is your last name? Obama
	<<<<<<< Happy Birthday Barack H. Obama >>>>>>>
*/