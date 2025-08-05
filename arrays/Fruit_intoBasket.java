package arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// LeetCode 904 - Fruit into Basket
// Given the integer array fruits, return the maximum number of fruits you can pick.
public class Fruit_intoBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] fruit=new int[n];
		for(int i=0;i<n;i++)
			fruit[i]=sc.nextInt();
		System.out.println(totalFruit(fruit));
	}

	public static int totalFruit(int[] fruits) {
        Map<Integer, Integer> basket = new HashMap<>();
        int l=0, max=0;
        for(int r=0;r<fruits.length;r++){
            basket.put(fruits[r],basket.getOrDefault(fruits[r],0)+1);
            while(basket.size()>2){
                basket.put(fruits[l],basket.get(fruits[l])-1);
                if(basket.get(fruits[l])==0)
                basket.remove(fruits[l]);
                l++;
            }
            max=Math.max(max, r-l+1);
        }
        return max;
    }
}
