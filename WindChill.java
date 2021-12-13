package com.windchill;
import java.util.Scanner;
public class WindChill {

	public static void main(String[] args) {
		System.out.println("Enter a value for t(>50 must)::");
		Scanner sc=new Scanner(System.in);
		double temperature=sc.nextInt();
		System.out.println("Enter a value for v(<3 or >120)::");
		double windSpeed=sc.nextInt();	
		
		
		if(temperature>50 &&(windSpeed<3 ||windSpeed>120)) {
			double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
			System.out.println("windChill= "+windChill);
	}
		else {
			System.out.println("Please enter valid value");
		}
}
}
