package com.CalkinWilftree;

public class TestCWTree {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		CWTree.constructTree(n);
		CWTree.display();
	}
}
