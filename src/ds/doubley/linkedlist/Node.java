package ds.doubley.linkedlist;

public class Node<T extends Comparable<T>> {
	private T data;
	private Node<T> nextNode;
	private Node<T> previousNode;

	public Node() {

	}

	public Node(T data) {
		this.data = data;
		setNextNode(null);
	}

	public Node<T> getNextNode() {
		return this.nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	public T getData() {
		return this.data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(Node<T> previousNode) {
		this.previousNode = previousNode;
	}

	@Override
	public String toString() {
		return String.valueOf(data);
	}

}