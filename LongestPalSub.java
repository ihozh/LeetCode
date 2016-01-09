/********************************************************
  > File Name:LongestPalSub.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Tue Dec 29 21:51:50 2015
 *********************************************************/
import java.util.Stack;
public class LongestPalSub {
	public String longestPalindrome(String s) {
        int len = s.length();
        if (len == 1) {
            return s;
        }
        int idxHead;
        int idxTail;
        String sub = "";
        String maxSub = "";
        int subLen = 0;
        int subMax = 0;
        
        for (int i=0;i<len;i++) {
            idxHead = i-1;
            idxTail = i+1;
            while (idxTail < len && s.charAt(idxTail)==s.charAt(i)) {
                idxTail++;
            }
            while(idxTail < len && idxHead >= 0&& s.charAt(idxTail)==s.charAt(idxHead)) {
                idxTail++;
                idxHead--;
            }
            if(idxTail - (idxHead + 1) == len)
                return s;
            
            sub = s.substring(idxHead+1, idxTail);
            subLen = sub.length();
            if (subLen>subMax) {
                subMax = subLen;
                maxSub = sub;
            }
            
        }
        return maxSub;
	}
	public static void main(String[] args) {
		String test = "abccba";
		LongestPalSub so = new LongestPalSub();
		String sub;
		sub = so.longestPalindrome(test);
		System.out.println(sub);
		sub = so.secondSolution(test);
		System.out.println(sub);
	}
}
