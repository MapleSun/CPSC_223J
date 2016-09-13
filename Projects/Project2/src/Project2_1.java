/*
 * Purpose: This program calculate the exchange rate between dollar and other currency
 */

public class Project2_1 {
	public static void main(String[] args){
		double dollar = 10.0;
		String title  = "  $	\u00a5	\u00a3	\u20ac </u>";
		System.out.println(" $	\u00a5	\u00a3	\u20ac\033");
		//System.out.println();
		int count = 30;
		for(int j=0; j<count; j++){
			System.out.print("\u005f");
		}
		System.out.println();
		//System.out.println("————------------------------");
		for(dollar = 10;dollar <= 100.0; dollar+=10){
			double yen = dollar * 103.45;
			double pound = dollar * 0.75;
			double euro = dollar * 0.9;
			System.out.printf("%-6.2f %-8.2f %-6.2f %4.2f %n",dollar,yen,pound,euro);
		}
	}
}
/*
 $	¥	£	€
______________________________
10.00  1034.50  7.50   9.00 
20.00  2069.00  15.00  18.00 
30.00  3103.50  22.50  27.00 
40.00  4138.00  30.00  36.00 
50.00  5172.50  37.50  45.00 
60.00  6207.00  45.00  54.00 
70.00  7241.50  52.50  63.00 
80.00  8276.00  60.00  72.00 
90.00  9310.50  67.50  81.00 
100.00 10345.00 75.00  90.00 

*/