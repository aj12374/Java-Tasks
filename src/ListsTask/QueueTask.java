package ListsTask;
import java.util.*;
public class QueueTask {
	
	
	void PriorityQueues() {
	Queue<String> pq=new PriorityQueue<String>();
	pq.add("Ajay");
	pq.add("vishnu");
	pq.add("vamshi");
	pq.add("sowmya");
	System.out.println(pq);
	System.out.println(pq.peek());
	System.out.println(pq.poll());
	System.out.println(pq);
	pq.offer("nagaraju");
	System.out.println(pq);
	System.out.println(pq.contains("vishnu"));
	System.out.println(pq.size());
	System.out.println(pq.isEmpty());
	pq.remove("vamshi");
	System.out.println(pq);
	pq.clear();
	System.out.println(pq);
	System.out.println("-------------------------------------------------------------");
	}
	void LinkedLists() {
	Queue<String> q=new LinkedList<String>();
	q.add("Ajay");
	q.add("vishnu");
	q.add("vamshi");
	q.add("sowmya");
	System.out.println(q);
	System.out.println(q.peek());
	System.out.println(q.poll());
	System.out.println(q);
	q.offer("nagaraju");
	System.out.println(q);
	System.out.println(q.contains("vishnu"));
	System.out.println(q.size());
	System.out.println(q.isEmpty());
	q.remove("vamshi");
	System.out.println(q);
	q.clear();
	System.out.println(q);
	System.out.println("-------------------------------------------------------------");
	}
	void ArrayDeque() {
	Queue<String> ad=new ArrayDeque<String>();
	ad.add("Ajay");
	ad.add("vishnu");
	ad.add("vamshi");
	ad.add("sowmya");
	System.out.println(ad);
	System.out.println(ad.peek());
	System.out.println(ad.poll());
	System.out.println(ad);
	ad.offer("nagaraju");
	System.out.println(ad);
	System.out.println(ad.contains("vishnu"));
	System.out.println(ad.size());
	System.out.println(ad.isEmpty());
	ad.remove("vamshi");
	System.out.println(ad);
	ad.clear();
	System.out.println(ad);
	System.out.println("-------------------------------------------------------------");
	}
	public static void main(String args[]) {
	QueueTask qt=new QueueTask();
	qt.PriorityQueues();
	qt.LinkedLists();
	qt.ArrayDeque();
	}
}



