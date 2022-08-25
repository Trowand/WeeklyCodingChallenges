package dev.rowand.assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Rowand_MedianSortCode {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of sorted array m.");
		int m = scan.nextInt();
		System.out.println("Enter the length of sorted array n.");
		int n = scan.nextInt();
		double[] mArr = new double[m];
		double[] nArr = new double[n];
		
		for(int x = 0; x < m; x++) {
			System.out.println("Enter a value for the sorted m array.");
			double stor = scan.nextDouble();
			mArr[x] = stor;
		}
for(int x = 0; x < n; x++) {
	System.out.println("Enter a vlaue for the sorted n array.");
	double stor = scan.nextDouble();
	nArr[x] = stor;
	
		}
int comb = n + m;
double[] fincopy = new double[comb];
System.arraycopy(mArr, 0, fincopy, 0, mArr.length);
System.arraycopy(nArr, 0, fincopy, mArr.length, nArr.length);
boolean end = false;

Arrays.sort(fincopy);

double med;

if(comb % 2 == 1) {
	med = fincopy[fincopy.length / 2];
}
else {
	int otherMid = (fincopy.length / 2) - 1;
	double midSum = fincopy[fincopy.length / 2] + fincopy[otherMid];
	med = midSum / 2;
}

System.out.println("The sorted median is: " + med);


	}
}
