import java.util.*;
import java.io.*;
public class Project8_1 {
	public static void main(String[] args){
		BST bst = new BST();
		String fName = "month";
		try{
			copydata(fName, bst);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Month's name      No.Days");
		System.out.println("--------------------------");
		bst.display(bst.root);
		// Leaves
		System.out.print("Leaves of the tree are: ");
		bst.displayLeaves(bst.root);

		// Parents with two Children
		System.out.print("\nParents with two children are: ");
		bst.displayTwoChildern(bst.root);
		
		// Parents with only one child
		System.out.print("\nParents with only one child are: ");
		//bst.displayOnlyOne(bst.root);
		bst.displayOneChild(bst.root);
		
		// num of nodes
		System.out.println("\nThere are " + bst.countNodes(bst.root) + " nodes in the tree.");
		
		// height of tree
		System.out.println("The height of tree is " + bst.countHeight(bst.root));
		
	}

	
	
	public static void copydata(String fName, BST bst) throws Exception
	{
		BufferedReader read = new BufferedReader(new FileReader(fName));
		String line = new String();
		
		while((line = read.readLine())!=null){
			String[] token = line.split("\t",2);
			bst.insert(token[0], Integer.parseInt(token[1]));
		}
	}
	
	
}