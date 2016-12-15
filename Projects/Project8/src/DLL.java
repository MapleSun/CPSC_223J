
public class DLL {
	DLLN list;
	DLLN end;
	public DLL(){list = null;}
	public void insert(String val)
	{
		DLLN p = new DLLN(val);
		if(list == null){
			list = p;
			end = p;
			//list.next = list;
		}else{
			p.next = list;
			//p.prev = list;
			list.prev = p;
			list = p;
			list.prev = end;
		}
	}
	
	public void displayLR(){
		DLLN p = list;
		while(p!=null){
			System.out.print(p.name + "->");
			p=p.next;
		}
		System.out.println();
	}
	
	
	public void displayRL(){
		DLLN p = list.prev;
		do{
			System.out.print(p.name + "->");
			p=p.prev;
		}while(p!=list.prev);
		System.out.println();
	}
}
