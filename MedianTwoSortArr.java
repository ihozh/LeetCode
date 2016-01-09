/********************************************************
  > File Name:MedianTwoSortArr.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Fri Dec 18 13:43:26 2015
 *********************************************************/
import java.lang.Math;
import java.util.Arrays;
public class MedianTwoSortArr {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		int sumLen = m+n;
		if ((sumLen&0x1) == 1)
			return getMedian(nums1, m, nums2, n, sumLen/2+1);
		else
			return (getMedian(nums1, m, nums2, n, sumLen/2)+getMedian(nums1, m, nums2, n, sumLen/2+1))/2;
	}
	public double getMedian(int[] nums1,int m,int[] nums2,int n,int k) {
		if (m > n) {
			System.out.println("a");
			return getMedian(nums2,n,nums1,m,k);
		}
		if (m == 0) {
			System.out.println(nums2[k-1]);
			return nums2[k-1];
		}
		if (k <= 1)
			return Math.min(nums1[0],nums2[0]);
		int pa = Math.min(k/2,m);
		int pb = k-pa;
		if (nums1[pa-1]<nums2[pb-1])
			return getMedian(Arrays.copyOfRange(nums1,pa,m),m-pa,nums2,n,k-pa);
		else if (nums1[pa-1]>nums2[pb-1])
			return getMedian(nums1,m,Arrays.copyOfRange(nums2,pb,n),n-pb,k-pb);
		else
			return nums1[pa-1];
	}
	public static void main(String[] args) {
		int [] nums1 = {2,3,4,5,6,7};
		int [] nums2 = {};
		MedianTwoSortArr so = new MedianTwoSortArr();
		double answer;
		answer = so.findMedianSortedArrays(nums1,nums2);
		System.out.println(answer);
	}
}
