
public class linkedList {
	node stack, queue, ordered;
	studentNode squeue;
	linkedList(){stack = null; queue = null; ordered = null;}
	
	
	public void insertStack(int val){
		//insert in front of list
		node temp = new node(val);
		temp.next = stack;
		stack = temp;
	}
	
	public void deleteStack(){
		if(stack != null){
			node p = stack;
			stack = stack.next;
			p = null;
		}
	}
	
	public void insertQueue(int val){
		//insert val at next of list
		node temp = new node(val);
		node p;
		if(queue == null){
			queue = temp;
		}else{
			// make p to point to the last node
			p = queue;
			while(p.next!=null){
				p=p.next;
			}
			p.next=temp;
		}
	}
	
	public void insertQueue(String name, int minute){
		//insert val at next of list
		studentNode temp = new studentNode(name, minute);
		studentNode p;
		if(squeue == null){
			squeue = temp;
		}else{
			// make p to point to the last node
			p = squeue;
			while(p.next!=null){
				p=p.next;
			}
			p.next=temp;
		}
	}
	
	public void deleteQueue(){
		if(queue != null){
			node p = queue;
			queue = queue.next;
			p = null;
		}
	}
	
	public void insertOrdered(int val){
		//insert val in position to keep the list on ordered list
		node temp = new node(val);
		node p,q; 
		p=q=ordered;
		while(p!=null && p.info<val){
			q=p;
			p=p.next;
		}
		if(p==ordered){
			temp.next = p;
			ordered = temp;
		} else if (p == null){
			q.next = temp;
		} else {
			temp.next = p;
			q.next = temp;
		}
	}
	
	public void display(node p){
		while(p!=null){
			System.out.print(p.info + "->");
			p=p.next;
		}
		System.out.println("null");
	}
}
