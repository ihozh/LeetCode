/********************************************************
  > File Name:29 DivideTwoInt.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Mon Jan 18 18:42:02 2016
 *********************************************************/

public class DivideTwoInt {
	public int divide(int dividend, int divisor) {
		if (divisor == 0)
			return Integer.MAX_VALUE;
		int res = 0;
		if(dividend == Integer.MIN_VALUE) {
			res = 1;
			dividend += Math.abs(divisor);
			if (divisor == -1) {
				return Math.abs(Integer.MAX_VALUE);
			}
		}
		if(divisor == Integer.MIN_VALUE) {
			return res;
		}
		boolean isNeg = ((dividend^divisor)>>>31 == 1)? true:false;
		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);
		int digit = 0;
		while(divisor<=(dividend>>1)) {
			divisor <<= 1;
			digit++;
		}
		while (digit>=0) {
			if(dividend>=divisor) {
				dividend -= divisor;
				res += 1<<digit;
			}
			divisor >>= 1;
			digit--;
		}
		return isNeg?-res:res;
	}
	public static void main (String[] args) {
		DivideTwoInt so = new DivideTwoInt();
		int a = Math.abs(Integer.MIN_VALUE);
		int b = Integer.MAX_VALUE;
		System.out.println(so.divide(-2147483648,-1));
	}
}
