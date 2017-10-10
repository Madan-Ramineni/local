package com.alg.randombinarytree;

public class BTreeNode {

	Integer data;
	BTreeNode left;
	BTreeNode right;

	public BTreeNode(Integer data, BTreeNode left, BTreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public BTreeNode() {

	}

	public BTreeNode(int data) {
		this.data = data;
	}

}
