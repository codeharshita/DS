package Arrays;
import java.util.*;

public class Transpose {

	public static void main(String[] args) {
		System.out.println("Print the number of rows and columns");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("PRINT THE MATRIX");
		int [][] mat = new int [a][b];
		
		for(int i = 0; i<a;i++) {
			for(int j =0;j<b;j++) {
			mat[i][j]= sc.nextInt();	
			}
		}
		
		int [][] transmat = new int [a] [b];
		
		for(int i = 0; i<b; i++) {
			for(int j = 0; j<a;j++) {
				transmat[j][i]=mat[i][j]; 
			}
		}
		
		//Printing the final matrix;
		for(int i = 0; i<a; i++) {
			for(int j = 0; j<b;j++) {
				System.out.println(transmat[i][j]);
				
			}
		
		
		
			System.out.println();
		}
		

	}

}
