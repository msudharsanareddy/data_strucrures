package ds.linkedlist;

public class LinkedList<T extends Comparable<T>> implements List<T> {

	private Node<T> first = null;
	private Node<T> last = null;
	private int sizeOfList = 0;

	public LinkedList() {

	}

	@Override
	public void insertFirst(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.setNextNode(first);
		last = first;
		first = newNode;
		sizeOfList++;
	}
	
	
	@Override
	public void insertLast(T data) {
		Node<T> current = first;
		while(current.getNextNode() != null) {
			current = current.getNextNode();
		}
		Node<T> newNode = new Node<>();
		newNode.setData(data);
		current.setNextNode(newNode);
		sizeOfList++;
		
	}
	@Override
	public Node<T> deleteFirst() {
		Node<T> temp = first;
		first = first.getNextNode();
		sizeOfList--;
		return temp;
		
	}
	
	@Override
	public void displayList() {
		Node<T> current = first;
		while(current != null) {
			System.out.println(current);
			current = current.getNextNode();
		}
	}

	@Override
	public boolean remove(T data) {

		return false;
	}

	@Override
	public Node<T> getHeadNode() {
		return this.first;
	}

	@Override
	public void traverList() {

	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return first == null;
	}
}
