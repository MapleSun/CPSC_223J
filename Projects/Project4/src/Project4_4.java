import java.util.*;
public class Project4_4 {
	public static void main(String[] args){
		int[] testVals = {89, 95, 72, 83, 99, 54, 86, 75, 92, 73, 79, 75, 82, 83, 73};
		double avg = calcAverage(testVals);
		System.out.printf("The average of testVals is %.2f %n" , avg);
		
		double variance = variance(avg, testVals);
		System.out.printf("The variance of testVals is %.2f" , variance);
	}
	static double calcAverage(int[] testVals){
		double sum=0;
		for(int i = 0; i<testVals.length; i++){
			sum += testVals[i];
		}
		return sum/testVals.length;
	}
	
	static double variance(double avg, int[] testVals){
		double variance = 0;
		double squares = 0.0;
		for(int i = 0; i < testVals.length; i++){
			squares += Math.pow(testVals[i]-avg, 2);
		}
		return squares/testVals.length;
	}
}


/*********output**********
The average of testVals is 80.67 
The variance of testVals is 116.76
*/