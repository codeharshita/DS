package datastruct;
import java.util.*;


public class EndOfMatrix {

	public static void main(String[] args) throws Exception {
		
		
		
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int m = sc.nextInt();
		
		int [][] arr = new int[n][m];
		
		for(int i = 0; i<arr.length; i++) {           //rows = arr.length
			for (int j = 0; j<arr[0].length; j++) {      //cols = arr[0].length
				arr [i][j] = sc.nextInt();
			}
		}
		
		int dir =0;
		int i=0;
		int j=0;
		
		while(true) {
			
			dir = (dir+arr[i][j])%4; //total 4 directions
			
			
			if(dir == 0) { //East
				j++;
			}else if(dir == 1) { //South
				i++;
			}else if (dir == 2) { // West
				j--;
			}else if(dir == 3) {  //North
				i--;
			}
			
			
			//For breaking the maze.
			
			if(i<0) {
				i++;
				break;
			}else if(j<0) {
				j++;
				break;
			}else if(i==arr.length) {
				i--;
				break;
			}else if (j == arr[0].length) {
				j--;
				break;
			}
			
			
		}
		
		System.out.println(i);
		System.out.println(j);
		
	}

}
