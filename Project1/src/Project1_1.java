/*
 * 		Name: Yijie Sun, Zihao Qiu
 * 		Course: CPSC 223J
 * 		Project: Project 1
 * 		Due date: Sept. 1st. 2016
 */


/*
 * 	Purpose: This program read one rectangle's width and length.
 * 			 It calculates the area and perimeter of the rectangle.
 */

import java.util.*;

public class Project1_1 {
	
	public static void main(String[] args)
	{
		float width, length, Area, Perimeter;
		Scanner read = new Scanner(System.in);
		System.out.print("Enter the measure of width: ");
		width = read.nextFloat();
		System.out.print("Enter the measure of length: ");
		length = read.nextFloat();
		Area = width * length;
		Perimeter = 2 * (length + width);
		System.out.printf("Area = %.2f %n", Area);
		System.out.printf("Perimeter = %.2f %n", Perimeter);
	}
}

/* --------------output-------------------
 	Enter the measure of width: 23.90
	Enter the measure of length: 44.01
	Area = 1051.84 
	Perimeter = 135.82 
*/


