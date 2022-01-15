import java.util.Scanner;
public class PowRec2 {	
	public static int CalcPow(int x,int n) { //Recursive Function
		if(n==0) { // Base Case 1
			return 1;
		}
		if(x==0) {  //Base Case 2
			return 0;
		}
		
		int xPown1 = CalcPow(x,n-1); // Recursive call
		int xpow= x*xPown1;
		return xpow;
		
		
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x= sc.nextInt();
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		
		int res = CalcPow(x,n);
		System.out.println("The value of x to the power of n is"+ " "+ res);
		
	}

}
