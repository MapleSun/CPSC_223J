/*
 * purpose: The program reads three exams's scores and calculate the average
 */
import java.util.Scanner;
public class Project1_3 {
	public static void main(String[] args){
		int firstScore, secondScore, thirdScore;
		Scanner read = new Scanner(System.in);
		System.out.print("I can computer your midterm's average, try me\nEnter your scores in 3 exams:");
		firstScore = read.nextInt(); secondScore = read.nextInt(); thirdScore = read.nextInt();
		System.out.println("Your average is: " + (firstScore + secondScore + thirdScore)/3);
	}
}


/* -------------output-----------------
	I can computer your midterm's average, try me
	Enter your scores in 3 exams:88 79 43
	Your average is: 70
*/