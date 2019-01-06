package algo.search.linear;

public class App {

	public static int search(int a[], int x) {
		int result = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				result = i;
				break;
			}
		}
		return result;

	}

	public static void main(String[] args) {

	}
}
