package ds.linkedlist;

public interface List<T extends Comparable<T>> {

	public void insertFirst(T data);
	public boolean remove(T data);
	public void traverList();
	public int size();
	Node<T> getHeadNode();
	boolean isEmpty();
	Node<T> deleteFirst();
	void displayList();
	void insertLast(T data);
}
