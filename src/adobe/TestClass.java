package adobe;

import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int S = sc.nextInt();
            int arr[] = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
        	int j;
        	for ( j = 0; j < arr.length; j++) {
        		if(arr[j]>S)
        			break;
    		}
        	if (N-j-1==0)
        		System.out.println("1");
        	else if (N-j-1<0)
        		System.out.println("0");
        	else
        	 System.out.println(Math.abs(j-(N-j)));
        }
          
        }
    }
