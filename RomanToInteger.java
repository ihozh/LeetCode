/********************************************************
  > File Name:RomanToInteger.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Wed Jan  6 16:25:12 2016
 *********************************************************/
public class RomanToInteger {
	public int romanToInt(String s) {
		//int[] val = new int[] {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		//String[] r = new String[] {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int[] val = new int[] {1000,500,100,50,10,5,1};
		String r = "MDCLXVI";
		int len = s.length();
		int last = val[r.indexOf(s.charAt(0))];
		int curr;
		int answer = last;
		int idx;
		for (int i =1;i<len;i++) {
			idx = r.indexOf(s.charAt(i));
			curr = val[idx];
			if (curr>last) {
				answer = answer + curr - last - last;
			} else {
				answer = answer + curr;
			}
			last = curr;
		}
		return answer;
	}
	public static void main(String[] args) {
		String test = "MCMXCVI";
		RomanToInteger so = new RomanToInteger();
		int answer = so.romanToInt(test);
		System.out.println(answer);
	}
}
