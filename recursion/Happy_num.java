package recursion;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// LeetCode 202 - Happy number
// Write an algorithm to determine if a number n is happy.
public class Happy_num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isHappy(n));
	}

	public static boolean isHappy(int n) {
		Set<Integer> num=new HashSet<>();
		while(n!=1 && !num.contains(n)) {
			num.add(n);
			n=sumOfSquares(n);
		}
		return n==1;
	}
	
	public static int sumOfSquares(int num) {
		int sum=0;
		while(num!=0) {
			int digit=num%10;
			sum+=digit*digit;
			num/=10;
		}
		return sum;
	}
}
