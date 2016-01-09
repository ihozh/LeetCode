/********************************************************
  > File Name:17LetterCombOfPhoneNum.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Thu Jan  7 16:17:53 2016
 *********************************************************/
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
public class LetterCombOfPhoneNum {
	public List<String> letterCombinations(String digits) {
		int len = digits.length();
		HashMap<Integer,String> phoneMap = new HashMap<Integer, String>();
		phoneMap.put(2,"abc");
		phoneMap.put(3,"def");
		phoneMap.put(4,"ghi");
		phoneMap.put(5,"jkl");
		phoneMap.put(6,"mno");
		phoneMap.put(7,"pqrs");
		phoneMap.put(8,"tuv");
		phoneMap.put(9,"wxyz");
		phoneMap.put(0,"");
		List<String> answer = new ArrayList<String>();
		List<Character> temp = new ArrayList<Character>();
		if(digits == null || digits.length() == 0)
			return answer;
		dfs(digits,temp,answer,phoneMap);
		return answer;
	}
	public void dfs(String digits, List<Character> temp, List<String> answer, HashMap<Integer,String> map) {
		if(digits.length() == 0) {
			char[] arr = new char[temp.size()];
			for(int i =0;i<temp.size();i++) {
				arr[i] = temp.get(i);
			}
			answer.add(String.valueOf(arr));
			return;
		}
		Integer curr = Integer.valueOf(digits.substring(0,1));
		//Integer curra = Integer.valueOf(digits.charAt(0));
		//System.out.println(curr+" "+curra);
		String letters = map.get(curr);
		for(int i = 0;i<letters.length();i++){
			temp.add(letters.charAt(i));
			dfs(digits.substring(1),temp,answer,map);
			temp.remove(temp.size()-1);
		}
	}
	public static void main(String args[]) {
		LetterCombOfPhoneNum so = new LetterCombOfPhoneNum();
		System.out.println(so.letterCombinations("23"));
		System.out.println(so.letterCombinations("389"));
	}
}
