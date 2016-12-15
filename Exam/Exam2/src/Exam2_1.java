
public class Exam2_1 {
	public static void main(String[] args){
		int[] setA = {8, 3, 7, 4, 1};
		int[] setB = {3,8,11,12,9,13};
		
		OrderedList O1 = new OrderedList();
		OrderedList O2 = new OrderedList();
		
		for(int i = 0; i<setA.length; i++ ){
			O1.insertOrder(setA[i]);
		}
		for(int j = 0; j<setB.length; j++){
			O2.insertOrder(setB[j]);
		}
		
		System.out.print("List1->");
		O1.display();
		System.out.println();
		System.out.print("List2->");
		O2.display();
		
		node order1=O1.order, order2 = O2.order;
		
		System.out.println();
		System.out.print("ListA|B->");
		
		while(order1 != null && order2 != null){
			if(order1.info == order2.info){
				System.out.print(order1.info + "->");
				order1 = order1.next;
				order2 = order2.next;
			}else if(order1.info > order2.info){
				order2 = order2.next;
			}else if(order2.info > order1.info){
				order1 = order1.next;
			}
		}
		System.out.print("null");
		
	}
	
}
