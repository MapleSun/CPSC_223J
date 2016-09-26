/*
 * Purpose: Compute trangle's perimeter and area
 */
import java.util.Scanner;
public class Project3_4 {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		double a, b, c;
		System.out.print("Three length of a triangle: ");
		a = read.nextDouble(); b = read.nextDouble(); c = read.nextDouble();
		Trangle trangle = new Trangle();
		System.out.println("Perimeter = "+ trangle.computePerimeter(a,b,c));
		System.out.println("Area = "+ trangle.computeArea(a,b,c));
	}
}
