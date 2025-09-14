package homeAssignments.week1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// input(range): 8
		int n = 8;

		int a = 0, b = 1;

		System.out.println("The Fibonacci Serires:" + a + " " + b);

		for (int i = 2; i < n; i++) {
			
			// Creating a variable to assign the next set
			int next = a + b;

			System.out.println("The next Fibonacci Series:" + next);

			a = b;
			b = next;

		}

	}

}
