
public class BST {
	BSTN root;
	public BST(){
		root = null;
	}
	
	public void insert(String val, int days){
		BSTN p = new BSTN(val, days);
		if(root == null){
			root = p;
			return;
		}
		BSTN current = root;
		BSTN parent = null;
		while(true)
		{
			parent = current;
			if(val.compareTo(current.info) < 0)
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
	
	public static void display(BSTN p){
		if(p!=null){
			display(p.left);
			System.out.printf(" %-15s  %2d\n",p.info , p.days);
			display(p.right);
		}
	}
	
	public static void displayLeaves(BSTN p){
		//System.out.print("Leaves of the tree are: ");
		if(p!=null){
			if(p.left!=null)
				displayLeaves(p.left);
			if(p.right!=null)
				displayLeaves(p.right);
			if(p.left == null && p.right == null){
				System.out.print(p.info + " ");
			}
		}
	}
	
	
	public static void displayTwoChildern(BSTN p){
		if(p!=null){
			if(p.left != null && p.right != null){
				System.out.print(p.info + " ");
				displayTwoChildern(p.left);
				displayTwoChildern(p.right);
			}
			else if(p.left!=null)
				displayTwoChildern(p.left);
			else if(p.right!=null)
				displayTwoChildern(p.right);
		}
	}
	
	
	/*
	public static void displayOnlyOne(BSTN p){
		if(p!=null){
			if(p.left !=null && p.right != null){
				displayOnlyOne(p.left);
				displayOnlyOne(p.right);
			}else if(p.left == null && p.right != null){
				System.out.print(p.info + " ");
				//displayOnlyOne(p.right);
			}else if (p.left != null && p.right == null){
				System.out.print(p.info + " ");
				displayOnlyOne(p.left);
			}
		}
	}
	*/
	public static void displayOneChild(BSTN p){
		if(p!=null){
			if(p.left == null && p.right != null){
				System.out.print(p.info + " ");
				displayOneChild(p.right);
			}else if(p.left != null && p.right == null){
				System.out.print(p.info + " ");
				displayOneChild(p.left);
			}else if(p.left != null && p.right != null){
				displayOneChild(p.left);
				displayOneChild(p.right);
			}
		}
	}
	
	public static int countNodes(BSTN p){
		if(p==null)
			return 0;
		else
			return 1 + countNodes(p.left) + countNodes(p.right); 
	}

	public static int max(int a, int b){
		return a>b?a:b;
	}
	
	public static int countHeight(BSTN p){
		if(p == null) return 0;
		else return 1+max(countHeight(p.left), countHeight(p.right));
	}
	
	
}
