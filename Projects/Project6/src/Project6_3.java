import java.util.*;
import java.io.*;
public class Project6_3 {
	
	public static void main(String[] args){
		String[] queue = new String[5];
		linkedList waitinglist = new linkedList();
		
		
		try {
			copydata("waiting_sheet", waitinglist);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The queue before the Chair calls student one-by-one");
		display(waitinglist);
		while(waitinglist.squeue!=null){
			studentNode min = findMin(waitinglist);
			System.out.println(min.name + " is served, now the queue is");
			display(waitinglist);
		}
	}
	
	
	// change to squeue
	public static void copydata(String fName, linkedList waitinglist) throws Exception{
		BufferedReader in = new BufferedReader(new FileReader(fName));
		String line;
		int i = 0;
		
		while((line = in.readLine()) != null){
			String token[] = line.split(" ", 2);
			waitinglist.insertQueue(token[0],Integer.parseInt(token[1]));
			i++;
		};
		in.close();
	}
	
	
	
	public static studentNode findMin(linkedList waitinglist){
		studentNode min = waitinglist.squeue;
		studentNode index = waitinglist.squeue.next;
		studentNode minParent = waitinglist.squeue;
		studentNode indexParent = waitinglist.squeue;
		if(index == null){
			//System.out.println("end");
			waitinglist.squeue = min.next;
			min.next = null;
			return min;
		}
		
		while(index!=null){
			if(index.miniutes < min.miniutes){
				min = index;
				minParent = indexParent;
				index = index.next;
				indexParent = indexParent.next;
				
			}else{
				index=index.next;
				indexParent = indexParent.next;
			}
		}
		
		//System.out.print("###");
		if(min == waitinglist.squeue){
			waitinglist.squeue = min.next;
			min.next = null;
		}else{
			minParent.next = min.next;
			//System.out.print(minParent.name);
			min.next = null;
		}
		return min;
	}
	
	/*
		Bob 10
		Mary 7
		Bill 5
		Tom 15
		Jack 3
	 */
	
	
	public static void display(linkedList waitinglist){
		System.out.printf("squeue");
		String name = new String();
		studentNode p = waitinglist.squeue;
		while(p!=null){
			name = p.name;
			System.out.print(" --> " + name + "," + p.miniutes);
			p=p.next;
		}
		System.out.println(" --> NULL");
	}
		
}
