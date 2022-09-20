package dev.rowand.assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		String[] holder = new String[count];
		for(int x = 0; x < count; x++) {
			holder[x] = scan.nextLine();
		}
		for(int y = 0; y < holder.length; y++) {
			int[] triple = new int[3];
			String[] strtri = holder[y].split(" ");
			System.out.println(Arrays.toString(strtri));
			triple[0] = Integer.valueOf(strtri[0]);
			triple[1] = Integer.valueOf(strtri[1]);
			triple[2] = Integer.valueOf(strtri[2]);
			int max = 0;
			int min = 0;
			for(int z = 0; z < triple.length; z++) {
			if(triple[z] > max) {
				max = triple[z];
			}
			else if (triple[z] < min) {
				min = triple[z];
			}
			for(int a = 0; a < triple.length; a++) {
				if(triple[z] != max && triple[z] != min) {
					System.out.println(triple[z]);
				}
			}
			
			}
		}
	}

}
