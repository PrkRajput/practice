package dynamicProgramming;
/**
 * https://www.hackerrank.com/challenges/max-array-sum/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dynamic-programming
 * @author Prakhar Rajput
 *
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MaxAdjacentArraySum {

    // Complete the maxSubsetSum function below.
    static int maxSubsetSum(int[] arr) {
    	 if (arr.length == 0) return 0;
    	    arr[0] = Math.max(0, arr[0]);
    	    if (arr.length == 1) return arr[0];
    	    arr[1] = Math.max(arr[0], arr[1]);
    	    for (int i = 2; i < arr.length; i++)
    	      arr[i] = Math.max(arr[i-1], arr[i]+arr[i-2]);
    	    return arr[arr.length-1];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = maxSubsetSum(arr);


        scanner.close();
    }
}

