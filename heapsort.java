/*Heapsort:java implementation*/ /*not stable, heap construction <=2N compares and exchanges. heapsort <=2NlgN compares and exchanges*/
public class Heap {
	public static void sort (Comparable[] a) {
		int N = a.length;
		for(int k = N/2; k >= 1 ; k--)
			sink(a, k, N);
		while (N > 1) {
			exch(a, 1, N);
			sink(a, 1, --N);
		}
	}
	private static void sink(Comparable[] a, int k, int N) {
		while (2*k <= N) {
			int j = 2*k;
			if(j < N && less (j, j+1)) j++;
			if (!less(k,j)) break;
			exch(k,j);	
			k = j;
		}
	}
	private boolean less( Comparable[] a, int i, int j) { //convert from 1-basedindexing to 0-based indexing
		return a[i-1].compareTo(a[j-1] < 0;
	}
	private void exch ( Comparable[] a, int i, int j) {
		Key t = a[i-1]; // Key is the data type of a[]
		a[i-1] = a[j-1];
		a[j-1] = t;
	}
}
