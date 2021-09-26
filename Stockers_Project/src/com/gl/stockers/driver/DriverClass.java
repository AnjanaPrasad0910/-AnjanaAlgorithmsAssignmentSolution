package com.gl.stockers.driver;
import java.util.*;
import com.gl.stockers.service.*;
public class DriverClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of companies : ");
		int N = sc.nextInt();
		int noOfHikes =0, noOfLows =0;
		double[] stockPrice = new double[N];
		
		for(int i=0;i<N;i++) {
			System.out.println("Enter current stock price of the company "+(i+1));
			stockPrice[i]=sc.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			boolean priceHike = sc.nextBoolean();
			if(priceHike==true) {
				noOfHikes++;
			}
			else {
				noOfLows++;
			}
		}
		System.out.println("\n");
		MergeSort mg = new MergeSort();
		mg.sort(stockPrice, 0, N-1);
		
		int option ;
		do {
			System.out.println("--------------------");
			System.out.println("Enter the option that you want to perform :");
			System.out.println("1. Display the companies stock prices in ascending order");
			System.out.println("2. Display the companies stock prices in descending order");
			System.out.println("3. Display the total no of companies for which stock prices rose today");
			System.out.println("4. Display the total no of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("6. Press 0 to exit");
			System.out.println("--------------------");
			
			option = sc.nextInt();
			OperationClass oc = new OperationClass();
			if(option<=5 || option>=0) {
			switch(option) {
			case 0:
				option = 0;
				break;
			case 1:
				oc.ascendingPrint(stockPrice, N);;
			break;
			case 2:
				oc.descendingPrint(stockPrice, N);;
			break;
			case 3:
				System.out.println("Total no of companies whose stock price rose today : "+noOfHikes+"\n");					
			break;
			case 4:
				System.out.println("Total no of companies whose stock price  declined today : "+noOfLows+"\n");					
			break;
			case 5:
				oc.findSpecificStock(stockPrice, N);;					
			break;
			}
			
		}
			else {
				System.out.println("Invalid option");
			}
	}
		while(option!=0);
		System.out.println("Exited Successfully");
			
		sc.close();

	}

}
