/*priority queue: unordered array implementation,return the max in queue*/
public class UnorderedMaxPQ<Key extends Comparable<Key> > {
	private Key[] pq;
	private int N;
	public UnorderedMaxPQ(int capacity) {
		pq = (Key[]) new Comparable[capacity];
	}
	public boolean isEmpty() {
		return N == 0;
	}
	public void insert(Key x) {
		pq[N++] = x;
	}
	public Key delMax() {
		int max = 0;
		for (int i = 0; i < N; i++)
			if (less(max,i) max = i;
		exch(max, N-1);
		return pq[--N];
	}
}
/*priority queue: Binary heap implementation*/
public class MaxPQ<Key extends Comparable<Key>> {
	private Key[] pq;
	private int N;
	public MaxPQ(int capacity) {
		pq = (Key[]) new Comparable[capacity+1]; //we don't use pq[0]
	}
	public boolean isEmpty() {  //PQ ops
		return N == 0;
	}
	public void  insert(Key key) {
		pq[++N] = key;
		swim(N);
	}
	public Key delMax() {
		Key max = pq[1];
		exch(1, N--);
		sink(1);
		pq[N+1] = null; //prevent loitering
		return max;
	}
	private void swim(int k) {  //heap helper functions
		while (k > 1 && less(k/2, k) {
			exch(k, k/2);
			k = k/2;
		}
	}
	private void sink (int k) {
		while (2*k <= N) {
			int j = 2*k;
			if(j < N && (j, j+1)) j++;
			if(!less(k,j)) break;
			exch(k, j);
			k = j;
		}
	}
	private boolean less(int i, int j) {  //array helper functions
		return pq[i].compareTo(pq[j] < 0;
	}
	private void exch(int i, int j) {
		Key t = pq[i];
		pq[i] = pq[j];
		pq[j] = t;
	}

