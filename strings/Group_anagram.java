package strings;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

// LeetCode 49 - Group Anagram
// Given an array of strings strs, group the anagrams together.
public class Group_anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of items in list: ");
		int n = sc.nextInt();
		sc.nextLine();
		String[] strs = new String[n];
		for(int i=0;i<n;i++) {
			strs[i]=sc.nextLine();
		}
		System.out.println(groupAnagrams(strs));
	}
	
	public static List<List<String>> groupAnagrams(String[] strs) {
	    if(strs==null || strs.length==0)
	    return new ArrayList<>();
	    HashMap<String,List<String>> map = new HashMap<>();
	    for(String s : strs){
	        char[] c = s.toCharArray();
	        Arrays.sort(c);
	        String key = new String(c);
	        map.computeIfAbsent(key,y->new ArrayList<>()).add(s);
	    }
	    return new ArrayList<>(map.values());
	}

}
