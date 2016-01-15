/********************************************************
  > File Name:25ReverseNodesInKgroup.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Mon Jan 11 16:44:26 2016
 *********************************************************/

public class ReverseNodesInKgroup {
	public ListNode reverseKGroup(ListNode head,int k) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode pre = dummy;
		int i = 0;
		while(head != null){
			i++;
			if(i % k == 0) {
				pre = reverse(pre, head.next);
				head = pre.next;
			} else {
				head = head.next;
			}
		}
		return dummy.next;
	}
	public ListNode reverse(ListNode pre,ListNode next) {
		ListNode last = pre.next;
		ListNode cur = last.next;
		while(cur != next) {
			last.next = cur.next;
			cur.next = pre.next;
			pre.next = cur;
			cur = last.next;
		}
		return last;
	}
	public static void main(String[] args) {
		ReverseNodesInKgroup so = new ReverseNodesInKgroup();
		ListNode l1 = new ListNode(0);
		ListNode head1 = l1;
		for (int i = 1;i<11;i++) {
			l1.next = new ListNode(i);
			l1 = l1.next;
		}
		l1 = head1.next;
		ListNode answer = so.reverseKGroup(l1,3);
		while(answer != null) {
			System.out.print(answer.val+" ");
			answer = answer.next;
		}
	}
}
