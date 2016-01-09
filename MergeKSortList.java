/********************************************************
  > File Name:23MergeKSortList.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Sat Jan  9 14:07:53 2016
 *********************************************************/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
public class MergeKSortList {
	public ListNode mergeKLists(ListNode[] lists) {
		if (lists.length == 0)
			return null;
		//PriorityQueue is a sorted queue
		PriorityQueue<ListNode> q = new PriorityQueue<ListNode>(lists.length,
			new Comparator<ListNode>() {
				public int compare (ListNode a, ListNode b) {
					if (a.val>b.val) {
						return 1;
					} else if (a.val>b.val) {
						return 0;
					} else {
						return -1;
					}
				}
			});
		//add first node of each list to the queue
		for (ListNode list:lists) {
			if (list !=null) {
				q.add(list);
			}
		}
		ListNode head = new ListNode(0);
		ListNode p = head; //serve as pointer
		while (q.size()>0) {
			ListNode temp = q.poll();  //get the first node
			p.next = temp;
			if (temp.next != null) {
				q.add(temp.next); // add next node in q
			}
			p = p.next;
		}
		return head.next;
	}
	public static void main(String[] args) {
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(0);
		ListNode head1 = l1;
		ListNode head2 = l2;
		for (int i = 0;i<10;i++) {
			l1.next = new ListNode(i);
			l1 = l1.next;
		}
		for (int i = 1;i<20;i=i+2) {
			l2.next = new ListNode(i);
			l2 = l2.next;
		}
		l1 = head1.next;
		l2 = head2.next;
		ListNode[] test = new ListNode[2];
		test[0] = l1;
		test[1] = l2;
		MergeKSortList so = new MergeKSortList();
		ListNode answer = so.mergeKLists(test);
		while (answer!=null) {
			System.out.print(answer.val+" ");
			answer = answer.next;
		}
		System.out.println();
	}
}
