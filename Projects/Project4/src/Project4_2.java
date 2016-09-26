import java.util.*;
import java.lang.*;
public class Project4_2 {
	public static void main(String[] args){
		String[] Fortune = {"Study more", "Go to movie", "Relax", "Sleep"};
		int i = 0;
		do{
			//System.out.print(Math.random());
			i = (int)(Math.random() * 4); // 0-3
			System.out.println(Fortune[i]);
		}while(i!= 3);
	}
}


/*********output**********
Relax
Relax
Relax
Study more
Sleep
*/