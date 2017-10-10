package pqueue;

public interface IPQueue {
	Integer findMin();
	Integer removeMin();
	void display();
	int size();
	boolean isEmpty();
	void add(Integer e);
}
