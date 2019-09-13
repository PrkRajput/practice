package dynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Let us say that you are given a number N, you've to find the number of different ways to write it as the sum of 1, 3 and 4.

For example, if N = 5, the answer would be 6.

1 + 1 + 1 + 1 + 1
1 + 4
4 + 1
1 + 1 + 3
1 + 3 + 1
3 + 1 + 1

 * @author Prakhar Rajput
 *
 */
public class PossibleNoSum134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),i=0;
		//int dp[] = new int[n];
		ArrayList<Integer> dp = new ArrayList<Integer>();
		dp.add(0,1);
		dp.add(1,1);
		dp.add(2,1);
		dp.add(3,2);
		
		for (i = 4; i <= n; i++) {
			dp.add(i,dp.get(i-1)+dp.get(i-3)+dp.get(i-4));
		}
		System.out.println(dp.get(i-1));
		sc.close();
					}

}
