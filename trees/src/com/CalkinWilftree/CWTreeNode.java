package com.CalkinWilftree;

public class CWTreeNode {
	RationalNumber data;
	CWTreeNode left;
	CWTreeNode right;

	public CWTreeNode(RationalNumber data, CWTreeNode left, CWTreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public CWTreeNode() {

	}

	public CWTreeNode(RationalNumber data) {
		this.data = data;
	}
}
