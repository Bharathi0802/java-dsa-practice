package math;
import java.util.Scanner;

// LeetCode 69 - Sqrt(x)
// Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
// You must not use any built-in exponent function or operator.
public class Sqrt_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(mySqrt(n));
	}
	
	public static int mySqrt(int x) {
        if (x < 2) return x;
        int l = 1, r = x / 2, ans = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long s = (long) mid * mid;
            if (s == x) {
                return mid;
            } else if (s < x) {
                ans=mid;
                l=mid+1;
            }else {
                r=mid-1;
            }
        }
        return ans;
    }
}
