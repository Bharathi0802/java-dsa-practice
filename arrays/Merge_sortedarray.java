package arrays;
import java.util.Scanner;

// LeetCode 88 - Merge Sorted Array
// Merge nums1 and nums2 into a single array sorted in non-decreasing order.
public class Merge_sortedarray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String n1 = sc.nextLine().replaceAll("[\\[\\]]","");
		String[] parts1 = n1.split(",");
		int nums1[] = new int[parts1.length];
		for(int i=0;i<parts1.length;i++) {
			nums1[i] = Integer.parseInt(parts1[i].trim());
		}
		int m = sc.nextInt();
		sc.nextLine();
		String n2 = sc.nextLine().replaceAll("[\\[\\]]","");
		String[] parts2 = n2.split(",");
		int nums2[] = new int[parts2.length];
		for(int i=0;i<parts2.length;i++) {
			nums2[i] = Integer.parseInt(parts2[i].trim());
		}
		int n = sc.nextInt();
		merge(nums1,m,nums2,n);
		System.out.print("[");
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]);
            if (i != nums1.length - 1)
            	System.out.print(",");
        }
        System.out.println("]");
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
            nums1[k--]=nums1[i--];
            }
            else{
            nums1[k--]=nums2[j--];
            }
        }
        while(j>=0){
            nums1[k--]=nums2[j--];
        }
    }

}
