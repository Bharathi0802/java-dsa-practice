package strings;
import java.util.Scanner;

// LeetCode 12 - Integer to Roman
// Given an integer, convert it to a Roman numeral.
public class Int_toRoman {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0 || n>3999)
			System.out.println("Invalid");
		else {
			String result = intToRoman(n);
			System.out.println(result);
		}
	}
	
	public static String intToRoman(int num) {
        int[] values =    {1000, 900, 500, 400, 100, 90,  50, 40, 10, 9,   5, 4, 1};
        String[] numerals = {"M", "CM","D", "CD","C", "XC","L","XL","X","IX","V","IV","I"};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length && num > 0; i++) {
            while (num >= values[i]) {
                result.append(numerals[i]);
                num -= values[i];
            }
        }

        return result.toString();
    }

}
