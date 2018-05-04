package ShellSort;

public class Shell {       //希尔排序，有序数据运用插入排序
	public static void sort(Comparable[] a) {
		int N =a.length;
		int h =1;
		while (h<N/3) {
			h = 3*h+1;
		}
		while(h>=1){
			for(int i = h;i< N;i++){
				for(int j =i;j>=h&&less(a[j],a[j-h]);j-=h){
					exch(a,j,j-h);
				}
			}
			h /=3;
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
