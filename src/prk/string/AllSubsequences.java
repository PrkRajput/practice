package prk.string;

public class AllSubsequences {
	
	static String ans[] = new String[10];
	static int i=0;
	public static void printSub(String in,String out){
		if(in.length()==0){
			System.out.println(out);
			ans[i++]=out;
			return;
		}
		printSub(in.substring(1), out);
		printSub(in.substring(1), out+in.substring(0, 1));
	}
	
	public static void main(String args[]){
		printSub("abc","");
		System.out.println("break");
	}
}
