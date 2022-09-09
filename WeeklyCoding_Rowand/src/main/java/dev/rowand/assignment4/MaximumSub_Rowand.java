package dev.rowand.assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSub_Rowand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the max size of the array:");
		int size = scan.nextInt();
		int[] arry = new int[size];
		for(int x = 0; x < size; x++) {
			System.out.println("Enter a integer for element " + (x+1) + ":");
			arry[x] = scan.nextInt();
			
		}
		int max = 0;
		for(int y = 0; y < size; y++) {
			int holder = 0;
			for(int z = y+1; z < size; z++) {
				int[] b = Arrays.copyOfRange(arry, y, z+1);
				//System.out.println(Arrays.toString(b));
				for(int n = 0; n < b.length; n++) {
					holder = holder + b[n];
					//System.out.println(b[n] + " is b[n]");
					//System.out.println(holder);
				}
				if(holder > max) {
					max = holder;
					holder = 0;
				}
				else {
					holder = 0;
				}
			}
		}
		System.out.println(max);
		

	}

}
