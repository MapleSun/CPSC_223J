import java.util.Scanner;
public class Project6_2 {
	public static void main(String[] args){
		linkedList mylist = new linkedList();
		Scanner read = new Scanner(System.in);
		int termA, termB;
		boolean first = true;
		do{
			System.out.print("Enter the coefficient and the power of a term(0 0) to stop: ");
			termA=read.nextInt(); termB=read.nextInt();
			mylist.insertQueue(termA);
			mylist.insertQueue(termB);
			String temp = read.nextLine();
		}while(termA != 0 && termB != 0);
		
		System.out.print("F(X) = ");
		node coeff = mylist.queue;
		node pow   = coeff.next;
		while(pow.next != null){
			//mylist.deleteQueue();
			if(coeff.info != 0 && pow.info != 0){
				if(!first){
					System.out.print(" + ");
				}
				first = false;
				System.out.printf("%dX^%d", coeff.info, pow.info);
				coeff = coeff.next.next;
				pow = coeff.next;
			}
		}
		System.out.println();
		
		System.out.printf("Enter the X value: ");
		int x = read.nextInt();
		int result = 0;
		coeff = mylist.queue;
		pow   = coeff.next;
		while(pow.next != null){
			//mylist.deleteQueue();
			if(coeff.info != 0 && pow.info != 0){
				result += coeff.info * Math.pow(x,pow.info);
				coeff = coeff.next.next;
				pow = coeff.next;
			}
		}
		System.out.printf("F(%d) = %d", x, result);
		
	}
}
