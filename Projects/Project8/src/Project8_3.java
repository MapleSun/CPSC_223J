import java.util.*;
import java.io.*;

public class Project8_3 {
	public static void main(String[] args){
		DLL doublelinked = new DLL();
		String fName = "month";
		try {
			copydata(fName, doublelinked);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		doublelinked.displayLR();
		doublelinked.displayRL();

	}
	
	public static void copydata(String fName, DLL doublelinked) throws Exception{
		BufferedReader read = new BufferedReader(new FileReader(fName));
		String line = new String();
		
		while((line = read.readLine())!=null){
			String[] token = line.split("\t",3);
			doublelinked.insert(token[0]);
		}
	}
}
