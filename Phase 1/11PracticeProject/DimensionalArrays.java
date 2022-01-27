package com.Harshitha.sl.Assignements;

public class DimensionalArrays {
			public static void main(String[] args) {
			//single dimensional array
			int a[]=new int[3];  
			a[0]=10; 
			a[1]=20;  
			a[2]=30; 
			for(int i=0;i<a.length;i++)
			System.out.println(a[i]);  
	      	//Multi dimensional array  
			int arr[][]={{1,2,3},{4,5,6},{7,8,9}};   
			for(int i=0;i<3;i++){  
			 for(int j=0;j<3;j++){  
			   System.out.print(arr[i][j]+" ");  
			 }  
			 System.out.println();  
          }
     }
}

