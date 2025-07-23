package math;
import java.util.Scanner;

// LeetCode 191 - Number of 1 bits
// Given a positive integer n, write a function that returns the number of set bits in its binary representation
public class Number_of1bits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(hammingWeight(n));
	}
	
	public static int hammingWeight(int n) {
		int count=0;
		while(n!=0) {
			count+=(n & 1);
			n>>>=1;
		}
		return count;
	}

}
