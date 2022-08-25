package dev.rowand.assignment3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Rowand_MergedSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array of linked lists.");
		int len = scan.nextInt();
		LinkedList[] list = new LinkedList[len];
		for(int x = 0; x < len; x++) {
			list[x] = new LinkedList();
			System.out.println("Enter another value for linked list " + (x+1) + ". Enter -1 to stop.");
			int input = scan.nextInt();
			while(input != -1) {
				list[x].add(input);
				System.out.println("Enter another value for linked list " + (x+1) + ". Enter -1 to stop.");
				input = scan.nextInt();
			}
			Collections.sort(list[x]);
		}
		
		
		
	}

}
