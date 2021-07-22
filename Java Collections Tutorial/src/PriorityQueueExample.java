import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>(15,new MyComparator());
		queue.add("Penril Datability");
		queue.add("Chumbaka");
		queue.add("3D Proteus");
		queue.add("Disney");
		queue.add("Tokyo Wonderland");
		System.out.println(queue);
		while (queue.size() != 0)
        {
            System.out.println(queue.poll());

        }
		System.out.println(queue);
	}
}
