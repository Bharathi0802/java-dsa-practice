package arrays;
import java.util.Scanner;

//✅ Two Sum - LeetCode 1
//Given an array of integers nums and an integer target,
//return indices of the two numbers such that they add up to target.
public class Two_sums {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int nums[]= new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		int target = sc.nextInt();
		int result[]= twoSum(nums,target);
		System.out.println("Indexes: "+result[0]+ ", "+result[1]);

	}
	
	public static int[] twoSum(int nums[], int target) {
		for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) 
                	return new int[]{i, j};
            }
        }
        return new int[]{};
		
	}

}
