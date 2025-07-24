package math;
import java.util.Scanner;

// LeetCode 231 - Power of Two
// Given an integer n, return true if it is a power of two. Otherwise, return false.
public class Power_of2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println(isPowerTwo(n));
	}
	
	public static boolean isPowerTwo(int n) {
		if(n<=0)
			return false;
		return (n &(n-1))==0;
	}

}
