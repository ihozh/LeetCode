/********************************************************
  > File Name:24SwapNodes.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Mon Jan 11 13:55:15 2016
 *********************************************************/
public class SwapNodes {
	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode pre = head;
		ListNode left = head;
		ListNode right = head.next;
		ListNode temp;
		left.next = right.next;
		right.next = left;
		head = right;
		left = left.next;
		if (right.next.next == null) {
			return head;
		} else
			right = right.next.next.next;

		while (left != null && right != null) {
			//System.out.println(pre.val+" "+left.val+" "+right.val);
			pre.next = right;
			left.next = right.next;
			right.next = left;
			pre = pre.next.next;
			left = left.next;
			if (right.next.next == null) {
				return head;
			} else
				right = right.next.next.next;
		}
		return head;
	}
	public static void main(String[] args) {
		SwapNodes so = new SwapNodes();
		ListNode l1 = new ListNode(0);
		ListNode head1 = l1;
		for (int i = 1;i<11;i++) {
			l1.next = new ListNode(i);
			l1 = l1.next;
		}
		l1 = head1.next;
		ListNode answer = so.swapPairs(l1);
		while(answer != null) {
			System.out.print(answer.val+" ");
			answer = answer.next;
		}
	}
}
