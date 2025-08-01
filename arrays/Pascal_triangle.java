package arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// LeetCode 118 - Pascal's Triangle
// Given an integer numRows, return the first numRows of Pascal's triangle.
public class Pascal_triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<List<Integer>> result=generate(n);
		for(List<Integer> row:result)
			System.out.println(row);
	}
	
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pas=new ArrayList<>();
        for(int row=0;row<numRows;row++){
            List<Integer> r=new ArrayList<>();
            r.add(1);
            for(int j=1;j<row;j++){
                int val=pas.get(row-1).get(j-1)+pas.get(row-1).get(j);
                r.add(val);
            }
            if(row>0)
            r.add(1);
            pas.add(r);
        }
        return pas;
    }

}
