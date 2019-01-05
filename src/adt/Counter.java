package adt;

public class Counter {

	private int count = 0;
	private String name = null;

	public Counter(String name) {
		this.name = name;
	}

	public void increment() {
		this.count++;
	}

	public int getCounter() {
		return this.count;
	}

	@Override
	public String toString() {
		return name + "= " + count;
	}
}
