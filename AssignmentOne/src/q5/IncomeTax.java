package q5;

import java.util.Scanner;

public class IncomeTax {

	public void Tax(long a) {
		float tax = 0;
		if(a<=180000) tax = 0;
		else if(a<=300000 && a>180001) tax = .01f;
		else if(a<=500000 && a>300001) tax = .02f;
		else if(a<=1000000 && a>500001) tax = .03f;
		
		System.out.println("The payable tax amount is : "+ (tax*a));
	}
	
	public static void main(String[] args) {
		IncomeTax i = new IncomeTax();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the salary");
		long sal = s.nextLong();
		i.Tax(sal);
	}
}
