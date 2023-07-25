package q7And8;

import java.util.Scanner;

public class SearchArray {

	static boolean search(int number, int[] Array) {
		for(int i = 0; i<Array.length ; i++)
			if(Array[i] == number)
				return true;
		
		return false;
	}
	
	static void sort(int [] Array) {
		int temp = 0;
		for(int i = 0;i<Array.length;i++)
			for(int j = i+1;j<Array.length;j++)
				if(Array[i]>Array[j]) {
					temp = Array[j];
					Array[j] = Array[i];
					Array[i] = temp;
				}
		for(int x: Array)
			System.out.print(x+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int [] Array = new int[3];
		System.out.println("Enter Array");
		for(int i = 0;i<Array.length;i++)
			Array[i] = s.nextInt();
		System.out.println("Enter number");
		int number = s.nextInt();
		System.out.println(search(number, Array));
		sort(Array);
		
		s.close();
	}

}
