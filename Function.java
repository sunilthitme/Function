	package com.function;
import java.util.Scanner;
public class Function {

	public static void main(String[] args) {
	
		System.out.println("Creating two  Dimensional Array");
		System.out.println("Enter a number of rows");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		System.out.println("Enter a number of rows");
		int n=sc.nextInt();
		int z=1;
		Function arr=new Function();
		arr.func(m, n, z);
		
	}
	public void func(int m,int n, int z) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				int arr[][]=new int [m][n];
				arr[i][j]=z;
				 System.out.println("arr"+"["+i+"]"+"["+j+"]"+" = " + arr[i][j]);
				z++;
			}
		}
	}
}
	
			 
				

