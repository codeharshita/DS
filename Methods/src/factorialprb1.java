//Calculate the value of nPr!

import java.util.*;
public class factorialprb1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		System.out.println("Enter the value of r");
		int r = sc.nextInt();
		
		int nfact=1;
		for(int i =1;i<=n;i++) {
			nfact = nfact*i;
		}
		int rfact=1;
		for(int i=1;i<=n-r;i++) {
			rfact=rfact*i;
		}
	int nprfact= nfact/rfact;
	System.out.println("The value of"+" "+n+"P"+r+" is"+" "+nprfact);

	}

}
