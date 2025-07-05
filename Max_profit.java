package arrays;
import java.util.Scanner;

// LeetCode 121 – Best Time to Buy and Sell Stock
//Find the maximum profit from a single buy and sell of stock given daily prices

public class Max_profit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine().replaceAll("[\\[\\]]","");
		String[] parts = n.split(",");
		int num[] = new int[parts.length];
		for(int i=0;i<parts.length;i++) {
			num[i]=Integer.parseInt(parts[i].trim());
		}
		System.out.println(maxProfit(num));
	}

	public static int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int price : prices){
            if(price<minprice){
                minprice=price;
            }else {
                maxprofit = Math.max(maxprofit, price-minprice);
            }
        }
        return maxprofit;
    }
}
