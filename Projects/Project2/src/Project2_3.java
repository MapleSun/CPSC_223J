/*
 * Purpose: This program give a addition problem about two random number which is less than 100
 */
import java.lang.*;
import java.util.Scanner;
public class Project2_3 {
	public static void main(String[] args){
		char Continue = 0;
		int first, second, result;
		Scanner read = new Scanner(System.in);
		do{
			first = (int)(Math.random()*100);
			second = (int)(Math.random()*100);
			System.out.print(first + " + " + second + " =? ");
			result = read.nextInt();
			if(first+second != result){
				System.out.println("	WRONG");
			}
			System.out.println("	CORRECT");
			System.out.print("Continue(y/n)? ");
			Continue = read.next().charAt(0);
		}while(Continue=='y'|| Continue == 'Y');
	}
}
/*
71 + 59 =? 130
CORRECT
Continue(y/n)? y
42 + 2 =? 44
CORRECT
Continue(y/n)? n
*/