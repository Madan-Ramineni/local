package com.alg.randombinarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class RBinaryTree {

	static BTreeNode root;

	public static void add(int data) {
		BTreeNode current = root;
		while (true) {
			if (Math.random() >= 0.5) {
				if (current.left == null) {
					current.left = new BTreeNode(data);
					break;
				} else {
					current = current.left;
				}
			} else {
				if (current.right == null) {
					current.right = new BTreeNode(data);
					break;
				} else {
					current = current.right;
				}
			}

		}
	}

	public static void RandomTree(int n) {
		Random r = new Random(n);
		for (int i = 0; i < n; i++) {
			int tmp = r.nextInt(n);
			if (root == null)
				root = new BTreeNode(tmp);
			else
				add(tmp);
		}
	}

	public static void display() {
		Queue<BTreeNode> queue = new LinkedList<BTreeNode>();
		queue.add(root);
		queue.add(null);
		while (!queue.isEmpty()) {
			BTreeNode current = queue.remove();
			if (current == null) {
				System.out.println();
				if (!queue.isEmpty())
					queue.add(null);
			} else {
				System.out.print(current.data + " ");
				if (current.left != null)
					queue.add(current.left);
				if (current.right != null)
					queue.add(current.right);
			}
		}
	}
}
