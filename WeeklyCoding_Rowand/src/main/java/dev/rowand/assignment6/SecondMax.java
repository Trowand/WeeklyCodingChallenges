package dev.rowand.assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		String[] holder = new String[count+1];
		for(int x = 0; x < count+1; x++) {
			if(x != count+1) {
				holder[x] = scan.nextLine();
				System.out.println(holder[x]);
				System.out.println(x);
			}
			
		}
		for(int y = 1; y < holder.length; y++) {
			int[] triple = new int[3];
			String hold = holder[y];
			//System.out.println(hold);
			String[] strtri = hold.split(" ");
		//	System.out.println(Arrays.toString(strtri));
			triple[0] = Integer.valueOf(strtri[0]);
			triple[1] = Integer.valueOf(strtri[1]);
			triple[2] = Integer.valueOf(strtri[2]);
			int max = 0;
			int min = 10001;
			for(int z = 0; z < triple.length; z++) {
			if(triple[z] > max) {
				max = triple[z];
			}
			if (triple[z] < min) {
				min = triple[z];
			}
			}
			System.out.println(max + " is the max");
			System.out.println(min + " is the min");
			for(int a = 0; a < triple.length; a++) {
				if(triple[a] != max && triple[a] != min) {
					System.out.println(triple[a] + " is the 2nd highest");
				}
			}
			
			
		}
	}

}
