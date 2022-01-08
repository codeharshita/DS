package Arrays;
import java.util.*;

//The upper triangular part of the matrix is being printed.
public class DiagonalTraverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [][] arr = new int[n][n];
		
		for(int i =0; i< arr.length;i++) {
			for(int j = 0 ;j<arr[0].length;j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		
		for(int g = 0;g<arr.length;g++) { // G is the gap between two numbers 
			for(int i = 0, j=g; j<arr.length; i++,j++) {
				System.out.println(arr[i][j]);
			}
		}

	}

}
