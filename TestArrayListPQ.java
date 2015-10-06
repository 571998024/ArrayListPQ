public class TestArrayListPQ {
	public static void main(String[] args) {
	ArrayListPQ pq = new ArrayListPQ();

	pq.enQueue(new Integer(3));
	pq.enQueue(new Integer(9));

	System.out.println(pq.deQueue());
	}
}