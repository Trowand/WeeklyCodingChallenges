package dev.rowand.assignment6;

import java.util.Scanner;

public class StringDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		String[] holder = new String[count];
		for(int x = 0; x < count; x++) {
			holder[x] = scan.next();
		}
		for(int y = 0; y < count; y++) {
			int digits = 0;
			for(int z = 0; z < holder[y].length(); z++) {
				if(holder[y].charAt(z) >= 49 && holder[y].charAt(z) <= 57) {
					digits = digits + Character.getNumericValue(holder[y].charAt(z));
				}
			}
			System.out.println(digits);
		}
;	}

}
