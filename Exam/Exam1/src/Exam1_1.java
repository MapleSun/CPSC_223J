import java.util.*;
public class Exam1_1 {
	public static void main(String[] args){
		displayMenu();
	}
	
	public static void displayMenu(){
		char choice =  ' ';
		Scanner read = new Scanner(System.in);
		System.out.printf("-------MENU--------\n"
						+ "a. Addition\n"
						+ "b. Subtraction \n");
		System.out.print("Enter your choice: ");
		choice = read.nextLine().charAt(0);
		int randA, randB, answer, Correct=0, Wrong=0;
		char Continue = ' ';
		do{
			randA = (int)(Math.random()*100)+1;
			randB = (int)(Math.random()*100)+1;
			if(choice == 'a'){
				System.out.printf("%d + %d =? ", randA, randB);
				answer = read.nextInt();
				if(answer == randA + randB){
					System.out.println("Correct");
					Correct++;
				}else{
					System.out.println("Wrong");
					Wrong++;
				}

			}else{
				System.out.printf("%d - %d =? ", randA, randB);
				answer = read.nextInt();
				if(answer == randA - randB){
					System.out.println("Correct");
					Correct++;
				}else{
					System.out.println("Wrong");
					Wrong++;
				}
			}
			System.out.print("Continue(y/n)? ");
			Continue = read.next().charAt(0);
			String temp = read.nextLine();
		}while(Continue == 'y');
		System.out.printf("Number of CORRECT answers: %d \n"
						+ "Number of WRONG answers: %d ", Correct, Wrong);
		
	}
	
}
