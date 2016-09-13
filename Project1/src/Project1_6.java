/*
 * Purpose: The programe read Fahreheit and convert to Celsius.
 */
import java.util.Scanner;
public class Project1_6 {
	public static void main(String[] main){
		Scanner read = new Scanner(System.in);
		float Fahrenheit, Celsius;
		System.out.println("I can convert temperature from degrees Fahrenheit to degrees Celsius. Try me");
		System.out.print("Enter a temperature in Fahrenheit: ");
		Fahrenheit = read.nextFloat();
		Celsius = 5*(Fahrenheit-32)/9;
		System.out.printf("%.0f Fahrenheit is %4.2f Celsius", Fahrenheit, Celsius);
		
	}
}

/* --------------output-------------------
		I can convert temperature from degrees Fahrenheit to degrees Celsius. Try me
		Enter a temperature in Fahrenheit: 97
		97 Fahrenheit is 36.11 Celsius
*/