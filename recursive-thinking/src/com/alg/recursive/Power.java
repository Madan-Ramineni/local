package com.alg.recursive;

public class Power {

	public static int power1(int x, long n) {
		int res = 1;
		for (int i = 0; i < n; i++)
			res = res * x;
		return res;
	}

	public static int power(int x, long n) {
		if (n == 1)
			return x;
		if (n == 0)
			return 1;
		int pow = power(x, n / 2);
		if (n % 2 == 0)
			return pow * pow;
		else
			return pow * pow * x;
	}
	
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		long n = Integer.parseInt(args[1]);
		System.out.println(power(x, n));
		System.out.println(power1(x, n));

	}

}
