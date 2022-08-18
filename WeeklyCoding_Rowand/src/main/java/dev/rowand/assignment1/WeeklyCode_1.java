package dev.rowand.assignment1;
import java.util.*;

public class WeeklyCode_1 {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("number of test cases: ");
		 int testCase = scan.nextInt();
		 
		 List<Integer> cases = new ArrayList<>();
		 cases.add(0); //first part of cases in (0,0) (N+1)

		 
		 for(int x = 1; x < testCase + 1; x++) { //create arraylist of int testCase size (besides (0,0))
			 System.out.println("test case #" + x + ": ");
			 cases.add(scan.nextInt());

		 }
		 int counter = 0;
		 int curr = 0;
		 int size = cases.size();
		 
		 
		 for(int x = 0; x <= size; x++) { //go through the list for however long it is
			 
			 if(x == 0 || x % 2 == 0) { //rightmost (biggest numbers)
				 int largeCount = 0;
				 for(int y = 0; y < cases.size(); y++) {
					 int large = 0;
					 if(Math.abs(curr - cases.get(y)) > large) { //the the distance between the current position and the value is bigger then
						 //what we have...
						 large = Math.abs(curr - cases.get(y)); //declare it as the new "largest" (rightmost) element
						 largeCount = y; //set the index for the largest value to the current y value
					 }
					 
				 }
				 counter += Math.abs(curr - cases.get(largeCount)); //total distance adds the new distance to itself
				 curr = cases.get(largeCount); //curr position = rightmost index
				 
				 if(cases.get(largeCount) != 0) { //if we're not at (0,0)
					 System.out.println(counter); //then we're at a testcase, so print out the current distance
					 cases.remove(largeCount); //and remove the testcase so we can find the next largest testcase later.
					 size--; //decrease the size value to prevent errors
				 }
				 
				 
				 
			 }
			 else { //leftmost
				 int smallCount = 0; //similar methodology to the rightmost calculations
				 for(int y = 0; y < cases.size(); y++) {
					 int small = 0;
					 if(Math.abs(curr - cases.get(y)) < small) {
						 small = Math.abs(curr - cases.get(y));
						 smallCount = y;
					 }
					 
				 }
				 counter += Math.abs(curr - cases.get(smallCount)); 
				 
				 curr = cases.get(smallCount);
				 
				 if(cases.get(smallCount) != 0) {
					 System.out.println(counter);
					 cases.remove(smallCount);
					 size--;
				 }
			 }
		 }
		 
	//	System.out.println(counter);
		
	}
}
