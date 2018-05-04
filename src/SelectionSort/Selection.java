package SelectionSort;

public class Selection {  //Ñ¡ÔñÅÅĞòËã·¨£¬ÉıĞò
	public static void sort(Comparable[] a) {
		int N= a.length;
		for (int i = 0; i < N; i++) {
			int min =i;
			for (int j = i; j < N; j++) {
				if (less(a[j],a[min])) {
					min = j;
				}
			}
			exch(a,i,min);
		}
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
