package com.wipro;

public class Search {
	
	public void linearSearch(){
    	int n = 5;
		for(int i =1; i<=n ;i++){
			for(int k = 1;k<=i;k++){
				System.out.print(k);
			}
			System.out.println();
		}
    }
	public void binarySearch(){
    	int n = 5;
		for(int i =1; i<=n ;i++){
			for(int k = 1;k<=i;k++){
				System.out.print(k);
			}
			System.out.println();
		}
    }
	
	
	
	

	public static void main(String[] args) {
		
		Search se= new Search();
		System.out.println("**************LinearSearch***************");
		se.linearSearch();
		System.out.println("**************BinarySearch***************");
		se.binarySearch();
		

	}

}
