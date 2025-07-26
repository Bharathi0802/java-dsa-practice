package recursion;
import java.util.Scanner;

// LeetCode 70 - Climbing Stairs
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
public class Climbing_stairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(climbStairs(n));
	}
	
	public static int climbStairs(int n) {
		if(n<=2)
			return n;
		int oneStepBefore=2;
		int twoStepBefore=1;
		int total=0;
		for(int i=3;i<=n;i++) {
			total=oneStepBefore+twoStepBefore;
			twoStepBefore=oneStepBefore;
			oneStepBefore=total;
		}
		return total;
	}

}
