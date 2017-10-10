package com.alg.radix;

import java.util.LinkedList;
import java.util.List;

public class TernarySearchTree implements ITrie {

	private TSTNode root;
	private int size;

	@Override
	public void add(String word) {
		TSTNode tmp = auxAdd(root, word);
		if (root == null) {
			root = tmp;
		}

	}

	private TSTNode auxAdd(TSTNode root, String word) {
		if (root == null) {
			root = new TSTNode(word.charAt(0));
		}

		int i = 0;

		if (root.data > word.charAt(i)) {
			root.left = auxAdd(root.left, word);
		} else if (root.data < word.charAt(i)) {
			root.right = auxAdd(root.right, word);
		} else if (root.data == word.charAt(i)) {
			if (word.length() == 1) {
				root.isWord = true;
				return root;
			}
			root.middle = auxAdd(root.middle, word.substring(1));

		}
		return root;
	}

	@Override
	public boolean remove(String word) {
		return false;
	}

	@Override
	public boolean contains(String word) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public LinkedList<String> autocomplete(String prefix) {
		TSTNode current = root;
		int i = 0;

		while (current != null) {
			
			if (current.data == prefix.charAt(i)) {
				current = current.middle;
				if (prefix.length() - 1 == i)
					break;
				
				i++;
			} else if (current.data < prefix.charAt(i)) {
				current = current.right;
			} else if (current.data > prefix.charAt(i)) {
				current = current.left;
			}
		}
		LinkedList<String> words = new LinkedList<>();
		
		if(current.isWord) words.add(prefix);
			auxDisplay(current, prefix, words);
		
		return words;
	}

	private void auxDisplay(TSTNode root, String word, LinkedList<String> words) {

		if (root == null)
			return;
		auxDisplay(root.left, word, words);
		if (root.isWord) {
			words.add(word + root.data);
		}

		auxDisplay(root.middle, word + root.data, words);
		auxDisplay(root.right, word, words);

	}

	@Override
	public void display() {
		LinkedList<String> words = new LinkedList<>();
		auxDisplay(root, "", words);
		System.out.println(words);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
