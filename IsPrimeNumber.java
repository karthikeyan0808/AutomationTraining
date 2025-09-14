package homeAssignments.week1;

public class IsPrimeNumber {

	public static void main(String[] args) {

		int n=11;
		
		if (n<=1) {
			
			System.out.println("The number is not a prime"); }
		
		else {
			
			for (int i = 5; i < n; i++) {
				
				if(n % i == 0);{
				
				System.out.println("The number is not a prime");
				
				}
			}
			
		}
		
	}
		
}	
					
				
			
