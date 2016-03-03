package com.wipro;

public class TrianglePattern {
	
	public void getPattern1(){
    	int n = 5;
		for(int i =1; i<=n ;i++){
			for(int k = 1;k<=i;k++){
				System.out.print(k);
			}
			System.out.println();
		}
    }
	
	public void getPattern2(){
    	int n = 5;
		for(int i =1; i<=n ;i++){
			for(int k = 1;k<=(n-i);k++){
				System.out.print(" ");
			}
			for(int k = 1;k<=((2*i)-1);k++){
				System.out.print("*");
			}
			System.out.println();
		}
    }
	
	
	
	public static void main(String[] args) {
		
		TrianglePattern p = new TrianglePattern();
		System.out.println("*******************Pattern1**************************");
		p.getPattern1();
		System.out.println("*******************Pattern2**************************");
		p.getPattern2();
		System.out.println("*******************Pattern3.. chanda**************************");
		
		
		
		
}
}
