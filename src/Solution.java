import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		int c=t;
		String n;
		while (t-- > 0) {
			n = sc.nextLine();
			char[] ch = n.toCharArray();
			char ch2[] = new char[ch.length];
			boolean flag = false;
			int k=0;
			for(int i=0; i<ch.length; i++){
				if(ch[i]=='4'){
					flag=true;
					ch[i]='3';
					ch2[k++]='1';
				}
				else
					if(flag)
						ch2[k++]='0';
								
			}
			System.out.println("Case #"+(c-t)+": "+String.valueOf(ch)+" "+String.valueOf(ch2).trim());
		}
	}
}

