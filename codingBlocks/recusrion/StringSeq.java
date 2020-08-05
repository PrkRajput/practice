package recusrion;

import java.util.ArrayList;

public class StringSeq {

	public static void main(String[] args) {
		System.out.println(allSubSeq("abc"));
		System.out.println(allPermut("abc"));

	}

	private static ArrayList<String> allSubSeq(String str) {
		if(str.length()==0){
			ArrayList<String> arr = new ArrayList<String>();
			arr.add("");
			return arr;
		}
		ArrayList<String> arr = allSubSeq(str.substring(1));
		int i = arr.size();
		while(i-->0){
			arr.add(str.charAt(0)+arr.get(i));
		}
		return arr;
	}
	private static ArrayList<String> allPermut(String str) {
		if(str.length()==0){
			ArrayList<String> arr = new ArrayList<String>();
			arr.add("");
			return arr;
		}
		ArrayList<String> arr = allPermut(str.substring(1));
		ArrayList<String> newArr = new ArrayList<>();
		int i = arr.size();
		while(i-->0){
			for(int j=0; j<=arr.get(i).length(); j++){
				newArr.add(arr.get(i).substring(0,j)+str.charAt(0)+arr.get(i).substring(j));
			}
		}
		return newArr;
	}

}
