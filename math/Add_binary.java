package math;
import java.util.Scanner;

// LeetCode 67 - Add Binary
// Given two binary strings a and b, return their sum as a binary string.
public class Add_binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		System.out.println(addBinary(a, b));
	}
	
	public static String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i=a.length()-1, j=b.length()-1, c=0;
        while(i>=0 || j>=0 || c>0){
            int sum=c;
            if(i>=0)
            sum+=a.charAt(i--)-'0';
            if(j>=0)
            sum+=b.charAt(j--)-'0';
            res.append(sum%2);
            c=sum/2;
        }
        return res.reverse().toString();
    }

}
