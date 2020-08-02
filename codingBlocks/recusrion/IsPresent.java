package recusrion;

import java.util.ArrayList;
import java.util.Arrays;

public class IsPresent {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 3, 4, 5, 4, 5, 6, 7, 3, 5, 0 };
		System.out.println(isPresentFirst(arr,5,0));
		System.out.println(isPresentLast(arr, 11, 0));
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> ans =  isPresentAll(arr, 14, 0,a);
		if(ans!=null)
			System.out.println(Arrays.toString(ans.toArray()));
		else
			System.out.println(-1);
	}
	
	private static ArrayList<Integer> isPresentAll(int[] arr, int key, int si,ArrayList<Integer> ans) {
		if (si >= arr.length)
			return null;
		if (arr[si] == key){
			ans.add(si);
			isPresentAll(arr, key, si + 1,ans);
			return ans;
		}			
		else
			return isPresentAll(arr, key, si + 1,ans);
	}


	private static int isPresentFirst(int[] arr, int key, int si) {
		if (si >= arr.length)
			return -1;
		if (arr[si] == key)
			return si;
		else
			return isPresentFirst(arr, key, si + 1);
	}

	private static int isPresentLast(int[] arr, int key, int si) {
		if (si >= arr.length)
			return -1;
		int x = isPresentLast(arr, key, si + 1);
		if (x == -1) {
			if (arr[si] == key)
				return si;
			else
				return -1;
		} else
			return x;
	}

}
