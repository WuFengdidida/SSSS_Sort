package MergeSort;

public class MergeD_U {      //自下向上的归并排序
	static Comparable[] a1;
	public static void sort(Comparable[] a) {
		int N=a.length;
		a1 =new Comparable[N];
		for (int si = 1; si < N; si*=2) {
			for(int lo = 0;lo<N-si;lo+=2*si){
				merge(a,lo,lo+si-1,Math.min(lo+2*si-1, N-1));
			}
		}
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
