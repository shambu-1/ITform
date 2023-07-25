package q3;

import java.util.Scanner;

public class SimpleAndCompoundInterest {

	
	public float SimpleInterest(long p) {
		float r = .05f;
		int t = 1;
		float si = (p*r*t);
		return si+p;
	}
	
	public float compoundInterest(long p) {
		float r = .05f;
		int t = 2;
		int n = 2;
		double A = p*Math.pow((1+(r/n)),n*t);
		float B = (float) A;
		
		return B;
	}
	
	public static void main(String[] args) {
		
		SimpleAndCompoundInterest sc = new SimpleAndCompoundInterest();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Principle amount");
		long p = s.nextLong();
		System.out.println("The simple interest final amount for 1 year time period is: "+sc.SimpleInterest(p));
		System.out.println("The compound interest final amount for 1 year time period is: "+sc.compoundInterest(p));
		
	}
}
