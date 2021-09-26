package com.gl.stockers.service;
import java.util.*;
import com.gl.stockers.service.*;
public class OperationClass {
	public void ascendingPrint(double[] stockPrice, int N) {
		System.out.println("Stock prices in ascending order are :");
		for(int i=0;i<N;i++) {
			System.out.print(stockPrice[i]+" ");
		}
		System.out.println("\n");
	}
	
	public void descendingPrint(double[] stockPrice, int N) {
		System.out.println("Stock prices in descending order are :");
		for(int i=N-1;i>=0;i--) {
			System.out.print(stockPrice[i]+" ");
		}
		System.out.println("\n");
	}
	
	public void findSpecificStock(double[] stockPrice, int N) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key value :");
		double value = sc.nextDouble();
		BinarySearch bs = new BinarySearch();
		double res = bs.binarySearch(stockPrice, 0, N-1, value);
		if (res == 0)
			System.out.println("Element not present");
		else
		  System.out.println("Stock of value "+res+" is present\n");
	
	}

}
