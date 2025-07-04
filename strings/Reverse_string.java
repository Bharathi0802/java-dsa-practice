package strings;
import java.util.Scanner;

//✅ Reverse String - LeetCode 344
//Write a function that reverses a string. The input string is given as a char array s.
public class Reverse_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();
		str = str.substring(1, str.length() - 1);
	    String[] parts = str.split("\",\"");
	    
	    parts[0] = parts[0].replace("\"", "");
        parts[parts.length - 1] = parts[parts.length - 1].replace("\"", "");
        
        char[] s = new char[parts.length];
        for (int i = 0; i < parts.length; i++) {
            s[i] = parts[i].charAt(0);
        }
        
		reverseString(s);
		System.out.print("[");
		for (int i = 0; i < s.length; i++) {
            System.out.print("\"" + s[i] + "\"");
            if (i != s.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
	}
	
	public static void reverseString(char[] s) {
        int l=0, r=s.length-1;
        while(l<r){
            char temp=s[l];
            s[l++]=s[r];
            s[r--]=temp;
        }
    }
}
