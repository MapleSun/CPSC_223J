import java.util.*;
public class Project7_1 {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		linkedList setA = new linkedList();
		linkedList setB = new linkedList();
		linkedList setAUB = new linkedList();
		enterInt(setA, "setA", read);
		display(setA, "setA=");
		enterInt(setB, "setB", read);
		display(setB, "setB=");
		Union(setA,setB,setAUB);
		display(setAUB, "setAUB=");
		
	}
	public static void enterInt(linkedList set, String setName, Scanner read){
		System.out.println("Enter the number of " + setName + ": ");
		System.out.print("  Enter a group of positive integer number with -1 at the end: ");
		int num = read.nextInt();
		while(num != -1){
			set.insertOrdered(num);
			num = read.nextInt();
		}
		String temp = read.nextLine();
	}
	
	public static void Union(linkedList setA, linkedList setB, linkedList setAUB){
		node p = setA.ordered;
		node q = setB.ordered;
		
		while(p!=null && q!=null){
			
			if(p.info<q.info ){
				setAUB.insertOrdered(p.info);
				p = p.next;
			}else if(p.info>q.info){
				setAUB.insertOrdered(q.info);
				q=q.next;
			}else{
				setAUB.insertOrdered(p.info);
				p=p.next;
				q=q.next;
			}
		}	
		while(p!= null){
			setAUB.insertOrdered(p.info);
			p = p.next;
		}
		while(q!= null){
			setAUB.insertOrdered(q.info);
			q = q.next;
		}
		
	}
	
	public static void display(linkedList set, String setName){
		System.out.print(setName);
		set.display(set.ordered);
	}
}
