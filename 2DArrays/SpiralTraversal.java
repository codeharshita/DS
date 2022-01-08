package datastruct;
import java.util.*;

public class SpiralTraversal {

	public static void main(String[] args) throws Exception {
		//User Input
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int [][] a = new int[rows][cols];  //2D Array/Matrix initialization
		
		for(int i = 0; i<a.length;i++) {  //a.length can also be written as rows
			for(int j = 0;j<a[0].length;j++) { //a[0].length can also be written as columns.
				a[i][j]= sc.nextInt();
				
			}
		}
		
		int minr = 0;
		int minc =0;
		int maxr = a.length-1;
		int maxc = a[0].length-1;
		int tne = rows*cols;
		int cnbt =0;
		
		//when tne > cnbt(count) then the loop will stop!
		while (cnbt<tne) { //loop continues
			//Left wall
			for (  int i = minr,  j = minc;  i<=maxr && cnbt<tne ; i++ ) {
				System.out.println(a[i][j]);
				cnbt++;  //To count the number of spirals it forming.
			}
			minc++;// To avoid the repetition of the same element.
			 
			
			
			
			//bottom wall
			
			                  //j starts from here so before insertion comma to where it stops.
			for (int i = maxr, j=minc; j<= maxc && cnbt<tne  ; j++) {//i is fixed only j changes or varies.
				System.out.println(a[i][j]);
				cnbt++;
			}
			maxr--;
			
			
			
			//right wall
			
			for(int j =maxc, i=maxr;i>=minr && cnbt<tne ;i--) { // element going upward so negative of i.
				System.out.println(a[i][j]);
				cnbt++;
			}
			
			maxc--;
			
			//top wall2
			
			for(int i = minr , j =maxc; j>=minc && cnbt<tne ;j--) {
				System.out.println(a[i][j]);
				cnbt++;
			}
			
			minr++;
			
		}

	}

}
