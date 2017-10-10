package com.alg.recursivewithdp;

public class NthFibonacci {
	private static int fib1(int n) {
		if (n <= 2)
			return 1;
		int pre1 = fib1(n - 1);
		int pre2 = fib1(n - 2);
		return pre1 + pre2;

	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		System.out.println(fib1(n));
	}

}
