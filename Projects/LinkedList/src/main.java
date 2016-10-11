
public class main {
	public static void main(String[] args){
		linkedList mylist = new linkedList();
		int a[] = {3, 9, 5, 1, 2};
		for (int i=0; i < a.length; i++){
			mylist.insertQueue(a[i]);
		}
		System.out.println("this is content of stack");
		mylist.display(mylist.queue);
	}
}
