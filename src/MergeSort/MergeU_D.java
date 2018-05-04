package MergeSort;

import my1.array;

public class MergeU_D {       //自顶向下的归并排序
	static Comparable[] a1;
	public static void sort(Comparable[] a) {
		a1 =new Comparable[a.length];
		sort(a,0,a.length-1);
	}

	private static void sort(Comparable[] a, int lo, int hi) {
		if (hi<=lo) {
			return;
		}
		int mid = lo+ (hi-lo)/2;
		sort(a, lo, mid);
		sort(a, mid+1, hi);
		merge(a, lo, mid, hi);
	}
	
	public static void merge(Comparable[] a,int lo,int mid,int hi) {
		for (int k = lo; k <= hi; k++) {
			a1[k] = a[k];
		}
		int i =lo;
		int j =mid+1;
		for(int k = lo; k<=hi ;k++){
			if(i > mid){
				a[k] =a1[j++];
			}
			else if (j> hi) {
				a[k] =a1[i++];
			}
			else if (less(a1[i],a1[j])) {
				a[k] = a1[i++];
			}
			else {
				a[k] =a1[j++];
			}
		}
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
