package ds.queue;

public class Queue {
	
	private long items[];
	private int front;
	private int size;
	private int rear;
	private int itemsCount;
	
	public Queue(int size) {
		this.size = size;
		front = 0;
		itemsCount = 0;
		rear = -1;
		items = new long[size];
	}

	public void insert(long item) {
		rear++;
		itemsCount++;
		items[rear] = item;
	}
}
