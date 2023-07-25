package q4;

import java.util.Scanner;

public class PassOrFail {
	
	public void check(int[] a , int n) {
		
		int count = 0;
		
		for(int x : a) {
			if(x<60) count ++;
		}
		if(n-count <= 1) System.out.println("Failed");
		else if(n - count == 2) System.out.println("Promoted");
		else System.out.println("Passed");
	}

	public static void main(String[] args) {
		PassOrFail q = new PassOrFail();
		Scanner s = new Scanner(System.in);
		
		int n =3;
		int [] a = new int[n];
		for(int i =0; i<n;i++) {
			System.out.println("Enter the mark of subject "+ (i+1));
			a[i] = s.nextInt();
		}
		q.check(a, n);
		
		

	}

}
