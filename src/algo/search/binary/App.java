package algo.search.binary;

public class App<T> {

	public static Boolean search(int a[], int x) {
		Boolean found = Boolean.FALSE;
		int low = 0;
		int high = a.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (a[mid] == x) {
				found = Boolean.TRUE;
				break;
			} else if (a[mid] < x) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return found;
	}

	public static void main(String[] args) {
		int a[] = {1,4,7,9,12,35,45};
		System.out.println(search(a, 8));
	}

}
