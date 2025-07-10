package strings;
import java.util.Scanner;

// LeetCode 125 - Valid Palindrome
// Given a string s, return true if it is a palindrome, or false otherwise.
public class Valid_palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		boolean result = isPalindrome(s);
		System.out.println(result);
	}
	
	public static boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                str.append(Character.toLowerCase(c));
            }
        }
        String clean = str.toString();
        String reversed = str.reverse().toString();
        return clean.equals(reversed);

    }

}
