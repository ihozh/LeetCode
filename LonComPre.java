/********************************************************
  > File Name:14LonComPre.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Wed Jan  6 17:15:09 2016
 *********************************************************/
public class LonComPre {
	public String longestCommonPrefix(String[] strs) {
		int strSize = strs.length;
		if (strSize == 0) {
			return "";
		}
		/*if (strSize == 1) {
			return strs[0];
		}*/
		int[] strLen = new int[strSize];
		for (int i = 0;i<strSize;i++) {
			strLen[i] = strs[i].length();
		}
		int idx = minStr(strLen,strSize);
		String minStr = strs[idx];
		int aflag = 0;
		String temp = "";
		String tcomPre = "";
		String comPre = "";
		int minStrSize = minStr.length();
		for (int i = 0;i<minStrSize;i++) {
			tcomPre = minStr.substring(0,minStrSize-i);
			System.out.println("host "+tcomPre);
			for (int j = 0;j<strSize;j++) {
				if ((j==idx)&&(j!=strSize-1)) {
					System.out.println(j);
					continue;
				}
				temp = strs[j].substring(0,minStrSize-i);
				System.out.println(j+" "+temp);
				if (!temp.equals(tcomPre)) {
					aflag = 1;
					break;
				}
				if (j==strSize-1) {
					aflag = 0;
					comPre = tcomPre;
				}
			}
			if (aflag == 0) {
				break;
			}

		}
		return comPre;
	}
	public int minStr(int[] a, int strSize) {
		int min = 0;
		int temp = 0;
		int idx = 0;
		for (int i = 0;i<strSize;i++) {
			if (i == 0) {
				temp = a[i];
			} else {
				if (a[i]<temp) {
					temp = a[i];
					idx = i;
				}
			}
		}
		return idx;
	}
	public static void main(String[] args) {
		String[] test = new String[] {""};
		LonComPre so = new LonComPre();
		String answer = so.longestCommonPrefix(test);
		System.out.println("answer"+answer);
	}
}
