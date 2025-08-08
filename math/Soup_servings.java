package math;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// LeetCode #808 - Soup Servings
// Return the probability that A is used up before B, plus half the probability that both soups are used up in the same turn.
public class Soup_servings {

	private static Map<String, Double> m=new HashMap<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(soupServings(n));
	}

	public static double soupServings(int n) {
        if(n>=4800)
        return 1.0;
        int unit=(int)Math.ceil(n/25.0);
        return dfs(unit, unit);
    }
    private static double dfs(int a, int b) {
        if (a <= 0 && b <= 0) return 0.5;
        if (a <= 0) return 1.0;
        if (b <= 0) return 0.0;

        String key = a + "," + b;
        if (m.containsKey(key))
        return m.get(key);

        double probability = 0.25 * dfs(a - 4, b) + 0.25 * dfs(a - 3, b - 1) + 0.25 * dfs(a - 2, b - 2) + 0.25 * dfs(a - 1, b - 3);

        m.put(key, probability);
        return probability;
    }
}
