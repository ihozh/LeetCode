/********************************************************
  > File Name:19RemoveNthNode.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Thu Jan  7 20:14:57 2016
 *********************************************************/

public class RemoveNthNode {
	public ListNode removeNthFromEnd(ListNode head,int n) {
		ListNode findAll = head;
		ListNode findNth = head;
		int i=0;
		while(findAll!=null) {
			findAll = findAll.next;
			i++;
			if (i > n+1) {// find the node before Nth node
				findNth = findNth.next;
			}
		}
		if (i==n) {
			head = findNth.next;
		} else {
			findNth.next = findNth.next.next;
		}
		return head;

	}
	public static void main(String[] args) {
		RemoveNthNode so = new RemoveNthNode();
		ListNode head = new ListNode(1);
		ListNode begin = head;
		for (int i = 2;i<6;i++) {
			head.next = new ListNode(i);
			head = head.next;
		}
		head = begin;
		ListNode newNode = so.removeNthFromEnd(head,1);
		while(newNode!=null) {
			System.out.println(newNode.val);
			newNode = newNode.next;
		}
	}
}
