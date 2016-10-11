import java.util.*;
import java.io.*;
public class Project7_2 {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		Hashing accounts = new Hashing();
		char Continue =' ';
		int choice;
		try {
			copydata("accounts", accounts);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Menu();
		do{
			System.out.print("Please enter your choice(1-4): ");
			choice = read.nextInt();
			Process(choice, accounts);
			System.out.print("CONTINUE(y/n)?");
			Continue = read.next().charAt(0);
			String temp = read.nextLine();
		}while(Continue == 'y' || Continue == 'Y');
	}
	
	
	public static void copydata(String fName, Hashing accounts) throws Exception{
		BufferedReader read = new BufferedReader(new FileReader(fName));
		String line;
		while((line = read.readLine())!=null){
			String[] token=line.split(" ", 3);
			accounts.insertHash(Integer.parseInt(token[0]), token[1], Double.parseDouble(token[2]));
		}
	}
	
	public static void Menu(){
		System.out.println("------------Menu-------------"
						+ "\n1. Show my balance"
						+ "\n2. Deposit in my account "
						+ "\n3. Withdraw from my account "
						+ "\n4. Show me all\n");
	}
	
	
	public static void Process(int choice, Hashing accounts){
		switch(choice){
		case 1: Show(accounts);     break;
		case 2: Deposit(accounts);  break;
		case 3: Withdraw(accounts); break;
		case 4: accounts.display(); break;
		default: break;
		}
	}
	
	public static acctnode FindAcctId(Hashing accounts){
		System.out.print("Enter your account number: ");
		Scanner read = new Scanner(System.in);
		int acctId = read.nextInt();
		acctnode p = accounts.H[acctId%5];
		while(p.id != acctId){
			p=p.next;
		}
		return p;
	}
	
	public static void Show(Hashing accounts){
		acctnode p = FindAcctId(accounts);
		System.out.println(p.name + ", your balance is " + p.balance);
	}
	
	public static void Deposit(Hashing accounts){
		acctnode p = FindAcctId(accounts);
		System.out.print(p.name + ", how much would you like to deposit?");
		Scanner read = new Scanner(System.in);
		double trans = read.nextDouble();
		p.balance += trans;
		System.out.println("Your new balance is " + p.balance);
	}
	
	public static void Withdraw(Hashing accounts){
		acctnode p = FindAcctId(accounts);
		System.out.print(p.name + ", how much would you like to withdraw?");
		Scanner read = new Scanner(System.in);
		double trans = read.nextDouble();
		p.balance -= trans;
		System.out.println("Your new balance is " + p.balance);
	}
	
	
}
