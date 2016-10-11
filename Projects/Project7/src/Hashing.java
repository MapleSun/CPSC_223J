
public class Hashing {
	acctnode[] H = new acctnode[5];
	public Hashing(){
		for(acctnode h : H){
			h = null;
		}
	}
	
	public int HashFun(int val){
		return val % 5;
	}
	
	public void insertHash(int id, String name, double balance){
		int i = HashFun(id);
		acctnode temp = new acctnode(id, name, balance);
		temp.next = H[i];
		H[i] = temp;
	}
	
	public void display()
	{
		acctnode p;
		for(int i = 0; i<5; ++i){
			p = H[i];
			System.out.print("Acct[" + i + "]->");
			while(p!=null)
			{
				System.out.print(p.id + "," + p.name + "," + p.balance + "->");
				p=p.next;
			}
			System.out.print("null");
			System.out.println();
		}
	}
}
