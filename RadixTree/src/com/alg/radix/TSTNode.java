package com.alg.radix;

public class TSTNode {

	char data;
	boolean isWord;
	TSTNode left, middle, right;

	public TSTNode(char data) {
		this.data = data;
		middle = left = right = null;
		isWord = false;
	}
}
