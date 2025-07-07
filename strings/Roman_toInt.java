package strings;
import java.util.HashMap;
import java.util.Scanner;

// LeetCode 13 - Roman to Integer
// Given a roman numeral, convert it to an integer.
public class Roman_toInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toUpperCase();
		System.out.println(romanToInt(str));
	}
	
	public static int romanToInt(String s) {
		HashMap<Character,Integer> roman = new HashMap<>();
		roman.put('I',1);
	    roman.put('V',5);
	    roman.put('X',10);
	    roman.put('L',50);
	    roman.put('C',100);
	    roman.put('D',500);
	    roman.put('M',1000);

	    int total=0;
	    int pvalue=0;
	    for(int i=s.length()-1;i>=0;i--){
	        int cvalue=roman.get(s.charAt(i));
	        if(cvalue<pvalue)
	        total-=cvalue;
	        else
	        total+=cvalue;
	        pvalue=cvalue;
	    }
	    return total;
	}
}
