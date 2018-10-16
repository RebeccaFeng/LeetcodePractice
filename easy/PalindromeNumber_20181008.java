/**
 * @author fengyuan
 * problem:
 * 		Determine whether an integer is a palindrome. 
 * 		An integer is a palindrome when it reads the same backward as forward.
 * solution:
 * 		Revert half of the number;
 */

package easy;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber_20181008 {
	
	public boolean isPalindrome(int x) {
		if(x < 0)
            return false;
		
		List l = new ArrayList();
		int count = 0;
		while(x != 0) {
			l.add(x%10);
			x /= 10;
			count++;
		}
		
		for(int i = 0; i < count; i++) {
			System.out.println(l.get(i) + " " + i);
		}
		
		for(int i = 0; i < count/2; i++) {
			if(l.get(i) != l.get(count - i - 1)) {
				return false;
			}
		}
		return true;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new PalindromeNumber_20181008().isPalindrome(10));
		
	}

}
