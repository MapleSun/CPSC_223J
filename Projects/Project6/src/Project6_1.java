import java.util.*;

public class Project6_1 {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		String phrase = new String();
		linkedList mylist = new linkedList();
		
		char cont = ' ';
		do{
			boolean plaindrome = true;
			System.out.print("Enter a phrase:");
			phrase = read.nextLine();
			for(int i = 0; i < phrase.length(); i++){
				if(Character.isAlphabetic(phrase.charAt(i))){
					char temp = Character.toLowerCase(phrase.charAt(i));
					mylist.insertStack(temp);
					mylist.insertQueue(temp);
					
				}
			}
			//mylist.display(mylist.queue);
			//mylist.display(mylist.stack);
			while(mylist.stack!= null && mylist.queue != null && plaindrome ){
				if(mylist.stack.info == mylist.queue.info){
					//System.out.println("Queue: " + mylist.queue.info + " Stack: " + mylist.stack.info);
					mylist.deleteStack();
					mylist.deleteQueue();
				}else{
					plaindrome = false;
				}
			}
			if(plaindrome){
				System.out.println("Is a PALINDROME");
			}else{
				System.out.println("Not a PLAINDROME");
			}
			mylist.stack = null;
			mylist.queue = null;
			
			System.out.print("Continue(y/n)?");
			cont = read.next().charAt(0);
			String temp = read.nextLine(); 
			
		}while(cont == 'y' || cont == 'Y');
		
		
	}
}
