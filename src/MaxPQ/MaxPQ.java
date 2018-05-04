package MaxPQ;        //基于二叉堆的优先队列实现

public class MaxPQ<Key extends Comparable<Key>>{
	private Key[] pq;
	private int N= 0;
	public MaxPQ(int maxN){
		pq =(Key[]) new Comparable[maxN+1];
	}
	public boolean isEmpty() {
		return N==0;
	}
	public int size() {
		return N;
	}
	public void insert(Key key) {
		pq[++N] =key;
		swim(N);
	}
	
	public Key delMax() {
		Key re =pq[1];
		exch(1,N);
		pq[N] =null;
		N--;
		sink(1);
		return re;
	}
	
	private void sink(int k) {
		while (2*k<=N) {
			int j =2*k;
			if (less(j,j+1)) {
				j=j+1;
			}
			if (!less(k,j)) {
				break;
			}
			else {
				exch(k,j);
				k = j;
			}
		}
	}
	private void swim(int k) {
		while (k>1&&less(k/2,k)) {
			exch(k/2,k);
			k =k/2;
		}	
	}
	private void exch(int i, int j) {
		Key key = pq[i];
		pq[i] = pq[j];
		pq[j] = key;	
	}
	private boolean less(int i, int j) {
		return pq[i].compareTo(pq[j])<0;
	}

}
