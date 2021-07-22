import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		//If the queue is empty, .peek shows null while .element return exception error
//		System.out.println("peek(): " + q.element());
//		System.out.println("peek(): " + q.peek());
		q.add("John");
		q.add("Master");
		q.add("Ahmad");
		q.add("Eric");
		q.add("Sophia");
		q.add("Bug");
		System.out.println("Elements in queue:" + q);
		/*
		 * We can remove element from Queue using remove() method, this would remove the
		 * first element from the Queue
		 */
		System.out.println("Removed element:" + q.remove());
		System.out.println("Elements in queue:" + q);
		/*
		 * element() method - this returns the head of the Queue. Head is the first
		 * element of Queue
		 */
		System.out.println("Head:" + q.element());
		/*
		 * poll() method - this removes and returns the head of the Queue. Returns null
		 * if the Queue is empty
		 */
		System.out.println("poll(): " + q.poll());
		System.out.println("Elements in queue:" + q);

		/*
		 * peek() method - it works same as element() method, however it returns null if
		 * the Queue is empty
		 */
		System.out.println("peek(): " + q.peek());
		System.out.println("Elements in queue:" + q);
	}
}
