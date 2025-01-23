package week1.day3;

public class Methods {
	
	//Method without arguments
	
	public void makeCall() {
		System.out.println("Make Call");
	}
	
	public void takePhotos() {
		System.out.println("Take HD Photos");
	}
	
	//Method with arguments
	
	public static boolean isPerfectSquare(int n) {
		int s = (int) Math.sqrt(n);
		return (s * s == n);
		
	}
	
	public void isFibonacciNumber(int a) {
		if(isPerfectSquare(5 * a * a + 4) || isPerfectSquare(5 * a * a - 4)) {
			System.out.println("Given number "+a+" is a fibonacci number.");
			
		}
		else {
			System.out.println("Given number "+a+" is not a fibonacci number.");
		}
	}

	public static void main(String[] args) {
		Methods fibonacci = new Methods();
		fibonacci.isFibonacciNumber(35);

	}

}
