package strings;
import java.util.Scanner;

// LeetCode 14 - Longest Common Prefix
// Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "".
public class Longest_commonPrefix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().replaceAll("[\\[\\]\"]", "");
		String[] parts = str.split(",");
		for(int i=0;i<parts.length;i++) {
			parts[i]=parts[i].trim();
		}
		String res = longestCommonPrefix(parts);
		System.out.println(res);
	}
	
	public static String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0)
        return "";
        String pre=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(pre)!=0){
                pre=pre.substring(0,pre.length()-1);
                if(pre.isEmpty())
                return "";
            }
        }
        return pre;
    }

}
