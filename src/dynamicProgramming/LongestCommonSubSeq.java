package dynamicProgramming;

import java.util.Scanner;

/**
 * 
 * @author prajput
 *
 *https://www.geeksforgeeks.org/longest-common-subsequence-dp-4/
 *
Longest Common Subsequence | DP-4
We have discussed Overlapping Subproblems and Optimal Substructure properties in Set 1 and Set 2 respectively. 
We also discussed one example problem in Set 3. 
Let us discuss Longest Common Subsequence (LCS) problem as one more example problem that can be solved using Dynamic Programming.

LCS Problem Statement: 
Given two sequences, find the length of longest subsequence present in both of them. 
A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous. 
For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc are subsequences of “abcdefg”. 
So a string of length n has 2^n different possible subsequences.

It is a classic computer science problem, the basis of diff 
(a file comparison program that outputs the differences between two files), and has applications in bioinformatics.

Examples:
LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
LCS for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of length 4.
 */
public class LongestCommonSubSeq {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		char ans[] = new char[arr1.length]; 
		
		/*for (int i = 0; i < arr1.length; i++) {
			int k=0;
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j++]){
					ans[k++]=arr1[i];
				}
				else{
					
				}
					
					
			}
		}*/
		lcs()
		
		
		
		
		sc.close();

	}

}
