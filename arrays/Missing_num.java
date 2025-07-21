package arrays;
import java.util.Arrays;
import java.util.Scanner;

// LeetCode 268 - Missing number
// Given an array nums containing n distinct numbers in the range [0, n],
// return the only number in the range that is missing from the array.
public class Missing_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of list items: ");
		int n = sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		System.out.println(missingNumber(nums));
	}
	
	public static int missingNumber(int[] nums) {
        int n=nums.length;
        int esum = n*(n+1)/2;
        int asum = Arrays.stream(nums).sum();
        return esum-asum;
    }

}
