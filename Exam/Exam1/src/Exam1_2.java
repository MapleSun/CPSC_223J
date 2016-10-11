import java.util.*;
import java.io.*;
public class Exam1_2 {
	public static void main(String[] args){
		String[] names = new String[6];
		try {
			displayInOrder(names);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void displayInOrder(String[] names) throws Exception{
		String fname = "C:\\Users\\yijiesun1993\\Desktop\\dataFile.txt";
		BufferedReader in = new BufferedReader(new FileReader(fname));
		String line = new String();
		int i = 0;
		while((line=in.readLine())!=null){
			names[i] = line;
			i++;
		}
		
		Arrays.sort(names);
		System.out.println("Names in alphabetical order");
		for(int j = 0; j<names.length; j++){
			System.out.println("   "+names[j]);
		}
		
		System.out.printf("Tran,Justin is at index %d", Arrays.binarySearch(names, "Tran,Justin"));
	}
}
