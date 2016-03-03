package com.wipro;

public class Pattern1 {
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
    	int n = 10;
    	int count=1;
		for(int i =1; count<=n ;i++){
			for(int k= 1;k<=i;k++){
				System.out.print(count);
				count++;
			}
			System.out.println();
		}
    }
    
    public void getPattern3(){
   
    	int count=4;
		for(; count>1 ;count--){
			for(int k= 1;k<=count;k++){
				System.out.print(count);
			}
			System.out.println();
		}
		
		for(; count<=4 ;count++){
			for(int k= 1;k<=count;k++){
				System.out.print(count);
			}
			System.out.println();
		}
		
    }
    
    public void getPattern4(){
    	int count=5;
		for(; count>1 ;count--){
			for(int k= 1;k<=count;k++){
				System.out.print(k);
			}
			System.out.println();
		}
		
		for(; count<=5 ;count++){
			for(int k= 1;k<=count;k++){
				System.out.print(k);
			}
			System.out.println();
		}
    }
    
    public void getPattern5(){
    	/*int ck=0,c=2;
        while(c>0){
        if(ck==0){
            for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();         }
            ck++;
       } else{
            for(int i=1,r=5-1;i<=5-1;i++,r--){
            for(int j=1;j<=r;j++){
                System.out.print(j);            }
            System.out.println();
        }
        }
        c--;
      }*/
    	int count=1;
		for(; count<5 ;count++){
			for(int k= 1;k<=count;k++){
				System.out.print(k);
			}
			System.out.println();
		}
		// System.out.println(count);
		for(; count >= 1 ;count--){
			for(int k= 1;k<=count;k++){
				System.out.print(k);
			}
			System.out.println();
			
		}
    	
    	
    	
    }
   
    public void getPattern6(){
    	   
    	int row=1;
		for(; row <=5 ;row++){
			for(int k= 1;k<=row;k++){
				System.out.print(k);
			}
			if(row!=5){
				System.out.print(" ");
			}
			for(int j = row;j>=1;j--){
				System.out.print(j);
			}
			System.out.println();
		}
		
    }
    
    public void getPattern7(){
 	   
    	/*int in = 6; //change input
    	for(int i=1;i<=in;i++){
    	for(int j=1;j<in;j++){
    	System.out.print(i);
    	if(j==in-1){
    	System.out.println(i+1);
    	}
    	}
    	}
    	*/
    	
    	int row =6;
    	for(int k = 1; k <= row ; k++){
    		for(int j = 1; j <= 5 ; j++){
			System.out.print(k);
    		}
    		System.out.println(k+1);
    	}
		
    }
    
    public void getPattern8(){
 	   
    	int row=6;
    	int count=0;
    	boolean flag = true;
		for(int k =1; k <=6 ;k++){
			if(flag){
			count++;
			for(int j= 1;j<=5;j++){
				System.out.print(count);
			}
			count++;
			System.out.print(count);
			flag = false;
			
			}
			else{
				count++;
				System.out.print(count);
				count--;
				for(int j= 1;j<=5;j++){
					System.out.print(count);
				}
				flag = true;
			}
			System.out.println();
		}
		
    }
    public void getPattern9(){
 	   
    	int row=1;
		for(; row <=9 ;row++){
			if(row<=5){
			for(int j = 1; j<=row-1; j++){
				System.out.print(" ");
			}
			for(int k= 5;k >=row;k--){
				System.out.print(k);
			}
			}
			else{
				for(int j = 1; j<=9-row; j++){
					System.out.print(" ");
				}
				for(int k= 5;k >9-row;k--){
					System.out.print(k);
				}
			}
			
			
			System.out.println();
		}
		
    }
    
    
    
    
	public static void main(String[] args) {
	
		Pattern1 p = new Pattern1();
		System.out.println("*******************Pattern1**************************");
		p.getPattern1();
		System.out.println("*******************Pattern2**************************");
		p.getPattern2();
		System.out.println("********************Pattern3*************************");
		p.getPattern3();
		System.out.println("*********************Pattern4************************");
		p.getPattern4();
		System.out.println("***********************Pattern5**********************");
		p.getPattern5();
		System.out.println("***********************Pattern6**********************");
		p.getPattern6();
		System.out.println("***********************Pattern7**********************");
		p.getPattern7();
		System.out.println("***********************Pattern8**********************");
		p.getPattern8();
		System.out.println("***********************Pattern9**********************");
		p.getPattern9();
	}

}
