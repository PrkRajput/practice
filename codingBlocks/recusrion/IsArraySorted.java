package recusrion;

import java.util.Arrays;

public class IsArraySorted {

	public static void main(String[] args) {
		int arr[] = {1,1,3,4,5};
		System.out.println(isSorted(arr));

	}

	private static boolean isSorted(int[] arr) {
		if(arr.length<2)
			return true;
		return (arr[arr.length-1]>=arr[arr.length-2])&&isSorted(Arrays.copyOfRange(arr,0,arr.length-1));
		
	}

}
