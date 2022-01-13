//Print factorial of number using recursion.
import java.util.*;
public class Factorial {
	public static int factCalc(int n){
			
		if(n ==1 || n ==0) { //Base Case
			return 1;
		}
		
		int fact_num = factCalc(n-1);//Recursive call
		int fact = n*fact_num;
		return fact;
		
		
	}
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);//String user input.
	  System.out.println("Enter any number to get it's factorial");
	  int n = sc.nextInt();
	  int result=factCalc(n);
	  System.out.println(result);
	  
	  
	  
	}

}
