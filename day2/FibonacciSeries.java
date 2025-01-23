package week1.day2;

public class FibonacciSeries {
	public static boolean isPerfectSquare(int n) {
		int s = (int) Math.sqrt(n);
		return (s * s == n);
		
	}

	public static void main(String[] args) {
		for(int i = 0; i<= 10; i++) {
			if(isPerfectSquare(5 * i * i + 4) || isPerfectSquare(5 * i * i - 4)) {
				System.out.println("Fibonacci Numbers are:" + i);
				
			}
		}

	}

}
