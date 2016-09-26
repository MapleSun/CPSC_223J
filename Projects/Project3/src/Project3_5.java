
public class Project3_5 {
	public static void main(String[] args){
		
		System.out.println(compute(10));
	}
	
	private static double compute(int n){
		long sum=0;
		System.out.println("3^"+n+" = " +Math.pow(3, n));
		if(n == 3) 
			return Math.pow(3, n);
		return  sum + Math.pow(3, n)+compute(--n);
	}
}
