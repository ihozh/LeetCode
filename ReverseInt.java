/********************************************************
  > File Name:ReverseInt.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Wed Dec 16 10:20:11 2015
 *********************************************************/

public class ReverseInt {
	public int reverse(int x) {
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		long answer = 0;
		int curr = x;
		int res;
		int base = 10;
		while (curr!=0) {
			res = curr%10;
			answer = answer*10 + res;
			curr = curr/10;
		}
		if (answer>max || answer<min) {
			answer = 0;

		}

		return (int)answer;
	}

	public static void main(String[] args) {
		int test1 = -1000000003;
		ReverseInt so = new ReverseInt();
		int answer = so.reverse(test1);
		System.out.println(answer);
	}
}
