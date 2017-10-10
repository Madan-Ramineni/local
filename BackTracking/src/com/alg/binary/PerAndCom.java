package com.alg.binary;

public class PerAndCom {
	public static void binarySequence() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j <= 1; j++) {
				for (int k = 0; k <= 1; k++) {
					System.out.println(i + "" + j + "" + k);
				}

			}
		}
	}

	public static void binarySequence2(char[] in) {
		char out[] = new char[in.length];

		auxBinarySeq2(0, out, in);
	}
	//getting permutations for given string
	private static void auxBinarySeq2(int d, char[] out, char[] in) {

		if (d == in.length) {
			System.out.println(String.valueOf(out));
			return;
		}

		for (int j = 0; j < in.length; j++) {
			if (isValid(d, out, in[j])) {

				out[d] = in[j];
				auxBinarySeq2(d + 1, out, in);
			}
		}

	}

	public static void binarySequence3(char[] in) {
		char out[] = new char[in.length];

		auxBinarySeq3(0, out, in);
	}
	//getting all combinations for given string
	private static void auxBinarySeq3(int d, char[] out, char[] in) {

		if (d == in.length) {
			System.out.println(String.valueOf(out));
			return;
		}
		for (int j = 0; j < in.length; j++) {
			out[d] = in[j];
			auxBinarySeq3(d + 1, out, in);
		}

	}

	private static boolean isValid(int d, char[] out, char c) {
		for (int i = 0; i < d; i++) {
			if (out[i] == c) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String n = args[0];
		// binarySequence();
		binarySequence3(n.toCharArray());
	}
}
