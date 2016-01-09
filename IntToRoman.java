/********************************************************
  > File Name:IntToRoman.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Wed Jan  6 15:23:31 2016
 *********************************************************/
 
public class IntToRoman {
	public String intToRoman(int num) {
		StringBuffer answer = new StringBuffer();
		int[] val = new int[] {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] r = new String[] {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int ro = num;
		int i = 0;
		while(ro>0) {
			while (ro>=val[i]) {
				answer.append(r[i]);
				ro = ro-val[i];
			}
			i++;
		}
		return answer.toString();

	}
	public static void main(String args[]) {
		int test = 0;
		IntToRoman so = new IntToRoman();
		String answer = so.intToRoman(test);
		System.out.println(answer);
	}
}
