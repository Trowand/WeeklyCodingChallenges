package dev.rowand.assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeeklyCode_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("number of test cases: ");
		 int testCase = scan.nextInt();
		 
		 String[] Mnames = new String[testCase];
		 
		 String[] Wnames = new String[testCase];
		 
		 
		 for(int x = 0; x < Mnames.length; x++) {
			 String input = scan.next();
			 String[] stor = input.split(" ");
			 Mnames[x] = stor[0];
			 Wnames[x] = stor[1];
		 }
		 for(int x = 0; x < Mnames.length; x++) {
			 List<Character> chars = new ArrayList<>();
			 if(Mnames[x].length() == Wnames[x].length()) {
				 
			 }
			 else {
				 for(int y = 0; y < Wnames[x].length(); y++) {
					 if(chars.size() == Mnames[x].length()) {
						 break;
					 }
					 else {
						 CharSequence check = Wnames[x].subSequence(y, y);
						 if(Mnames[x].contains(check)) {
							 chars.add()
						 }
					 }
				 }
			 }
		 }
		 

	}

}
