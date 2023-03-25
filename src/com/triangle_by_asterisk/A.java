package com.triangle_by_asterisk;
import java.util.Scanner;
public class A {
	public static void main(String args[]) {
		//Scanner class to take the user input for numbers of rows
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Rows :");
		
		//below code is for a triangle
		int num= scan.nextInt();
		for(int i=0;i<num;i++){
			for(int j=i;j<num;j++) {
				System.out.print("  ");
			}
			
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//below code is to print upside down triangle(remove below all code(line 26-38 ) except last two "}" to get a triangle)
		for(int i=0;i<=num;i++){
			for(int j=0;j<i;j++) {
				System.out.print("  ");
			}
			
			for(int j=i;j<=num;j++) {
				System.out.print("* ");
			}
			for(int j=i;j<num;j++) {
				System.out.print("* ");
			}
			System.out.println();
	}

	}
}