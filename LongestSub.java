import java.util.HashMap;
public class LongestSub{
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int subLen = 0;
        int maxSubLen = 0;
        int pos;
        char curr;
        StringBuffer subString = new StringBuffer();
        for (int i = 0;i<len;i++) {
            curr = s.charAt(i);
            pos = subString.toString().indexOf(curr);
            if (pos == -1 ) {
                subString.append(curr);
            } else {
                subLen = subString.toString().length();
                if (subLen>maxSubLen) {
                    maxSubLen = subLen;
                }
				subString.delete(0,pos+1);
				subString.append(curr);
            }
            if (i == len-1) {
				System.out.println(subString.toString());
                subLen = subString.toString().length();
                if (subLen>maxSubLen) {
                    maxSubLen = subLen;
                }
            }

        }
        return maxSubLen;

    }
    public int lengthOfLongestSubstringA(String s) {
        int len = s.length();
        int subLen = 0;
        int idx = -1;
        int max = 0;
		String tmp;
		char tmpChar;
        //int[] locs=new int[256];
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0;i<len;i++) {
			tmpChar = s.charAt(i);
			tmp = String.valueOf(tmpChar);

            if (!map.containsKey(tmp)) {
                map.put(tmp,-1);
            }

            if (map.get(tmp)>idx) {

                idx = map.get(tmp);
            }
            if (i-idx>max) {
                max = i-idx;
            }
			map.put(tmp,i);
        }
        return max;

    }
	public static void main(String[] args) {
		String test = "pwwkew";
		LongestSub so = new LongestSub ();
		int len = so.lengthOfLongestSubstring(test);
		System.out.println(len);
		len = so.lengthOfLongestSubstring(test);
		System.out.println(len);

	}
}
