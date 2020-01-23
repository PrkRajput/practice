package collection;
import java.util.Arrays;
public class TestCollections {

	public static void main(String[] args) {
		int array[] = {7,5,6,4,1,3,2,0};
		int arr2D[][] = {{7,5,6},{4,1,3},{11,2,0}};
		
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.deepToString(arr2D));
		
		String str = "test this string";
		String str1[] = str.split("t");
		char ch[]  = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) 
			System.out.print(ch[i]);
		System.out.println(String.valueOf(ch));
	}
}