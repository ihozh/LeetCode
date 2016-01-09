/********************************************************
  > File Name:PalindromeNum.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Sun Jan  3 16:19:09 2016
 *********************************************************/

public class PalindromeNum {
	public boolean isPalindrome(int x) {
		int y = reverse(x);
		if (y==x) {
			return true;
		} else {
			return false;
		}
	}
	public int reverse(int x) {
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		double answer = 0;
		int curr = x;
		int res;
		while (curr!=0) {
			res = curr%10;
			answer = answer*10 + res;
			curr = curr/10;
		}
		if (answer>max || answer<min) {
			answer = 0;
		}
		return (int) answer;
	}
	public static void main(String[] args) {
		int test = -2147447412;
		PalindromeNum so = new PalindromeNum();
		boolean answer = so.isPalindrome(test);
		System.out.println(answer);

	}
}
