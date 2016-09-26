import java.util.*;
// Project3_2
public class FromLetterWriter {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		String firstName, lastName;
		char gender;
		// first method
		System.out.println("(First Method) Enter your last name: ");
		lastName = read.nextLine();
		System.out.println("(First Method) What's your gender(m/f): ");
		gender = read.next().charAt(0);
		String temp = read.nextLine();
		displaySalutation(lastName,gender);
		System.out.println("(First Method)Thank you for your recent order.");
		
		// second method
		System.out.println("(Second Method) Enter your first name: ");
		firstName = read.nextLine();
		System.out.println("(Second Method) Enter your last name: ");
		lastName = read.nextLine();
		displaySalutation(firstName, lastName);
		System.out.println("(Second Method)Thank you for your recent order.");
		
	}
	
	// parameter: take  customer's last name
	private static void displaySalutation(String lastName, char gender){
		gender = Character.toLowerCase(gender);
		if(gender == 'm'){
			System.out.println("Dear Mr." + lastName);
		} else {
			System.out.println("Dear Mrs."+ lastName);
		}
	}
	
	// parameter: take two string first name and last name
	private static void displaySalutation(String firstName, String lastName){
		System.out.println("Dear " + firstName + " " + lastName);
		
	}

}
