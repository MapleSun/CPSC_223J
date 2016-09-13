/*
 * Project: Quiz1
 * Name: Yijie Sun
 * Date: Sept.8 2016
 * Purpose: This program read phone number with letter and convert it to all number
 * */
 
import java.util.*;
public class quiz1 {
	public static void main(String[] arg){
		Scanner read = new Scanner(System.in);
		String phoneNum="";
		String allNum  ="";
		char Continue;
		
		do{
			System.out.print("Enter a phone number: ");
			phoneNum = read.nextLine();
			allNum = convert(phoneNum);
			System.out.println(phoneNum + " or " + allNum);
			System.out.print("CONTINUE(y/n)? ");
			//String flag = read.nextLine();
			Continue = read.next().charAt(0);
			String temp = read.nextLine();
		}while(Continue =='y' || Continue =='Y');
	}
	
	private static String convert(String phoneNum){
		String allNum = "";
		
		for(int i=0; i<phoneNum.length(); i++){
			if(i == 9){
				allNum+='-';
			}
			char ch = phoneNum.charAt(i); 
			if(!Character.isAlphabetic(ch)){
				allNum+=ch;
			}else if(Character.isAlphabetic(ch)){
				ch = Character.toLowerCase(ch); 
				if(ch =='a' || ch=='b' || ch=='c'){
					 allNum += '2';
				}else if(ch =='d' || ch=='e' || ch=='f'){
					allNum += '3';
				}else if(ch =='g' || ch=='h' || ch=='i'){
					allNum += '4';
				}else if(ch =='j' || ch=='k' || ch=='l'){
					allNum+='5';
				}else if(ch =='m' || ch=='n' || ch=='o'){
					allNum+='6';
				}else if(ch =='p' || ch=='q' || ch=='r' || ch=='s'){
					allNum+='7';
				}else if(ch =='t' || ch =='u'||ch=='v'){
					allNum+='8';
				}else if(ch =='w' || ch=='x' || ch=='y' || ch== 'z'){
					allNum+='9';
				}
			}
		}
		return allNum;
	}
}

/********output*********
Enter a phone number: 1-800-Dentist
1-800-Dentist or 1-800-336-8478
CONTINUE(y/n)? y
Enter a phone number: 1-800-funcars
1-800-funcars or 1-800-386-2277
CONTINUE(y/n)? n
*/

