package arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// LeetCode 442 - Find all duplicates in the array
// Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, 
// return an array of all the integers that appears twice.
public class Find_duplicates {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int[] num=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		System.out.println(findDuplicates(num));
	}
	
	public static List<Integer> findDuplicates(int[] nums){
		List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                result.add(Math.abs(nums[i]));
            } else {
                nums[index] = -nums[index];
            }
        }
        return result;
    }
}
