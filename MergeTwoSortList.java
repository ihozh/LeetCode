/********************************************************
  > File Name:21MergeTwoSortList.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Fri Jan  8 14:04:06 2016
 *********************************************************/

public class MergeTwoSortList {
	public ListNode mergeTwoLists(ListNode l1,ListNode l2) {
		ListNode l3 = new ListNode(0);
		ListNode head3 = l3;
		while(l1!=null&&l2!=null){
			if(l1.val<l2.val) {
				l3.next = l1;
				l1 = l1.next;
			} else {
				l3.next = l2;
				l2 = l2.next;
			}
			l3 = l3.next;
		}
		if(l1!=null) {
			l3.next = l1;
		}
		if(l2!=null) {
			l3.next = l2;
		}
		return head3.next;
	}
	public static void main (String[] args) {
		MergeTwoSortList so = new MergeTwoSortList();
		ListNode l1 = new ListNode(0);
		ListNode head1 = l1;
		ListNode l2 = new ListNode(2);
		ListNode head2 = l2;
		for (int i = 1;i<8;i++) {
			l1.next = new ListNode(i);
			l1 = l1.next;
		}
		for (int i = 3;i<6;i++) {
			l2.next = new ListNode(i);
			l2 = l2.next;
		}
		l1 = head1;
		l2 = head2;
		while(l1!=null) {
			System.out.print(l1.val+" ");
			l1 = l1.next;
		}
		System.out.println();
		while(l2!=null) {
			System.out.print(l2.val+" ");
			l2 = l2.next;
		}
		l1 = head1;
		l2 = head2;
		System.out.println();
		ListNode l3 = so.mergeTwoLists(l1,l2);
		while(l3!=null){
			System.out.print(l3.val+" ");
			l3 = l3.next;
		}
		System.out.println();
	}
}
