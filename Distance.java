package com.distance;
import java.util.Scanner;
public class Distance {

	public static void main(String[] args) {
		System.out.println("Calculating a Distance!!");
		System.out.println("Enter a number for x::");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("Enter a number for y::");
		int y=sc.nextInt();
		int distance=(int)Math.sqrt(x*x+y*y);
		
		System.out.println("Euclidean distance= "+distance);
	}
	

}
