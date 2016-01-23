/********************************************************
  > File Name:36 ValidSudoku.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Fri Jan 22 19:55:20 2016
 *********************************************************/

import java.util.ArrayList;

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		boolean col = checkCol(board);
		boolean row = checkRow(board);
		boolean sq = checkSq(board);
		if (col == true && row == true && sq == true) {
			return true;
		} else {
			return false;
		}
	}
	public boolean checkCol(char[][] board) {
		ArrayList<Character> ele = new ArrayList<Character>();
		for (int i = 0;i<board.length;i++) {
			for (int j = 0;j<board.length;j++){
				if (board[j][i] == '.') {
					continue;
				}
				if (ele.indexOf(board[j][i]) != -1) {
					return false;
				} else {
					ele.add(board[j][i]);
				}
			}
			ele.removeAll();
		}
		return true;
	}
	public boolean checkRow(char[][] board) {
		ArrayList<Character> ele = new ArrayList<Character>();
		for (int i = 0;i<board.length;i++) {
			for (int j = 0;j<board.length;j++) {
				if (board[i][j] == '.') {
					continue;
				}
				if (ele.indexOf(board[i][j]) != -1) {
					return false;
				} else {
					ele.add(board[i][j]);
				}
			}
			ele.removeAll();
		}
		return true;
	}
	public boolean checkSq(char[][] board) {
		ArrayList<Character> ele = new ArrayList<Character>();
		for (int i = 0;i<board.length/3;i=i+3) {
			for (int j = 0;j<board.length/3;j=j+3) {
				for (int m  = 0;m<3;m++) {
					for (int n = 0;n<3;n++) {
						if (board[i+m][j+n] == '.') {
							continue;
						}
						if (ele.indexOf(board[i+m][j+n]) != -1) {
							return false;
						} else {
							ele.add(boardi[i+m][j+n]);
						}
					}
				}
				ele.removeAll();
			}
		}
		return true;
	}
	public static void main(String[] args) {
		ValidSudoku so = new ValidSudoku();
		String[] test = {".87654321","2........","3........","4........","5........","6........","7........","8........","9........"};
		System.out.println(so.isValidSudoku(test));
	}
}
