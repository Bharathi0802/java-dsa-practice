package arrays;
import java.util.Arrays;
import java.util.Scanner;

// LeetCode 66 - Plus One
// Increment the large integer by one and return the resulting array of digits.
public class Plus_one {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine().replaceAll("[\\[\\]]","");
		String[] part = num.split(",");
		int n[] = new int[part.length];
		for(int i=0;i<part.length;i++) {
			n[i] = Integer.parseInt(part[i].trim());
		}
		System.out.println(Arrays.toString(plusOne(n)));
	}
	
	public static int[] plusOne(int[] digits) {
	    int n = digits.length;
	    for(int i=n-1;i>=0;i--){
           if(digits[i]<9){
	          digits[i]++;
	          return digits;
	        }
	        digits[i]=0;
	    }
	    int[] result=new int[n+1];
	    result[0]=1;
	    return result;
	}

}
