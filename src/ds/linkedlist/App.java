package ds.linkedlist;

public class App {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.insertFirst("sudh");
		list.insertFirst("renu");
		list.insertFirst("harsh");
		list.insertLast("reddy");
		list.displayList();

	}

	public static void print(Node<String> node) {
		while (node != null) {
			System.out.println(node.getData());
			node = node.getNextNode();
		}
	}

}
