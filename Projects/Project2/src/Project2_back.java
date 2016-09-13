import java.util.*;
public class Project2_back {
	public static void main(String[] args){
		/*
		Scanner read = new Scanner(System.in);
		String name;
		System.out.print("Enter your full name: ");
		name = read.nextLine();
		System.out.println("All uppercase: "+name.toUpperCase());
		*/
		System.out.println();
		int k=5;
		String st="";
		for(int i = 0; i<5; i++){
			for(int j=k; j>0;j--){
				 st += 6-j;
			}
			System.out.printf("%5s",st);
			System.out.println();
			k--;
			st="";
		}
	}
}
