package ds.doubley.linkedlist;

public class DoublyLinkedList<T extends Comparable<T>> {

	private Node<T> first;
	private Node<T> last;
	private int listSize;

	public boolean isEmplty() {
		return first==null;
	}
	
	public void insertFirst(T data) {
		Node<T> newNode = new Node<T>();
		newNode.setData(data);
		
		if(isEmplty()) {
			last = newNode;
		}
		
	}
}
