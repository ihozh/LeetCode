/********************************************************
  > File Name:GenParent.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Fri Jan  8 17:17:42 2016
 *********************************************************/
import java.util.List;
import java.util.ArrayList;
public class GenParent {
	public List<String> generateParenthesis(int n) {
		List<String> answer = new ArrayList<String>();
		List<Character> temp = new ArrayList<Character>();
		if(n == 0)
			return answer;
		dfs(n,n,temp,answer); //n means how many left and right
		return answer;
	}
	public void dfs(int n,int nn,List<Character> temp,List<String> answer) {
		if(n == 0 && nn == 0) {
			char[] arr = new char[temp.size()];
			for(int i = 0;i<temp.size();i++) {
				arr[i] = temp.get(i);
			}
			answer.add(String.valueOf(arr));
			return;
		}
		if (n > 0) {   //if left > 0
			temp.add('(');
			dfs(n-1,nn,temp,answer); //left-1, but no change of right
			temp.remove(temp.size()-1);
		}
		if (nn > n) {  //if right >left
			temp.add(')');
			dfs(n,nn-1,temp,answer); //right-1, no change of left
			temp.remove(temp.size()-1);
		}
	}
	public static void main (String[] args) {
		GenParent so = new GenParent();
		System.out.println(so.generateParenthesis(4));
	}
}
