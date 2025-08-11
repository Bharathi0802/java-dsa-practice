package arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// LeetCode 2438 - Range product queries of powers
// Return an array answers, equal in length to queries, where answers[i] is the answer to the ith query.
public class Product_queries {

	private static final long MOD = 1_000_000_007L;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] queries=new int[m][2];
		for(int i=0;i<m;i++) {
			queries[i][0]=sc.nextInt();
			queries[i][1]=sc.nextInt();
		}
		System.out.println(productQueries(n, queries));
	}

	 public static int[] productQueries(int n, int[][] queries) {
	        List<Long> powersList = new ArrayList<>();
	        for (int i = 0; i < 31; i++) {
	            if (((n >> i) & 1) == 1) {
	                powersList.add(1L << i);
	            }
	        }
	        int m = powersList.size();
	        long[] prefixProd = new long[m + 1];
	        prefixProd[0] = 1;
	        for (int i = 0; i < m; i++) {
	            prefixProd[i + 1] = (prefixProd[i] * powersList.get(i)) % MOD;
	        }
	        int[] ans = new int[queries.length];
	        for (int i = 0; i < queries.length; i++) {
	            int l = queries[i][0];
	            int r = queries[i][1];
	            long numerator = prefixProd[r + 1];
	            long denominator = prefixProd[l];
	            long inv = modPow(denominator, MOD - 2);
	            ans[i] = (int) ((numerator * inv) % MOD);
	        }

	        return ans;
	    }

	    private static long modPow(long base, long exp) {
	        long res = 1;
	        while (exp > 0) {
	            if ((exp & 1) == 1) res = (res * base) % MOD;
	            base = (base * base) % MOD;
	            exp >>= 1;
	        }
	        return res;
	    }
}
