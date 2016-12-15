
public class AcctBST {
	AcctN root;
	public AcctBST(){
		root = null;
	}
	public void insert(int id, String name, double balance){
		AcctN p = new AcctN(id, name, balance);
		if(root == null){
			root = p;
			return;
		}
		AcctN current = root;
		AcctN parent = null;
		while(true)
		{
			parent = current;
			if(id < current.id)
			{
				current = current.left;
				if(current == null)
				{
					parent.left = p;
					return;
				}
			}else{
				current = current.right;
				if(current == null)
				{
					parent.right = p;
					return;
				}
			} // end of if else
		} // end of while
	}
	
	public void display(AcctN p){
		if(p!=null){
			display(p.left);
			System.out.printf("%5d  %15s  %5.2f%n", p.id, p.name, p.balance);
			display(p.right);
		}
	}
	
	
	public AcctN search(int id, AcctN p){
		if(p == null){
			return null;
		}else if(p.id == id){
			return p;
		}else{
			if(p.id > id){
				return search(id, p.left);
			}else{
				return search(id, p.right);
			}
		}
		
	}
}
