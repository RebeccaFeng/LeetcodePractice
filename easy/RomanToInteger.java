/**
 * Problem:
 * 		Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 */

package easy;

import java.util.HashSet;
import java.util.Set;

public class RomanToInteger {
	public int romanToInt(String s) {
		
		int ans = 0;
		int num = s.length();
//		System.out.println(num);
		
		int i = 0;
		
		 while(i < num) {        
			
			if(s.charAt(i) == 'I' ) {
				
				if((i + 1) < num && s.charAt(i + 1) == 'V') {
					ans += 4;
					i += 2;
					continue;
				}else if((i + 1) < num && s.charAt(i + 1) == 'X') {
					ans += 9;
					i += 2;
					continue;
				}else {
					ans += 1;
					i++;
					continue;
				}
			}
			
			if(s.charAt(i) == 'V') {
				ans += 5;
				i++;
				continue;
			}
			
			if(s.charAt(i) == 'X') {
				if((i + 1) < num && s.charAt(i + 1) == 'L') {
					ans += 40;
					i += 2;
					continue;
				}else if((i + 1) < num && s.charAt(i + 1) == 'C') {
					ans += 90;
					i += 2;
					continue;
				}else {
					ans += 10;
					i++;
					continue;
				}
			}
			
			if(s.charAt(i) == 'L') {
				ans += 50;
				i++;
				continue;
			}
			
			if(s.charAt(i) == 'C') {
				if((i + 1) < num && s.charAt(i + 1) == 'D') {
					ans += 400;
					i += 2;
					continue;
				}else if((i + 1) < num && s.charAt(i + 1) == 'M') {
					ans += 900;
					i += 2;
					continue;
				}else {
					ans += 100;
					i++;
					continue;
				}
			}
			
			if(s.charAt(i) == 'D') {
				ans += 500;
				i++;
				continue;
			}
			
			if(s.charAt(i) == 'M') {
				ans += 1000;
				i++;
				continue;
			}
			
		}
		
		return ans;
        
    }
	
	public static void main(String args[]) {
		RomanToInteger r = new RomanToInteger();
		System.out.println(r.romanToInt("DCXXI"));
		
		
	}

}
