package com.wipro;

public class Spiralmatrix {
	
	public static void spiral(int [][] matrix)

	{

	int left = 0;

	int right = matrix[0].length -1;

	int top = 0;

	int bottom = matrix.length -1;

	while( right >= left && bottom >= top)

	{

	for( int i = left ; i <= right; i++)

	System.out.print( matrix[top][i] + " " );

	top++;

	//System.out.println();

	for ( int i = top ; i<= bottom; i++)

	System.out.print( matrix[i][right] + " ");

	right--;

	//System.out.println();

	for ( int i = right ; i >= left ; i--)

	System.out.print( matrix[bottom][i] + " ");

	bottom--;

	// System.out.println();

	for( int i = bottom ; i>=top ; i--)

	System.out.print( matrix[i][left] + " ");

	left++;

	// System.out.println();

	}

	}
	
	
	

	public static void main(String[] args) {
		
		int a[][]=new int[4][4];
		int count = 0;
		for(int i=0;i < 4 ;i++){
			for(int j=0;j < 4 ;j++){
				a[i][j] = ++count;
				
			}
		}
		for(int i=0;i < 4 ;i++){
			for(int j=0;j < 4 ;j++){
				System.out.print(" "+a[i][j]);
				
			}
			System.out.println("");
		}
		
			System.out.println("hello");
			  spiral(a);
		

	}

}
