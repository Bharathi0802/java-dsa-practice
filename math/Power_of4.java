package math;
import java.util.Scanner;

// LeetCode 342 - Power Of Four
// Given an integer n, return true if it is a power of four. Otherwise, return false.
public class Power_of4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isPowerOfFour(n));
	}
	
	public static boolean isPowerOfFour(int n) {
        if(n<=0)
        return false;
        return (n & (n-1))==0 && (n-1)%3==0;
    }

}
