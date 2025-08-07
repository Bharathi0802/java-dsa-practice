package arrays;
import java.util.Scanner;

// LeetCode 27 - Remove Element
// return the number of elements in nums which are not equal to val.
public class Remove_elements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		int val=sc.nextInt();
		System.out.println(removeElement(nums, val));
	}

	public static int removeElement(int[] nums, int val) {
        int k=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
