package strings;
import java.util.Scanner;

// LeetCode 38 - Count and Say
// Given a positive integer n, return the nth element of the count-and-say sequence.
public class Count_andSay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(countAndSay(n));
	}
	
	public static String countAndSay(int n) {
        if(n<=0)
        return "";
        String result = "1";
        for(int i=2;i<=n;i++){
            result=getNext(result);
        }
        return result;
    }
    private static String getNext(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char curr = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == curr) {
                count++;
            } else {
                sb.append(count).append(curr);
                curr = s.charAt(i);
                count = 1;
            }
        }
        sb.append(count).append(curr);
        return sb.toString();
    }

}
