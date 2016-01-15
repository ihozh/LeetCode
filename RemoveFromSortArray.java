/********************************************************
  > File Name:26RemoveFromSortArray.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Fri Jan 15 09:25:00 2016
 *********************************************************/

import java.util.List;
import java.util.ArrayList;
public class RemoveFromSortArray {
	public int removeDuplicates(int[] nums) {
		List<Integer> answer = new ArrayList<Integer>();
		int count = 0;
		int len = nums.length;
		for (int i = 1;i<len;i++) {
			if (nums[i] != nums[i-1]) {
				count++;
				nums[count] = nums[i];
			}
			System.out.print(count+" ");
		}
		for (int i = 0;i<len;i++) {
			System.out.print(nums[i]+" ");
		}
		return count+1;
	}
	public static void main(String[] args) {
		int[] test= new int[] {-2,-2,-1,0,1,2,2,3,3,4};
		RemoveFromSortArray so = new RemoveFromSortArray();
		System.out.println(so.removeDuplicates(test));
	}
}
