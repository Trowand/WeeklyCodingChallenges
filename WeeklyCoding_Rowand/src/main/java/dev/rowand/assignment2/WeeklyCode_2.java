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
		 
		 String[] Mnames = new String[testCase]; //storage for male names
		 
		 String[] Wnames = new String[testCase]; //storage for woman names
		 
		 
		 for(int x = 0; x < testCase; x++) {
			 String input = scan.next();
			 String[] stor = input.split(","); //couldn't get split with " " working, so used "," instead
			
			 Mnames[x] = stor[0];
			 Wnames[x] = stor[1];
		 }
		 for(int y = 0; y < testCase; y++) {

			 List<Character> chars = new ArrayList<>(); //list that will be compared with the smaller name
			 if(Mnames[y].length() > Wnames[y].length()) { //if Mname is better then Wname
				 for(int a = 0; a > Mnames[y].length(); a++) {
					 String hold = String.valueOf(Mnames[y].charAt(a)); //convert char to string
					 if(Wnames[y].contains(hold)) { //for comparison to work
						 String mn = chars.toString(); //make string out of char list
						 String check = String.valueOf(Mnames[y].charAt(a)); //convert curr char into string for contains
						 if(!mn.contains(check)) { //if mn doesn't already have check in it
							 chars.add(Mnames[y].charAt(a)); //add check to the chars list
						 }
						 
					 }
				 }
				 StringBuilder charcon = new StringBuilder(); //stores converted format from [a, b, c, d, etc.] to abcd
				 for(int l = 0; l < chars.size(); l++) {
					 charcon.append(chars.get(l));
				 }
				 if(Wnames[y].contains(charcon)) { //if current Wname equals charcon
					 
					 System.out.println("YES"); //we have a match!
				 }
				 else {
					 System.out.println("NO"); //we don't have a match in the pattern
				 }
				 
				 
			 }
			 else if (Mnames[y].length() < Wnames[y].length()) { //if Wname is bigger then Mname
				 for(int a = 0; a < Wnames[y].length(); a++) {
					 String hold = String.valueOf(Wnames[y].charAt(a));
					 if(Mnames[y].contains(hold)) {
						 String mn = chars.toString();
						 String check = String.valueOf(Wnames[y].charAt(a));
						 if(!mn.contains(check)) {
						 chars.add(Wnames[y].charAt(a));
						 }
					 }
				 }
				 StringBuilder charcon = new StringBuilder();
				 for(int l = 0; l < chars.size(); l++) {
					 charcon.append(chars.get(l));
				 }
				 if(Mnames[y].contains(charcon)) {
					 System.out.println("YES");
				 }
				 else {
					 System.out.println("NO");
				 }
			 }
			 else {
				 if(Wnames[y].equals(Mnames[y])) {
					 System.out.println("YES");
				 }
				 else {
					 System.out.println("NO");
				 }
			 }
		 }

		 

	}

}
