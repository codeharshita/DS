// Print Sum of first n natural numbers using recursion.
public class NaturalSum {
	public static void printNum(int i, int n, int sum ) {
		if(i==n) {
			
			sum+=i;
			System.out.println(sum);
			
			return;
		}
		
		sum= sum+i;//sum+=i;
		printNum(i+1, n, sum);
		
		
	} 
	 
	
	

	public static void main(String[] args) {
		printNum(1, 5, 0);

	}

}
