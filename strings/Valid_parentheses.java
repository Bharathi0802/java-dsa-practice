package strings;
import java.util.Scanner;
import java.util.Stack;

// LeetCode 20 - Valid Parentheses
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
public class Valid_parentheses {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(isValid(s));
	}
	
	public static boolean isValid(String s) {
        Stack<Character> c=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='[')
            c.push(ch);
            else{
                if(c.isEmpty())
                return false;
                char top=c.pop();
                if((ch==')' && top!='(') || (ch=='}' && top!='{') || (ch==']' && top!='['))
                return false;
            }
        }
        return c.isEmpty();
    }
}
