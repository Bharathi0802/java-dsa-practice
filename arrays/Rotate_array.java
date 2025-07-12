package arrays;
import java.util.Scanner;

// LeetCode 189 - Rotate Array
// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
public class Rotate_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().replaceAll("[\\[\\]]", "");
		String[] part = str.split(",");
		int[] n = new int[part.length];
		for(int i=0;i<part.length;i++) {
			n[i]=Integer.parseInt(part[i].trim());
		}
		int k = sc.nextInt();
		rotate(n,k);
	}
	
	public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k%=n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        System.out.print("[");
        for(int i=0;i<n;i++) {
        	System.out.print(nums[i]);
        	if(i<n-1)
        		System.out.print(",");
        }
        System.out.print("]");
    }
	
    private static void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
