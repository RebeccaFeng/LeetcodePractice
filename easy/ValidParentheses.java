package easy;

import java.util.LinkedList;

public class ValidParentheses {
	
	public boolean isValid(String s) {
		
		boolean result = false;
		LinkedList l = new LinkedList();
		
		if(s.length()== 0)
			return true;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				l.addFirst(s.charAt(i));
			}else if(l.isEmpty())
				return false;
			else if(s.charAt(i) == ')'){
				if((char)l.getFirst() == ')')  
					l.removeFirst();
				else if(l.isEmpty())
					return false;
				else 
					return false;
			}else if(s.charAt(i) == '}') {
				if((char)l.getFirst() == '{')  
					l.removeFirst();
				else if(l.isEmpty())
					return false;
				else 
					return false;
			}else if(s.charAt(i) == ']') {
				if((char)l.getFirst() == '[') 
					l.removeFirst();
				else if(l.isEmpty())
					return false;
				else 
					return false;
				
			}
			
		}
		if(l.isEmpty())
			result = true;
		return result;
        
    }

	public static void main(String[] args) {
		ValidParentheses v = new ValidParentheses();
		System.out.println(v.isValid("]"));
		
	}

}
