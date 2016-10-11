import java.util.*;
public class Exam1_4 {
	public static void main(String[] main){
		int n=15;
		System.out.println(Fib(n));
	}
	public static double Fib(int n){
		double pow=Math.pow(3, n);
		System.out.println("3^" +n+" = " + pow);
		if(n==2){
			return Math.pow(3, 2);
		}else{
			return pow+Fib(--n);
		}
	}
}
