package ds.stack;

public class Stack {

	private int top;
	private int maxSize;
	private long data[];

	public Stack(int size) {
		this.maxSize = size;
		top = -1;
		data = new long[maxSize];
	}

	public void push(long value) throws Exception {
		if (isFull()) {
			throw new Exception("stack is full");
		}
		top++;
		data[top] = value;
	}

	public long pop() throws Exception {

		long val = 0;
		if (isEmpty()) {
			throw new Exception("stack is empty");
		} else {
			val = data[top];
		}
		top--;
		return val;
	}

	public long peak() {
		return data[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return maxSize - 1 == top;
	}

}
