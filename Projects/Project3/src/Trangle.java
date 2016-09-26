import java.util.*;
public class Trangle {
	static double computePerimeter(double a, double b, double c){
		return (a+b+c)/2;
	}
	
	static double computeArea(double a, double b, double c){
		double p = computePerimeter(a,b,c);
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
}
