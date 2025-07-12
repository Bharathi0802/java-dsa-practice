package strings;
import java.util.Scanner;

// LeetCode 28 - Find the Index of the First Occurrence in a String
// Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
public class Index_firstString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String haystack = sc.nextLine();
		String needle = sc.nextLine();
		System.out.println(strStr(haystack, needle));
	}
	
	public static int strStr(String haystack, String needle) {
		return haystack.indexOf(needle);
	}

}
