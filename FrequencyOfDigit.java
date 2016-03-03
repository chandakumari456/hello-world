package com.wipro;

public class FrequencyOfDigit {

	public static void main(String[] args) {
		
		int n = 16635;
		int freq[] = new int[10];
		for(int k =0; k<freq.length;k++){
			freq[k] = 0;
		}
		
		while(n>0){
		int	d = n%10;
		 freq[d]++;
		 n = n/10;
			
		}
		for(int k =0; k<freq.length;k++){
			if(freq[k]!= 0){
				System.out.println("no. of times "+ k+ " occour" + freq[k]);
				
			}
			
		}
		

	}

}
