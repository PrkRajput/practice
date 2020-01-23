package sorting;

public class Sorting {

	public static void main(String[] args) {
		int arr[] = new int[] { 4, 3, 5, 1, 10, 5, 8, 7, 2, 11 };

		System.out.println("Initial array -> ");
		for (int i = 0; i < 10; ++i)
			System.out.print(arr[i] + ", ");
		/*
		 * mergeSort(arr, 0, 9); 
		 * System.out.println("\nMergeSort array -> ");
		 */
		quickSort(arr, 0, 9);
		System.out.println("\nQuickSort array -> ");
		for (int i = 0; i < 10; ++i)
			System.out.print(arr[i] + ", ");
	}
/////////////////////////////////////////  Merge Sort  //////////////////////////////////////////////////////////////
	public static void mergeSort(int[] arr, int l, int r) {
		int mid = (l + r) / 2;
		if (l < r) {
			mergeSort(arr, l, mid);
			mergeSort(arr, mid + 1, r);
			merge(arr, l, mid, r);
		}
	}

	public static void merge(int[] arr, int l, int mid, int r) {
		int n1 = mid - l + 1;
		int n2 = r - mid;

		int arr1[] = new int[n1];
		int arr2[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			arr1[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			arr2[j] = arr[mid + 1 + j];

		int i = 0, j = 0;

		int k = l;
		while (i < n1 && j < n2) {
			if (arr1[i] <= arr2[j])
				arr[k++] = arr1[i++];
			else
				arr[k++] = arr2[j++];
		}

		while (i < n1)
			arr[k++] = arr1[i++];

		while (j < n2)
			arr[k++] = arr2[j++];

	}
/////////////////////////////////////////  quick Sort  //////////////////////////////////////////////////////////////
	public static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {

			if (arr[j] <= pivot) {
				i++;

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	public static void quickSort(int arr[], int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////
}
