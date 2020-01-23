package dynamicProgramming;

import java.util.Scanner;

/**
 * 
 * @author prajput
 *
 *         https://www.geeksforgeeks.org/longest-common-subsequence-dp-4/
 *
 *         Longest Common Subsequence | DP-4 We have discussed Overlapping
 *         Subproblems and Optimal Substructure properties in Set 1 and Set 2
 *         respectively. We also discussed one example problem in Set 3. Let us
 *         discuss Longest Common Subsequence (LCS) problem as one more example
 *         problem that can be solved using Dynamic Programming.
 * 
 *         LCS Problem Statement: Given two sequences, find the length of
 *         longest subsequence present in both of them. A subsequence is a
 *         sequence that appears in the same relative order, but not necessarily
 *         contiguous. For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc
 *         are subsequences of “abcdefg”. So a string of length n has 2^n
 *         different possible subsequences.
 * 
 *         It is a classic computer science problem, the basis of diff (a file
 *         comparison program that outputs the differences between two files),
 *         and has applications in bioinformatics.
 * 
 *         Examples: LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of
 *         length 3. LCS for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of
 *         length 4.
 */
public class LongestCommonSubSeq {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println();

		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		System.out.println(lcsRecur(arr1, arr2, str1.length(), str2.length()));
		System.out.println(lcsTabu(arr1, arr2, str1.length(), str2.length()));
		sc.close();

	}

	public static int lcsRecur(char[] arr1, char[] arr2, int m, int n) {
		if (m == 0 || n == 0)
			return 0;
		if (arr1[m - 1] == arr2[n - 1]) {
			return 1 + lcsRecur(arr1, arr2, m - 1, n - 1);
		} else
			return Math.max(lcsRecur(arr1, arr2, m, n - 1), lcsRecur(arr1, arr2, m - 1, n));
	}

	public static int lcsTabu(char[] X, char[] Y, int m, int n) {

		int L[][] = new int[m + 1][n + 1];
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					L[i][j] = 0;
				else if (X[i - 1] == Y[j - 1])
					L[i][j] = L[i - 1][j - 1] + 1;
				else
					L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
			}
		}
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				System.out.print(L[i][j]);
			}
			System.out.println();
		}
		return L[m][n];
	}
	
	/*public static String lcsRecurWithString(char[] arr1, char[] arr2, int m, int n) {
		if (m == 0 || n == 0)
			return "";
		if (arr1[m - 1] == arr2[n - 1]) {
			return 1 + lcsRecur(arr1, arr2, m - 1, n - 1);
		} else
			return Math.max(lcsRecur(arr1, arr2, m, n - 1), lcsRecur(arr1, arr2, m - 1, n));
	}*/

}
