package arrays;
import java.util.Scanner;

// LeetCode 53 - Maximum Subarray
// Find the subarray with the largest sum, and return its sum.
public class Max_subarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().replaceAll("[\\[\\]]", "");
		String[] parts = str.split(",");
		
		int n[] = new int[parts.length];
		for(int i=0;i<parts.length;i++) {
			n[i] = Integer.parseInt(parts[i].trim());
		}
		System.out.println(maxSubArray(n));
	}
	
	public static int maxSubArray(int[] nums) {
		int cmax = nums[0];
		int max = nums[0];
		for(int i=1;i<nums.length;i++) {
			cmax = Math.max(nums[i], cmax+nums[i]);
			max = Math.max(max, cmax);
		}
		return max;
	}

}
