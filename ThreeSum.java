/********************************************************
  > File Name:15ThreeSum.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Wed Jan  6 21:21:02 2016
 *********************************************************/
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		int len = nums.length;
		List<Integer> oneAnswer = new ArrayList<Integer>();
		List<List<Integer>> answer = new ArrayList<List<Integer>>();
		int a;
		//int b;
		//int c;
		for (int i = 0;i<len-2;i++) {
			if (i==0||nums[i]>nums[i-1]) {// avoid duplicate
				int start = i+1;
				int end = len-1;
				a = nums[i];
				while(start<end) {
					//System.out.println(start+" "+end);
					if (nums[start]+nums[end]+a == 0) {
						oneAnswer = new ArrayList<Integer>();
						oneAnswer.add(a);
						oneAnswer.add(nums[start]);
						oneAnswer.add(nums[end]);
						answer.add(oneAnswer);
						start++;
						end--;
						while (start<end&&nums[end]==nums[end+1]) {
							end--;
						}
						while (start<end&&nums[start]==nums[start-1]) {
							start++;
						}
					} else if (nums[start]+nums[end]+a>0) {
						end--;
					} else {
						start++;
					}
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		int[] test = new int[] {-5,14,1,-2,11,11,-10,3,-6,0,3,-4,-9,-13,-8,-7,9,8,-7,11,12,-7,4,-7,-1,-5,13,1,-2,8,-13,0,-1,3,13,-13,-1,10,5,1,-13,-15,12,-7,-13,-11,-7,3,13,1,0,2,1,11,10,8,-8,1,-14,-3,-6,-12,12,0,6,2,2,-9,-3,14,-1,-9,14,-4,-1,8,-8,7,-4,12,-14,3,-9,2,0,-13,-13,-1,3,-12,11,4,-9,8,11,5,-5,-10,3,-1,-11,-13,5,-12,-10,11,11,-3,-5,14,-13,-4,-5,-7,6,2,-13,0,8,-3,4,4,-14,2};
		//int[] test = new int[] {0,0,0};
		ThreeSum so = new ThreeSum();
		List<List<Integer>> answer = so.threeSum(test);
		System.out.println(answer);
	}
}
