import java.util.*;
public class TWO {
	int x, y, z;
	TWO(){
		Scanner read = new Scanner(System.in);
		x=10;
		System.out.print("Enter the values of y and z: ");
		y = read.nextInt(); z = read.nextInt();
	}
	
	void Display(){
		System.out.println("These are the values of x,y and z \n"
						+"x=" + x + " y=" + y + " z= " + z);
	}
	
	int Sum(){
		return x+y+z;
	}
	
	double Average(){
		return (x+y+z)/3.0;
	}
	
	void Conclusion(){
		System.out.println("The total of x, y, and z is "+ this.Sum() + " and their average is "+ this.Average());
	}
	
}
