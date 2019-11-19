package adobe;

import java.util.Scanner;

public class SpiralArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m,n,init=0;
		m=sc.nextInt();
		n=sc.nextInt();
		int x=m*n;
		int ary[][] = new int[m][n];
		int i=0,j=0,k=n-1,l=m-1,s=n,t=m;
		while(init < s*t){
			for (; j < n; j++) {
				ary[i][j]=++init;
			}
			m--;
			i++;j--;
			for (; i < m+1; i++) {
				ary[i][j]=++init;
			}
			n--;
			j++;i--;
			
			//////////
			
			
			for (; k > s-n; k--) {
				ary[i][k]=++init;
			}
			m--;
			k--;l++;
			for (; l < t-m-1; l--) {
				ary[i][j]=++init;
			}
			n--;
			l--;k++;
		}
	sc.close();
	
	for(;s>0;s--){
		for(;t>0;t--){
			System.out.print(ary[s][t]+"\t");
		}
		System.out.println("");
	}
	
	
	}
}
