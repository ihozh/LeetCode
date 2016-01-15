/********************************************************
  > File Name:27 RemoveElement.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Fri Jan 15 10:57:04 2016
 *********************************************************/

public class RemoveElement {
	public int removeElement(int[] nums,int val) {
		int count = 0;
		int len = nums.length;
		for (int i = 0;i<len;i++) {
			if (nums[i] != val) {
				nums[count] = nums[i];
				count++;
			}
		}
		return count;
	}
    public static void main(String[] args) {
        int[] test= new int[] {-2,-2,-1,0,1,2,2,3,3,4};
        RemoveElement so = new RemoveElement();
        System.out.println(so.removeElement(test,0));
    }
}
