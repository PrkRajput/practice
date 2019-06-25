package dynamicProgramming;
import java.io.*;
import java.util.*;
 
 
public class TestClass {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i_arr=0; i_arr<N; i_arr++)
        {
            arr[i_arr] = sc.nextInt();
        }
        solve(arr, N);
    }
    static void solve(int[] arr, int N){
        
    	System.out.println("-1 -1");
        for (int i = 1; i < N; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
            if(j>=0 && arr[j]<arr[j+1])
            	System.out.print(arr[j]);
            
            
            
            else if(j>=0 && arr[j]==arr[j+1]){
            	int k=j;
            	while(arr[k]==arr[j+1] && k>=N){
            		k--;
            	}
            	if(k>=0)
            		System.out.print(arr[k]);
            	else
            		System.out.print("-1");
            }
            
            
            
            
            else
            	System.out.print("-1");
            System.out.print(" ");
            if(j+2<N && arr[j+2]>arr[j+1])
            	System.out.print(arr[j+2]);
            else if(j+2<N && arr[j+2]==arr[j+1]){
            	int k=j+2;
            	while(arr[k]==arr[j+1] && k<N){
            		k++;
            	}
            	if(k<N)
            		System.out.print(arr[k]);
            	else
            		System.out.print("-1");
            }
            else
            	System.out.print("-1");
            
            System.out.println("");
        } 
    }
}