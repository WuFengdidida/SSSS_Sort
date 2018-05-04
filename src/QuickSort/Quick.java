package QuickSort;

public class Quick {       //¿ìËÙÅÅÐò
	public static void sort(Comparable[] a) {
		sort(a,0,a.length-1);
	}
	
	public static void sort(Comparable[] a,int lo,int hi) {
		if (lo>=hi) {
			return;
		}
		int j =partition(a,lo,hi);
		sort(a, lo, j-1);
		sort(a, j+1, hi);
	}

	private static int partition(Comparable[] a, int lo, int hi) {
		int i = lo;
		int j = hi+1;
		Comparable v =a[lo];
		while (true) {
			while (less(a[++i],v)) {
				if (i==hi) {
					break;
				}
			}
			while (less(v,a[--j])) {
				if (j==lo) {
					break;
				}
			}		
			if (i>=j) {
				break;
			}
			exch(a,i,j);
		}
		exch(a,lo,j);
		return j;
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
		Integer[] a ={1,2,3,2,1,6,7,8,5,3,2,5,3,6,3};
		sort(a);
		for (int i : a) {
			System.out.println(i);
		}
	}
}
