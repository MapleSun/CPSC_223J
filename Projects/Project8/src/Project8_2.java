import java.util.*;
import java.io.*;
public class Project8_2 {
	public static void main(String[] args){
		AcctBST bst = new AcctBST();
		String fName = "data.txt";
		try{
			copydata(fName, bst);
		}catch(Exception e){
			e.printStackTrace();
		}
		char option = ' ';
		char cont = ' ';
		do{
			option = Menu();
			processOpt(option, bst);
			System.out.print("CONTINU(y/n)? ");
			Scanner read = new Scanner(System.in);
			cont = read.next().charAt(0);
			String temp = read.nextLine();
		}while(cont == 'y' || cont == 'Y'); 
		//bst.display(bst.root);
	}
	
	public static char Menu(){
		char option;
		Scanner read = new Scanner(System.in);
		System.out.println("------------Menu------------"
						+ "\na. Enter ID number to deposit" 
						+ "\nb. Enter ID number to withdraw"
						+ "\nc. Enter ID number to see your balance");
		System.out.print("Enter your choice(a-c): ");
		option = read.next().charAt(0);
		String temp = read.nextLine();
		return option;
		
	}
	
	public static void processOpt(char option, AcctBST bst){
		switch(option){
			case('a'): deposit(bst); break;
			case('b'): withdraw(bst); break;
			case('c'): balance(bst); break;
			default: break;
		}
	}
	
	public static void deposit(AcctBST bst){
		Scanner read = new Scanner(System.in);
		System.out.print("Enter your ID number: ");
		int id = read.nextInt();
		AcctN p = bst.search(id, bst.root);
		System.out.println(p.name + ", how much would like to deposit? ");
		p.balance += read.nextInt();
		System.out.printf("Your new balance now is %5.2f%n" , p.balance);
		
	}

	public static void withdraw(AcctBST bst){
		Scanner read = new Scanner(System.in);
		System.out.print("Enter your ID number: ");
		int id = read.nextInt();
		AcctN p = bst.search(id, bst.root);
		System.out.println(p.name + ", how much would like to withdrwa? ");
		p.balance -= read.nextInt();
		System.out.printf("Your new balance now is %5.2f%n" , p.balance);
	}
	
	public static void balance(AcctBST bst){
		Scanner read = new Scanner(System.in);
		System.out.print("Enter your ID number: ");
		int id = read.nextInt();
		AcctN p = bst.search(id, bst.root);
		System.out.printf("Your new balance now is %5.2f%n" , p.balance);
	}
	
	
	
	public static void copydata(String fName, AcctBST bst) throws Exception{
		BufferedReader read = new BufferedReader(new FileReader(fName));
		String line = new String();
		
		while((line = read.readLine())!=null){
			String[] token = line.split("\t",3);
			bst.insert(Integer.parseInt(token[0]), token[1], Double.parseDouble(token[2]));
		}
	}

}