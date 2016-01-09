/********************************************************
  > File Name:16ThreeSumClosest.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Wed Jan  6 21:21:02 2016
 *********************************************************/
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class ThreeSumClosest {
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int len = nums.length;
		int a;
		int temp;
		int answer = target - (nums[0]+nums[1]+nums[len-1]);
		int sum;
		int[] best = new int[]{nums[0],nums[1],nums[len-1]};
		//int b;
		//int c;
		for (int i = 0;i<len-2;i++) {
			if (i==0||nums[i]>nums[i-1]) {
				int start = i+1;
				int end = len-1;
				a = nums[i];
				while(start<end) {
					//System.out.println(start+" "+end);
					sum = nums[start]+nums[end]+a;
					temp = target-sum;
					if (Math.abs(temp)<Math.abs(answer)) {
						answer = temp;
						best[0] = a;
						best[1] = nums[start];
						best[2] = nums[end];
					}
					if (temp == 0) {
						answer = 0;
						return best[0]+best[1]+best[2];
					} else if (temp<0) {
						end--;
					} else {
						start++;
					}
				}
			}
		}
		return best[0]+best[1]+best[2];
	}
	public static void main(String[] args) {
		int[] test = new int[] {0,1,2};
		int target = 3;
		//int[] test = new int[] {0,0,0};
		ThreeSumClosest so = new ThreeSumClosest();
		int answer = so.threeSumClosest(test,target);
		System.out.println(answer);
	}
}
