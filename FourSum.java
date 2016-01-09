/********************************************************
  > File Name:18FourSum.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Thu Jan  7 17:58:41 2016
 *********************************************************/
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
//import java.util.Collections;

public class FourSum {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		int len = nums.length;
		List<Integer> oneAnswer = new ArrayList<Integer>();
		List<List<Integer>> answer = new ArrayList<List<Integer>>();
		int first;
		int second;
		int left;
		int right;    //four pointers.
		int flaga = 0;    //denote first in duplicate condition
		for (first = 0;first<len-3;first++) {
			if (first == 0||nums[first]>nums[first-1]) {
				flaga = 0;
				for (second = first+1;second<len-2;second++) {
					//System.out.println(first+" "+second);
					if (flaga == 0||nums[second]>nums[second-1]) {
						flaga = 1;
						left = second+1;
						right = len-1;
						while(left<right) {
							if(nums[first]+nums[second]+nums[left]+nums[right] == target) {
								oneAnswer = new ArrayList<Integer>();
								oneAnswer.add(nums[first]);
								oneAnswer.add(nums[second]);
								oneAnswer.add(nums[left]);
								oneAnswer.add(nums[right]);
								answer.add(oneAnswer);
								left++;
								right--;
								while (left<right&&nums[right]==nums[right+1]) {
									right--;
								} 
								while (left<right&&nums[left]==nums[left-1]) {
									left++;
								} //avoid duplicate
							} else if (nums[left]+nums[right]+nums[first]+nums[second]>target) {
								right--;
							} else {
								left++;
							}
						}
					}
				}
			} else {
				flaga = 1;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		FourSum so = new FourSum();
		int[] test = new int[] {1,0,-1,0,-2,2};
		int[] test2 = new int[] {-1,0,1,2,-1,-4};
		int[] test3 = new int[] {-3,-2,-1,0,0,1,2,3};
		System.out.println(so.fourSum(test3,0));
	}
}
