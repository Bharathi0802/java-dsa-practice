package arrays;

import java.util.Scanner;

// LeetCode 3477 - Fruits Into Baskets II
// Return the number of fruit types that remain unplaced after all possible allocations are made.
public class Fruits_toBasketII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] fruits=new int[n];
		for(int i=0;i<n;i++)
		   fruits[i]=sc.nextInt();
		int m = sc.nextInt();
		int[] baskets=new int[m];
		for(int i=0;i<m;i++)
			baskets[i]=sc.nextInt();
		System.out.println(numOfUnplacedFruits(fruits, baskets));

	}

	public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        boolean[] used=new boolean[baskets.length];
        int count=0;
        for(int i=0;i<n;i++){
            boolean place=false;
            for(int j=0;j<baskets.length;j++){
                if(!used[j] && baskets[j]>=fruits[i]){
                    used[j]=true;
                    place=true;
                    break;
                }
            }
            if(!place)
            count++;
        }
        return count;
    }
}
