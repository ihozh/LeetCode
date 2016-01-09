/********************************************************
  > File Name:20ValidParentheses.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Fri Jan  8 01:26:57 2016
 *********************************************************/
import java.util.Stack;
public class ValidParentheses {
	public boolean isValid(String s) {
		Stack<Character> pa = new Stack<Character>();
		int len = s.length();
		char temp;
		char patemp=0;
		if (len%2==1){
			return false;
		}
		for (int i = 0; i<len; i++) {
			temp = s.charAt(i);
			if (pa.empty() != true) {
				patemp = pa.peek();
			}
			if (temp == '(' || temp == '[' || temp == '{') {
				pa.push(temp);
			} else if((int)temp-(int)patemp>3){
				return false;
			} else {
				pa.pop();
			}
		}
		if (pa.empty() == true) {
			return true;
		} else
			return false;
	}
	public static void main(String[] args) {
		ValidParentheses so = new ValidParentheses();
		System.out.println(so.isValid("{}[]()"));
		System.out.println(so.isValid(""));
		System.out.println(so.isValid(")("));
		System.out.println(so.isValid("([)]"));
	}
}
