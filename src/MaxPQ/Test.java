package MaxPQ;

public class Test {
	public static void main(String[] args) {
		MaxPQ<Integer> m =new MaxPQ<Integer>(11);
		System.out.println(m.isEmpty());
		m.insert(2);
		m.insert(6);
		m.insert(4);
		m.insert(7);
		m.insert(0);
		m.insert(8);
		m.insert(3);
		m.insert(5);
		System.out.println(m.size());
		System.out.println(m.delMax());
		System.out.println(m.delMax());
		System.out.println(m.size());
		System.out.println(m.isEmpty());
	}

}
