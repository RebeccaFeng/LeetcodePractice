/**
 * @author fengyuan
 * problem:
 * 		Merge two sorted linked lists and return it as a new list. 
 * 		The new list should be made by splicing together the nodes of the first two lists.
 * 
 * when I deal with this problem, I found some problems of thinking this problem:
 * 		1 I forgot the situation of l1/l2 is null, that will cause nullPointerException.
 * 		2 when compare the value of l1 and l2, whether the node(to be honest is the head) is null is utmost important!
 * 			If forget this situation, the ListNode structure cannot be built to a new one.
 * 		3 and when compare the two element in two lists, the bigger/smaller one should not move to the next.
 */
package easy;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

public class MergeTwoSortedLists {
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		if(l1 == null) {
			return l2;
		}
		if(l2 == null) {
			return l1;
		}
        ListNode l = null;
		ListNode head = null;
		
		
		while(l1 != null && l2 != null) {	                                             
			if(l1.val <= l2.val) { 
				if(l == null) {
					l = l1;
					head = l;
				}else {
					l.next = l1;
					l = l.next;
				}
				l1 = l1.next;
			}else {
				if(l == null) {
					l = l2;
					head = l;
				}else {
					l.next = l2;
					l = l.next;
				}
				l2 = l2.next;
			}
		}
		
		while(l1 != null) { 
			l.next = l1;
			l = l.next;
			l1 = l1.next;
		}
		
		while(l2 != null) {                                                                                            
			l.next = l2;
			l = l.next;
			l2 = l2.next;
		}
		
		return head;
    }
	
	public static void main(String args[]) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		
		ListNode r = new MergeTwoSortedLists().mergeTwoLists(l1, l2);
		while(r != null) {
			System.out.println(r.val);
			r = r.next;
		}
	}

}
