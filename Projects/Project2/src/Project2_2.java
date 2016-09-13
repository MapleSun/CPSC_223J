/*
 * Purpose: this program count how many uppercases, digits and vowels in the sentence
 */
import java.util.*;
public class Project2_2 {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		String sentence; 
		System.out.print("Enter sentence: ");
		sentence = read.nextLine();
		int upperCase=0, digit=0, vowel=0;
		int i=0;
		char ch;
		while(i!=sentence.length()){
			ch = sentence.charAt(i);
			//check digits and upperCase
			if(Character.isUpperCase(ch)){
				upperCase++;
			}else if(Character.isDigit(ch)){
				digit++;
			}
			
			//check vowel
			char lower = Character.toLowerCase(ch);
			if(lower == 'a' || lower == 'e' || lower=='i' || lower=='o' || lower=='u'){
				vowel++;
			}
			i++;
		}
		System.out.println("Number of uppercase letters............" + upperCase 
				       + "\nNumber of digits......................." + digit 
				       + "\nNumber of vowels......................." + vowel);
	}
}

/*
Enter sentence: Today Is Thr May 3, 2016
Number of uppercase letters............4
Number of digits.......................5
Number of vowels.......................4
*/