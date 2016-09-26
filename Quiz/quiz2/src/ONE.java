public class ONE {
	public static void main(String[] args){
		TWO two  = new TWO();
		two.Display();
		two.Conclusion();
		System.out.println("The maximum of x, y and z is " + Maximum(two.x, two.y, two.z));
	}
	
	private static int Maximum(int x, int y, int z){
		int max;
		max = x>y?(x>z?x:z):(y>z?y:z);
		return  max;
	}
}