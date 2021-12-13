package com.triplet;

public class TripletSum{
		
	public static void main (String[]args){
	int arr[]= {1,2,1,4,2};
	boolean check=false;
    for(int i=0;i<arr.length-2;i++) {
    	
    	 for(int j=i+1;j<arr.length-1;j++) {
    		 for(int k=j+1;k<arr.length;k++) {
    			 if( arr[i]+arr[j]+arr[k]==0) {
    				 System.out.print(arr[i]);
    				 System.out.print(" "+arr[j]);
    				 System.out.println(" "+arr[k]);
    				 check=true;
    			 }
    			 }
    			
    		 }
    		 }
    	if(check==false) {
    		System.out.println("not exist");
    	}
    	 }
    	
    }
	

			

	


