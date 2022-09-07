package dev.rowand.assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestGap_Rowand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int stop = 0;
		ArrayList<Integer> list = new ArrayList<>();
		while(stop != 1) {
			System.out.println("Enter the next value of the array: ");
			int enter = scan.nextInt();
			list.add(enter);
			System.out.println("Continue? Enter 0 to do so.");
			stop = scan.nextInt();
		}
		//System.out.println(list);
		int max = 0;
		for(int x = 0; x < list.size()-1; x++) {
			int val = 0;
			//System.out.println(max + " is max");
			
			for(int y = x+1; y < list.size(); y++) {
				
				if(list.get(x) < 0 && list.get(y) < 0) { //if both array elements are negative
					val = Math.abs(list.get(x) - list.get(y));
					//System.out.println(val + " first");
				}
				else if(list.get(x) < 0) { //if x is negative
					val = list.get(y) - list.get(x);
					//System.out.println(val + " 2nd");
				}
				else if(list.get(y) < 0) { //if y is negative
					val = list.get(x) - list.get(y);
					//System.out.println(val + " 3rd");
				}
				else {
					if(list.get(x) > list.get(y)) { //if both are positive and x is bigger
						val = list.get(x) - list.get(y);
					//	System.out.println(val + " 4th");
					}
					else {
						val = list.get(y) - list.get(x); //if y is bigger instead
					//	System.out.println(val + " last");
					}
				}
				if(val > max) {
					max = val;
				}
				
			}
			
		}
		System.out.println(max);

	}
}
