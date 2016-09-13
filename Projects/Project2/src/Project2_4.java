/*
 * Purpose: The program read the input and coount the votes
 */
import java.util.Scanner;
public class Project2_4 {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		String votes;
		int yVotes = 0, nVotes = 0;
		System.out.print("Enter a string of YES and NO votes: ");
		votes = read.nextLine();
		int i=0;
		while(i!=votes.length()){
			if(votes.charAt(i) == 'y' || votes.charAt(i)=='Y'){
				yVotes++;
			}else{
				nVotes++;
			}
			i++;
		}
		System.out.print("YES votes: ");
		for(int j = 0; j<yVotes; ++j) System.out.print('*');
		System.out.println();
		System.out.print("NO votes: ");
		for(int j = 0; j<nVotes; ++j) System.out.print('*');
		
	}
}

/*
Enter a string of YES and NO votes: yynnyynn
YES votes: ****
NO votes: ****
*/