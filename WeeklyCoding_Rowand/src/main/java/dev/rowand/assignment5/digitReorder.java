package dev.rowand.assignment5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class digitReorder {
	public static int[] reorderDigits(int[] A, String order) {
		for(int x = 0; x < A.length; x++) {
			if(A[x] >= 10) { //make sure the element is equal to or bigger then 10
				String numword = Integer.toString(A[x]);
				int[] numhold = new int[numword.length()-1];
				for(int y = 0; y < numword.length(); y++) {
					String digit = String.valueOf(numword.charAt(y));
					numhold[y] = Integer.parseInt(digit);
				}
				if(order.equals("asc")) {
					Arrays.sort(numhold);
				}
				else if (order.equals("desc")) {
					Arrays.sort(numhold);
					Collections.reverse(Arrays.asList(numhold));
				}
				StringBuilder num = new StringBuilder();
				for(int a = 0; a < numhold.length; a++) {
					num.append(String.valueOf(numhold[a]));
				}
				A[x] = Integer.parseInt(num.toString());
			}
		}
		
		return A;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = scan.nextInt();
		int[] array = new int[size];
		for(int x = 0; x < size; x++) {
			System.out.println("Enter a number: ");
			int num = scan.nextInt();
			array[x] = num;
		}
		System.out.println("Do you want the digets to be ordered in asc or desc order? (enter either asc or desc) ");
		String sort = scan.next();
		reorderDigits(array, sort);
		System.out.println(array);
		
	}

}
