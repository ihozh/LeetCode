/********************************************************
  > File Name:StrToInt.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Sun Jan  3 13:11:02 2016
 *********************************************************/

public class StrToInt {
	public int myAtoi(String str) {
		if (str == null||str.length()<1) {
			return 0;
		}
		str = str.trim();
		double result = 0;
		char sign = '+';
		int i = 0;
		if(str.charAt(0)=='-') {
			sign = '-';
			i++;
		} else if (str.charAt(0)=='+') {
			i++;
		}
		while (str.length()>i&&str.charAt(i)>='0'&&str.charAt(i)<='9') {
			result = result*10 + (str.charAt(i)-'0');
			i++;
		}
		if (sign == '-') {
			result = -result;
		}
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		if (result > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		else if (result < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		return (int) result;

	}
	public static void main(String[] args) {
		String test = "9223372036854775809";
		StrToInt so = new StrToInt();
		int answer;
		answer = so.myAtoi(test);
		System.out.println(answer);
	}
}
