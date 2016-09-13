import java.util.*;
public class Project3_1 {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		//String[] output = new String [3];
		char flag=0;
		do{
			String input, date;
			
			System.out.print("Enter the today's date(mm/dd/yyyy): ");
			input = read.nextLine();
			String[] output = readDate(input);
			System.out.println("Today is " + output[0] + " "+output[1]+", " + output[2]);
			System.out.print("CONTINUE(y/n)? ");
			flag = read.nextLine().charAt(0);
		}while(flag == 'y' || flag == 'Y');
	}
	
	private static String[] readDate(String input){
		String month = new String();
		String date = new String();
		String year = new String();
		String[] result = new String[3]; 
		//String read ="";
		int i=0;
		char ch = input.charAt(i);
		do{
			month+=ch;
			ch = input.charAt(++i);

		}while(ch!='/');
		//System.out.println("month: " + month);
		month = convertMonth(month);
		ch = input.charAt(++i);
		do{
			date+=ch;
			ch = input.charAt(++i);

		}while(ch!='/');
		//System.out.println("Date: " + date);
		date = convertDate(date);
		//System.out.println("index is "+ i + " Token is " + input.charAt(i));
		i++;
		while(i<input.length()){
			ch = input.charAt(i++);
			year+=ch;
		}
		//System.out.println("Year: " + year);
		result[0] = month;
		result[1] = date;
		result[2] = year;
		return result;
	}
	
	private static String convertMonth(String month){
		int mon = Integer.valueOf(month);
		String monthString = new String();
		switch(mon){
			case 1: monthString = "Jan"; break;
			case 2: monthString = "Feb"; break;
			case 3: monthString = "Mar"; break;
			case 4: monthString = "Apr"; break;
			case 5: monthString = "May"; break;
			case 6: monthString = "June"; break;
			case 7: monthString = "July"; break;
			case 8: monthString = "Aug"; break;
			case 9: monthString = "Sept"; break;
			case 10: monthString = "Oct"; break;
			case 11: monthString = "Nov"; break;
			case 12: monthString = "Dec"; break;
			default:
				System.out.println("Invalid Month");
				break;
			
		}
		return monthString;
	}
	
	private static String convertDate(String date){
		int dateInt = Integer.valueOf(date);
		String dateString = new String();
		if(dateInt == 1){
			dateString  = dateInt + "st";
		}else if(dateInt == 2){
			dateString  = dateInt + "nd";
		}else if(dateInt == 3){
			dateString  = dateInt + "rd";
		}else if(dateInt < 31 && dateInt > 0){
			dateString = dateInt + "th";
		}else{
			System.out.println("Invalid Date");
		}
		return dateString;
	}
}
