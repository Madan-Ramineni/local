package com.alg.radix;

import java.util.List;

public interface ITrie {

	void add(String word);
	boolean remove(String word);
	boolean contains(String word);
	void display();
	int size();	
	
	List<String> autocomplete(String prefix);
}
