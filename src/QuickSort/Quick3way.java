package QuickSort;

public class Quick3way {        //三向切分的快速排序
	public static void sort(Comparable[] a) {
		sort(a,0,a.length-1);
	}

	private static void sort(Comparable[] a, int lo, int hi) {
		if (lo>=hi) {
			return;
		}
		int lt =lo,i =lo+1,gt =hi;
		Comparable v =a[lo];
		while (i<=gt) {
			int cmp =a[i].compareTo(v);
			if (cmp<0) {
				exch(a,lt++,i++);
			}
			else if (cmp>0) {
				exch(a,i,gt--);
			}
			else {
				i++;
			}
		}
		sort(a, lo, lt-1);
		sort(a, gt+1, hi);
	}
	
	private static void exch(Comparable[] a, int i, int min) {
		Comparable c =a[i];
		a[i] =a[min];
		a[min] =c;
	}

	private static boolean less(Comparable c1, Comparable c2) {
		return c1.compareTo(c2)<0;
	}
	
	public static void main(String[] args) {
		Integer[] a ={1,2,3,2,1,3,1,2,2,3,2,1,3,1,3};
		sort(a);
		for (int i : a) {
			System.out.println(i);
		}
	}

}
