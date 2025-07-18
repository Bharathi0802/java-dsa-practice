package strings;
import java.util.Scanner;
import java.util.HashMap;

// LeetCode 387 - First unique characcter in a string
// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1
public class First_uniqChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int res = firstUniqChar(s);
		System.out.println(res);
	}
	
	public static int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<>();
        for(char c:s.toCharArray()){
            count.put(c, count.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(count.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }

}
