import java.util.*;
public class Billing {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		double price, coupon;
		int quantity;
		char flag=0;
		String temp = new String();
		
		// first method
		System.out.println("first method");
		System.out.print("Enter the price of each book: ");
		price = read.nextDouble();
		System.out.printf("Your total pay is %.2f", computeBill(price));
		System.out.println();
		
		// second method
		System.out.println("second method");
		System.out.print("Enter the number of books? ");
		quantity = read.nextInt();
		System.out.print("Enter the price of each book: ");
		price = read.nextDouble();
		System.out.printf("Your total pay is %.2f", computeBill(price, quantity));
		System.out.println();
		
		// third method
		System.out.println("third method");
		System.out.print("Enter the number of books? ");
		quantity = read.nextInt();
		System.out.print("Enter the price of each book: ");
		price = read.nextDouble();
		System.out.print("Any coupon(y/n) ");
		flag = read.next().charAt(0);
		temp = read.nextLine();
		if(flag == 'y' || flag == 'Y'){
			System.out.print("How much? ");
			coupon = read.nextDouble();
		}else{
			coupon = 0.0;
		}
		System.out.printf("Your total pay is %.2f", computeBill(price, quantity, coupon));
		
		
		
		
	}
	
	private static double computeBill(double price){
		return price * 1.08;
	}
	
	private static double computeBill(double price, int quantity){
		return price * quantity * 1.08;
	}
	
	private static double computeBill(double price, int quantity, double coupon){
		return price*quantity*1.08*(1-coupon);
	}
}
