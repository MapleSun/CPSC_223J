import java.io.BufferedReader;
import java.io.FileReader;

public class Project5 {
	public static void main(String[] args){
		PERSON[] a = new PERSON[6];
		double ageAve, gpaAve;
		try {
			copyData("data.txt", a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		display(a);
		ageAve = computeAgeAverage(a);
		gpaAve = computeGpaAverage(a);
		display(ageAve, gpaAve);
		display(a,gpaAve);
		
	}
	
	public static void copyData(String fName, PERSON[] a) throws Exception{
		
		BufferedReader in = new BufferedReader(new FileReader(fName));
		String line;
		int i = 0;
		while((line = in.readLine()) != null){
			
			String token[] = line.split("\t",3);
			
			a[i] = new PERSON(token[0], Integer.parseInt(token[1]), Float.parseFloat(token[2]));
			
			i++;
		};
		in.close();
	}
	
	public static void display(PERSON[] a){
		System.out.println("Teenage Students");
		for(int i = 0; i<a.length; i++){
			if(a[i].getAge() >=13 && a[i].getAge() <= 19){
				System.out.printf("%-10s   %2d  %2.1f %n",a[i].getName(),a[i].getAge(),a[i].getGpa());
			}
		}
	}
	
	public static double computeAgeAverage(PERSON[] a){
		double ageSum=0.0;
		for(int i = 0; i<a.length; i++){
			ageSum += a[i].getAge();
		}
		return  ageSum/a.length;
	}
	
	public static double computeGpaAverage(PERSON[] a){
		double gpaSum = 0.0;
		for(int i = 0; i<a.length; i++){
			gpaSum += a[i].getGpa();
		}
		return  gpaSum/a.length;
	}
	
	public static void display(double ageAve, double gpaAve){
		System.out.printf("Average age is %2.1f, and average gpa is %2.2f %n", ageAve, gpaAve);
	}
	
	public static void display(PERSON[] a, double gpaAve){
		System.out.printf("Student whose gpa is above the average gpa %2.2f %n" , gpaAve);
		for(int i = 0; i<a.length; i++){
			if(a[i].getGpa() >= gpaAve){
				System.out.printf("%-10s   %2d  %2.1f %n",a[i].getName(),a[i].getAge(),a[i].getGpa());
			}
		}
	}
}
