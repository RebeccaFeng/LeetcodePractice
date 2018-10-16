/**
 * Problem:
 * 		Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 */

package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_Map {
	public int romanToInt(String s) {
		
		int ans = 0;
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int pre = 0;
		int cur = 0;
		for(int i = 0; i < s.length(); i++) {
			cur = map.get(s.charAt(i));
			if(cur <= pre) {
				ans = ans + cur;
			}else {
				ans = ans + cur - 2 * pre;
			}
			
			pre = map.get(s.charAt(i));
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
