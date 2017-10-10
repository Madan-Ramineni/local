package com.alg.binary;

import java.util.Arrays;

public class BinarySequence {
	public static void binarySequence() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j <= 1; j++) {
				for (int k = 0; k <= 1; k++) {
					System.out.println(i + "" + j + "" + k);
				}

			}
		}
	}

	public static void binarySequence2(int n) {
		int out[] = new int[n];

		auxBinarySeq(0, n, out);
	}

	private static void auxBinarySeq(int d, int n, int[] out) {

		if (d == n) {
			System.out.println(Arrays.toString(out));
			return;
		}
		for (int j = 0; j <= 1; j++) {
			out[d] = j;
			auxBinarySeq(d + 1, n, out);

		}

	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		binarySequence();
		binarySequence2(n);
	}
}
