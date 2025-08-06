package arrays;
import java.util.Scanner;

// LeetCode 9 - Palindrome Number
// Given an integer x, return true if x is a palindrome, and false otherwise.
public class Palindrome_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println(isPalindrome(n));
	}
	
	public static boolean isPalindrome(int x) {
        if(x<0 || (x%10==0 && x!=0))
        return false;
        int digit=0;
        while(x>digit){
            digit=digit*10 + x%10;
            x/=10;
        }
        return x==digit || x==digit/10;
    }

}
