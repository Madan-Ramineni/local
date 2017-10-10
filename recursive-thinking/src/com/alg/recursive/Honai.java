package com.alg.recursive;

public class Honai {

	public static int count;

	// T.C O(2 power n) S.C O(n)
	public static void honai1(int n, char src, char aux, char tar) {
		if (n == 0) return;
		honai1(n - 1, src, tar, aux);
		count++;
		System.out.println(src + " -> " + tar);
		honai1(n - 1, aux, src, tar);
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		honai1(n, 'A', 'B', 'C');
		System.out.println(count);
	}
}
