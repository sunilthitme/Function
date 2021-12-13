package com.quadratic;
import java.util.Scanner;
public class Quadratic {

	public static void main(String[] args) {
		System.out.println("Calculating a Quadratic Equation!!");
		System.out.println("a*x*x + b*x + c");
		System.out.println("Enter a value for a::");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter a value for b::");
		int b=sc.nextInt();	
		System.out.println("Enter a value for c::");
		int c=sc.nextInt();
		System.out.println(a+"*x*x"+"+" +b+"*x" +"+"+c);
		int delta = b*b - 4*a*c;
	    double rootX1 = (-b + (int)Math.sqrt(delta))/(2*a);
	    System.out.println("Root 1 of x = "+rootX1);
	    double rootX2 = (-b - (int)Math.sqrt(delta))/(2*a);
	    System.out.println("Root 2 of x = "+rootX2);
	}

}
