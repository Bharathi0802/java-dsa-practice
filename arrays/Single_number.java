package arrays;
import java.util.ArrayList;
import java.util.Scanner;

// LeetCode 136 - Single Number
// Find the element that appears only once in an array where all others appear twice

public class Single_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine().replaceAll("[\\[\\]]", "");
		String[] parts = n.split(",");
		int nums[] = new int[parts.length];
		for(int i=0;i<parts.length;i++) {
			nums[i] = Integer.parseInt(parts[i].trim());
		}
		System.out.println(singleNumber(nums));
	}
	
	public static int singleNumber(int[] nums) {
        int n=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    n=nums[i];
                    count++;
                }
            }
            if(count==1)
            break;
        }
        return n;
    }
}
