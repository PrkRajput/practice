package samsung;

import java.util.Scanner;

public class SumNoInString {

	public static void main(String[] args) {
		
		int T=0;
		int i,j;
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		T = sc.nextInt();
		//System.out.println("1......"+T);
		String[] str = new String[T];
		//System.out.println("2......"+str.length);
		for(i=0; i<T; i++){
			//System.out.println("4......");
			str[i]=sc1.nextLine();
		}
		//System.out.println("3......"+str.toString());
		
		for(i=0; i<T; i++){
			String temp="";
			int sum=0;
			for(j=0; j<str[i].length(); j++){				
				if(str[i].charAt(j)>=48 && str[i].charAt(j)<=57 ){
					temp=temp.concat(String.valueOf( str[i].charAt(j)));
				}
				else{
					if(temp!="")
					sum+=Integer.parseInt(temp);
					temp="";
				}	
				
			}
			if(temp!="")
				sum+=Integer.parseInt(temp);
				temp="";
			System.out.println(sum);
		}
		sc.close();
	}

}
