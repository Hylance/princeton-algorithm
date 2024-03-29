//Binary Search: Java implementation
public Value get(Key key) {
	if (isEmpty()) return null;
	int i = rank(key);
	if (i < N && keys[i].compareTo(key) == 0 ) return vals[i];
	else return null;
}
private int rank(Key key) {
	int lo = 0; hi = N-1;
	while (lo <= hi) {
		int mid = lo + (hi - lo)/2;
		int cmp = key.compareTo(keys[mid]);
		if (cmp < 0) hi = mid -1;
		if (cmp > 0) lo = mid +1;
		else return mid;
	}
	return lo;
} //if there is no key in keys[], return the position to insert key.

