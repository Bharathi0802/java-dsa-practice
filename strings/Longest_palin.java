package strings;
import java.util.Scanner;

// LeetCode 5 - Longest Palindromic Substring
// Given a string s, return the longest palindromic substring in s.
public class Longest_palin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(longestPalin(s));
	}
	
	public static String longestPalin(String s) {
		if(s==null || s.length()<1)
			return "";
		int start =0, end=0;
		for(int i=0;i<s.length();i++) {
			int len1 = compare(s,i,i);
			int len2 = compare(s,i,i+1);
			int len = Math.max(len1, len2);
			if(len>end-start) {
				start=i-(len-1)/2;
				end=i+len/2;
			}
		}
		return s.substring(start,end+1);
	}
	
	public static int compare(String s, int left, int right) {
		while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
			left--;
			right++;
		}
		return right-left-1;
	}

}
