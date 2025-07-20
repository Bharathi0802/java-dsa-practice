package strings;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

// LeetCode 205 - Isomorphic Strings
// Given two strings s and t, determine if they are isomorphic.
public class Isomorphic_strings {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		System.out.println(isIsomorphic(s, t));
	}

	public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        return false;
        Map<Character,Character> map = new HashMap<>();
        Set<Character> mapped = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if(map.containsKey(cs)){
                if(map.get(cs)!=ct)
                return false;
            }else{
                if(mapped.contains(ct))
                return false;
                map.put(cs,ct);
                mapped.add(ct);
            }
        }
        return true;
    }
}
