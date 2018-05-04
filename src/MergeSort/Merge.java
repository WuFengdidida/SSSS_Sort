package MergeSort;

public class Merge {    //将两个有序数组a[lo...mid],a[mid+1...hi]合并起来
	public static void merge(Comparable[] a,int lo,int mid,int hi) {
		Comparable[] a1 = new Comparable[hi-lo+1];
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
		Integer[] a ={1,3,6,7,8,2,5,5,6,9};
		merge(a,0,4,9);
		for (int i : a) {
			System.out.println(i);
		}
	}

}
