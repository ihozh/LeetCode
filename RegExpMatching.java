/********************************************************
  > File Name:RegExpMatching.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Mon Jan  4 20:44:24 2016
 *********************************************************/

public class RegExpMatching{
	public boolean isMatch(String s,String p) {
		if (p.length() == 0) {
			return s.length() == 0;
		}
		
		if (p.length() == 1) {
			if (s.length() < 1) {
				return false;
			} else if ((p.charAt(0) != s.charAt(0)) && (p.charAt(0) != '.')) {
				return false;
			} else {
				return isMatch(s.substring(1),p.substring(1));
			}
		}
		//case 1: 2nd char of p is not '*'
		if (p.charAt(1) != '*') {
			if (s.length() < 1) {
				return false;
			} else if ((s.charAt(0) != p.charAt(0)) && (p.charAt(0) != '.')) {
				return false;
			} else {
				return isMatch(s.substring(1),p.substring(1));
			}
		}
		//case 2: 2nd char of p is '*'
		else {
			if (isMatch(s,p.substring(2))) {
				return true;
			}
		}
		int i = 0;
		while (i<s.length() && (s.charAt(i) == p.charAt(0) || p.charAt(0) == '.')) {
			System.out.println(s);
			if (isMatch(s.substring(i+1),p.substring(2))) {
				return true;
			}
			i++;
		}
		return false;
	}
	public static void main (String[] args) {
		String test1 = "aaba";
		String test2 = "ab*a*c*a";
		RegExpMatching so = new RegExpMatching();
		boolean answer = so.isMatch(test1,test2);
		System.out.println(answer);
	}
}
