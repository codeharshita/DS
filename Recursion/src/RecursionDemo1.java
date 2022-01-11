   // Recursive program for decreasing the numbers.//

import java.util.Scanner;
public class RecursionDemo1 {
	
	public static void print_number(int n) { //Calling recursive method
		
		if(n == 0) //Base condition or Base Case.
			return;
		
		System.out.println(n);
		print_number(n-1);//Recursive call
		
	}

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);//User Input using Scanner class
			System.out.println("Enter a single digit number");
			int n = sc.nextInt();
			
			System.out.println();
			
			System.out.println("The numbers are:");
	   print_number(n);

	}

}
