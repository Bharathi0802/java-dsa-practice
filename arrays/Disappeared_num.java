package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// LeetCode 448 - Find all disappeared numbers in an array
// return an array of all the integers in the range [1, n] that do not appear in nums.
public class Disappeared_num {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] num=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		System.out.println(findDisappearedNumbers(num));
	}
	
	public static List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0)
                nums[index] = -nums[index];
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                result.add(i + 1);
        }
        return result;
    }

}
