package recusrion;

import java.util.ArrayList;
import java.util.List;

public class Pattern {
	
	public static void main(String[] args) {
		print(5,0,0);
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		for(int i : list){
			System.out.println(i+1);
		}
	}

	private static void print(int i, int j, int k) {
		
	}
}
