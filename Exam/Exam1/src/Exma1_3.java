import java.util.*;
public class Exma1_3 {
	public static void main(String[] args){
		PERSON name[] = {new PERSON("Donavan",33,3.3), new PERSON("Michael",22,2.2),
				new PERSON("David",17,1.7), new PERSON("Tevin",34,3.4),
				new PERSON("Felipe",27,2.7), new PERSON("Simin",14,1.4)
		};
		displayOldest(name);
		displayLowest(name);
	}
	public static void displayOldest(PERSON[] name){
		int oldest = 0;
		int ageCol = 1;
		int index = 0;
		for(int i = 0; i<name.length; i++){
			if(oldest < name[i].getAge()){
				oldest=name[i].getAge();
				index = i;
			}
		}
		System.out.println("The oldest person name is " + name[index].getName());
	}
	public static void displayLowest(PERSON[] name){
		double lowest = 4.0;
		int gpaCol = 2;
		int index = 0;
		for(int i = 0; i<name.length; i++){
			if(lowest > name[i].getGpa()){
				lowest=name[i].getGpa();
				index = i;
			}
		}
		System.out.println("The lowest person name is " + name[index].getName()
							+ " Age is: " + name[index].getAge());
	}

}
