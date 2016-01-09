/********************************************************
  > File Name:ContainerWithMostWater.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Wed Jan  6 14:26:38 2016
 *********************************************************/

public class ContainerWithMostWater {
	public int maxArea(int[] height) {
		int len = height.length;
		int maxWater = 0;
		int left = 0;
		int right = len-1;
		while (left != right) {
			maxWater = Math.max(maxWater,(right-left)*Math.min(height[left],height[right]));
			if (height[left]>height[right]) {
				right--;
			} else {
				left++;
			}
		}
		return maxWater;
	}
	public static void main(String args[]) {
		int[] test = new int[]{2,1,3,4,6,7,1,3};
		ContainerWithMostWater so = new ContainerWithMostWater();
		int answer = so.maxArea(test);
		System.out.println(answer);
	}
}
