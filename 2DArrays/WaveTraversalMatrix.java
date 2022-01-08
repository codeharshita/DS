package datastruct;
import java.io.*;
import java.util.*;

public class WaveTraversalMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols= sc.nextInt();
		
		int [] [] a = new int [rows] [cols];
		
		for(int i = 0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				a[i] [j] = sc.nextInt();
			}
		}
		//Traversal Display.
		for(int j = 0;j<cols;j++) {
			if( j % 2 == 0) {
				for(int i=0; i<rows;i++) {
					System.out.println(a[i][j]);
				}
			}else {
				for(int i=rows;i>=0-1;i--) {
					System.out.println(a[i][j]);
				}
			}
		}
		
                                        
	}

}
