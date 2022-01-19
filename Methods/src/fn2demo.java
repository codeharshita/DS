//Calculating npr;
import java.util.*;
public class fn2demo {
	
	public static void display(int n, int r,int nfact) {
		System.out.println(n +"P"+ r +" "+ nfact);
	}
	
	
	//Function for factorial.
	public static int fact(int m) {
		int rv = 1;
		
		for(int i =1;i<=m;i++) {
			rv *=i;
		}
		
		return rv;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		int nFact = fact(n);
		int nmrFact=fact(n-r);
		
		int nfact=nFact/nmrFact;
		display(n,r, nfact);
		
		

	}

}
