package com.LearnIT.shakya;

import java.lang.reflect.Array;

/**
 * 
 * @author ruchina
 *
 */

public class HelloWorld {
	
	//bubbleSortMethod
	public static void bubbleSortMethod(int [] arr){
		int n = arr.length;
		int fixer=0;
		
		for(int i =0; i<n;i++) {
			for(int j =1; j<(n-i);j++) {
				if(arr[j-1]>arr[i]) {
					fixer = arr[j-1];
					arr[j-1]= arr[i];
					arr[i] = fixer;
				}
			}
			//System.out.println(arr[i]);
	
		}
	}
	
	

	public static void main(String[] args) {
		int [] arr = {5,4,3,7,2,21,23,4,5};
		
		System.out.println("Before Sorting");
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
			//System.out.println("");
		}
		System.out.println("");
		bubbleSortMethod(arr);
		
		System.out.println("After Sorting");
		
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
