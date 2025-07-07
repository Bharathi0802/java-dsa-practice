package arrays;
import java.util.Scanner;

// LeetCode 283 - Move Zeroes
// Move all 0's to the end of array while maintaining the relative order of the non-zero elements, without making a copy of array.
public class Move_zeroes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().replaceAll("[\\[\\]]","");
		String[] parts = str.split(",");
		
		int n[] = new int[parts.length];
		for(int i=0;i<parts.length;i++) {
			n[i] = Integer.parseInt(parts[i].trim());
		}
		moveZeroes(n);
		System.out.print("[");
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]);
			if(i<n.length-1)
				System.out.print(",");
		}
		System.out.print("]");
	}

	public static void moveZeroes(int[] nums) {
		int p=0;
		for(int num:nums) {
			if(num!=0)
				nums[p++]=num;
		}
		while(p<nums.length)
			nums[p++]=0;
	}
}
