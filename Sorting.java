package com.wipro;

public class Sorting {
	
	public int[] getSelectionSort(int[] a){
		for(int k =0; k < a.length; k++){
			int beg_indx= k;
			int min_indx= k;
			int min = a[k]; 
			for(int m =k+1; m < a.length; m++){
				if(a[m] < min){
					min = a[m];
					min_indx = m;
				}
				
			}
			if(beg_indx!=min_indx){
				int temp;
				temp = a[min_indx];
				a[min_indx]=a[beg_indx];
				a[beg_indx] = temp;
				
			}
		}
	return a;	
	}
	
	public int[] getBubbleSort(int[] a){
		for(int k =0; k < a.length-1; k++){
			for(int m =0; m <a.length-1; m++){
				if(a[m] > a[m+1]){
					int temp;
					temp = a[m];
					a[m]=a[m+1];
					a[m+1] = temp;
					
				}
			}
			
		}
	return a;	
	}
	
	
	public static void main(String[] args) {
		
		int a[] = {45,2,5,89,64,77,11,22,33,1};
		Sorting sort = new Sorting();
		int [] b = sort.getSelectionSort(a);
		for(int m =0; m <  b.length; m++){
			System.out.print(b[m]+" ");
			}
		System.out.println("");
		int [] c = sort.getBubbleSort(a);
		for(int m =0; m <  c.length; m++){
			System.out.print(c[m]+" ");
			}
		
			
		}
		
		
	}
	


