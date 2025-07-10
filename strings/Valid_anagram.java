package strings;
import java.util.Scanner;
	
// LeetCode 242 - Valid Anagram
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
public class Valid_anagram {

	public static void main(String args[]) {
		 Scanner scanner = new Scanner(System.in);
	     String s = scanner.nextLine().toLowerCase();
	     String t = scanner.nextLine().toLowerCase();

	        boolean result = isAnagram(s, t);
	        System.out.println(result);
	}
	
	public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] counts = new int[26];
        for(int i=0;i<s.length();i++){
            counts[s.charAt(i)-'a']++;
            counts[t.charAt(i)-'a']--;
        }
        for(int count : counts){
            if(count!=0)
            return false;
        }
        return true;
    }
}
