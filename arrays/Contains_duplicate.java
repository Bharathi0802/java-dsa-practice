package arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// LeetCode 217 - Contains Duplicate
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
public class Contains_duplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().replaceAll("[\\[\\]]", "");
        String[] parts = input.split(",");
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i].trim());
        }

        boolean result = containsDuplicate(nums);
        System.out.println(result);
        }
	
	public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
