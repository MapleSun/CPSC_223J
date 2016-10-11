import	java.util.*;
import	java.io.*;
public	class	PERSON	{
	private	String	name;
	private	int age;
	private	double gpa;
	PERSON(String n, int a,	double d)
	{name=n; age = a;gpa = d;}
	public String getName(){return name;}
	public int	getAge() {return age;}
	public double getGpa(){return gpa;}
}