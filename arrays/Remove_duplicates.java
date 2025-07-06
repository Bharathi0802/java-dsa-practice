package arrays;
import java.util.Scanner;

//LeetCode 26: Remove duplicates from sorted array in-place and return count of unique elements.
//Modify nums so first k elements are unique; return k.

public class Remove_duplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine().replaceAll("[\\[\\]]", "");
		String[] parts=str.split(",");
		int n[]=new int[parts.length];
		
		for(int i=0;i<parts.length;i++) {
			n[i]=Integer.parseInt(parts[i].trim());
		}
		int res=removeDuplicates(n);
		System.out.print("[");
		for(int i=0;i<res;i++) {
			System.out.print(n[i]);
			if(i<res-1)
				System.out.print(",");
		}
		System.out.print("]");
	}
	
	public static int removeDuplicates(int[] nums) {
		if(nums.length==0)
			return 0;
		
		int k=1;
		for(int i=1;i<nums.length;i++) {
			if(nums[i]!=nums[k-1]) {
				nums[k]=nums[i];
				k++;
			}
		}
		return k;
	}

}
