package com.alg.sudoku;

public class SudokuSolver {

	public static void sudokusolver1(int[][] in) {

		auxsudokusolver(in, 0, 0);

	}

	private static void auxsudokusolver(int[][] in, int r, int c) {
		if (r == 9) {
			display(in);
			return;
		}
		if (in[r][c] != 0) {
			auxsudokusolver(in, c == 8 ? r + 1 : r, (c + 1) % 9);
		} else {
			for (int i = 1; i <= 9; i++) {

				if (!isValidate(in, i, r, c)) {
					in[r][c] = i;
					auxsudokusolver(in, c == 8 ? r + 1 : r, (c + 1) % 9);
				}
			}
			in[r][c] = 0;
		}
	}

	private static boolean isValidate(int[][] in, int i, int r, int c) {
		for (int j = 0; j < in.length; j++) {
			if (in[r][j]==i) {
				return true;
			}
			if (in[j][c]==i) {
				return true;
			}
		}
		int sr = (r/3) *3;
		int sc = (c/3) *3;
		for (int j = 0; j < 3; j++) {
			for (int k = 0; k < 3; k++) {
				if(in[sr+j][sc+k]==i) return true;
			}
		}
		
		return false;
	}

	public static void display(int[][] in) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(in[i][j] +" " );
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		//int[][] in =new int[9][9];
		int[][] in = { { 0, 9, 0, 0, 0, 0, 0, 0, 8 }, 
				{ 0, 0, 3, 2, 0, 7, 0, 9, 0 }, 
				{ 0, 6, 0, 0, 0, 0, 7, 0, 0 },
				{ 0, 0, 0, 0, 0, 1, 0, 0, 6 }, 
				{ 0, 0, 5, 4, 3, 2, 1, 0, 0 }, 
				{ 4, 0, 0, 7, 0, 0, 0, 0, 0 },
				{ 0, 0, 7, 0, 0, 0, 0, 3, 0 }, 
				{ 0, 2, 0, 9, 0, 8, 6, 0, 0 }, 
				{ 1, 0, 0, 0, 0, 0, 0, 4, 0 } };

		sudokusolver1(in);
	}
}
