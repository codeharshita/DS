//Print x^n .(Stack Height=log n )

import java.util.*;
public class Recursion3 {
	public static int PowCalc(int x, int n) {
		
		if(n == 0) {
			return 1;
		}if(x == 0) {
			return 0;
		}
		
		
		//if n is even
		if(n %2 == 0) {
			return PowCalc(x,n/2)* PowCalc(x,n/2);
		}else //n is odd
			return PowCalc(x,n/2)*PowCalc(x,n/2)*x; 
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x= sc.nextInt();
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		
		int res = PowCalc(x,n);
		System.out.println("The value of x to the power of n is"+ " "+ res);

	}

}

// As we have used the height of stack as log n, it is easily understood that we have reaches the optimized solution of the problem.
