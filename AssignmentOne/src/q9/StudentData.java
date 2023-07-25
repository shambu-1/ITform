package q9;

import java.util.Scanner;

public class StudentData {
	
	static String[] sub = {"Physics", "Chemistry", "Maths" }; 

	
	static int total(int [] X) {
		int total = 0;
		for(int x : X)
			total += x;
		
		return total;
	}
	static void averagePerStudent(int [] X) {
		System.out.println("Average is " + (total(X)/X.length));
	}
	
	static void totalAndAveragePerSub(int [] X, int [] Y, int [] Z) {
		int [] ArrayMark = new int[3];
		for(int i= 0;i<ArrayMark.length;i++) {
			ArrayMark[i] = X[i]+Y[i]+Z[i];
			System.out.println("Total Mark of "+sub[i]+" is "+ ArrayMark[i]);
			System.out.println("Average of subject "+ sub[i]+" is " + (ArrayMark[i]/3));
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int[]  A = {15, 20 , 30};
//		int[]  B = {15, 20 , 30};
//		int[]  C = {15, 20 , 30};
		
		
		int[]  A = new int[3];
		int[]  B = new int[3];
		int[]  C = new int[3];
		for(int i=0;i<3;i++) {
			System.out.println("Enter the mark of"+sub[i]+" of students A, B, C respectively.");
			A[i] = s.nextInt();
			B[i] = s.nextInt();
			C[i] = s.nextInt();
		}
		System.out.println("Total of student C is " + total(C));
		averagePerStudent(C);
		totalAndAveragePerSub(A, B, C);
		s.close();
		
		
	}
}
