
public class OrderedList {
	node order;
	
	public OrderedList(){
		order = null;
	}
	
	public void insertOrder(int val){
		node temp = new node(val);
		if(order == null){
			order = temp;
		}
		else
		{
			node p = order;
			node q = order;
			
			while((p!=null) && (p.info <=val))
			{
				q=p; p= p.next;
			}
			if(p==null)
				q.next = temp;
			else if(p == order)
			{
				order = temp; temp.next = p;
			}
			else
			{
				q.next = temp; temp.next = p;
			}	
		}
	}
	
	public void display(){
		node p = order;
		
		while(p!=null){
			System.out.print(p.info + "->");
			p = p.next;
		}
		System.out.print("null");
	}
}
