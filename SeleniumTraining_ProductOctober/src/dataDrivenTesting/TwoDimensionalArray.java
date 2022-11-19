package dataDrivenTesting;

import java.util.Scanner;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row count");
		int row_count=sc.nextInt();
		System.out.println("Enter column count");
		int col_count=sc.nextInt();
		String arr[][]=new String[row_count][col_count];
		System.out.println("Enter array values");
		//row for loop
		for(int i=0;i<row_count;i++) {
			//col for loop
			for(int j=0;j<col_count;j++) {
				arr[i][j]=sc.next();
			}
		}
		for(int i=0;i<row_count;i++) {
			//col for loop
			for(int j=0;j<col_count;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
