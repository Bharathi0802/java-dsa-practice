package recursion;
import java.util.Scanner;

// LeetCode 509 - Fibonacci number
// Given n, calculate F(n).
public class Fibonacci_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fib(n));
	}
	
	public static int fib(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fib(n-1)+fib(n-2);
	}

}
