package com.CalkinWilftree;

import java.util.LinkedList;
import java.util.Queue;

public class CWTree {
	static CWTreeNode root;

	public static void constructTree(int n) {

		for (int i = 0; i < n; i++) {
			if (root == null) {
				root = new CWTreeNode(new RationalNumber(1, 1));
			} else
				addingLevel(root, root);
		}
	}

	public static void addingLevel(CWTreeNode current, CWTreeNode prv) {
		if (prv.left == null) {
			prv.left = new CWTreeNode(
					new RationalNumber(prv.data.getNumerator(), prv.data.getDenominator() + prv.data.getNumerator()));
			return;
		}
		if (prv.right == null) {
			prv.right = new CWTreeNode(
					new RationalNumber(prv.data.getDenominator() + prv.data.getNumerator(), prv.data.getDenominator()));
			return;
		}
		addingLevel(current.left, current);
		addingLevel(current.right, current);
	}

	public static void display() {
		Queue<CWTreeNode> queue = new LinkedList<CWTreeNode>();
		queue.add(root);
		queue.add(null);
		while (!queue.isEmpty()) {
			CWTreeNode current = queue.remove();
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
