package arrays;
import java.util.Scanner;

// LeetCode 169 - Majority Elements
// Given an array nums of size n, return the majority element.

public class Majority_elements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of list items: ");
		int n = sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		System.out.println(majorityElement(nums));
	}
	
	public static int majorityElement(int[] nums) {
        int count = 0;
        Integer c = null;
        for(int num:nums){
            if(count==0)
            c=num;
            count+=(num==c)?1:-1;
        }
        return c;
    }

}
