package prk.string;

import java.util.HashMap;
import java.util.Map;

public class StringNinja {

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		String S = "asdfass";
		char[] ch = S.toCharArray();
		int len = S.length();
		int i, j;
		for (i = 0; i < len; i++) {
			if(map.containsKey(ch[i])){
				map.put(ch[i], map.get(ch[i]) + 1);
			}
			else
				map.put(ch[i],1);
			
		}
		for (i = 0, j = len - 1; i < j;) {
			if (map.get(ch[i]) > 1) {
				map.put(ch[i], map.get(ch[i]) - 1);
				i++;
			} else if (map.get(ch[j]) > 1) {
				map.put(ch[j], map.get(ch[j]) - 1);
				j--;
			} else {
				System.out.println(j - i + 1);
				return;
			}
		}
	}
}
