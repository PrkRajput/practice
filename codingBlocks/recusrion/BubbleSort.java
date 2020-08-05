package recusrion;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {3,0,2,1,9,7,1};
		System.out.println(Arrays.toString(bubble(arr,0,arr.length-1)));
	}

	private static int[] bubble(int[] arr, int si, int li) {
		
		if(li<=0)
			return arr;
		if(si>=li)
			return bubble(arr, 0, li-1);;
		if(arr[si+1]>arr[si]){
			arr[si+1] = arr[si+1] + arr[si];
			arr[si] = arr[si+1] - arr[si];
			arr[si+1] = arr[si+1] - arr[si]; 
		}
		return bubble(arr, si+1, li);			
	}

}
