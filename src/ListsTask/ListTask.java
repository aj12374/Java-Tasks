package ListsTask;

import java.util.*;

public class ListTask {
	void ArrayLists() {
		List <String> al= new ArrayList<String>();
		al.add("Ajay");
		al.add("vishnu");
		al.add("vamshi");
		al.add("sowmya");
		System.out.println(al);
		System.out.println(al.get(1));
		al.set(0, "nagaraju");
		System.out.println(al);
		List <String> als= new ArrayList<String>();
		als.add("Hello");
		als.addAll(al);
		System.out.println(als);
		als.remove(3);
		System.out.println(als);
		
		System.out.println(als.contains("ajay"));
		System.out.println(als.size());
		System.out.println(als.isEmpty());
		als.clear();
		System.out.println(als);
		System.out.println("-------------------------------------------------------------");
	}
	void Vectors() {
		List <String> v= new Vector<String>();
		v.add("Ajay");
		v.add("vishnu");
		v.add("vamshi");
		v.add("sowmya");
		System.out.println(v);
		System.out.println(v.get(1));
		v.set(0, "nagaraju");
		System.out.println(v);
		List <String> vs= new LinkedList<String>();
		vs.add("Hello");
		vs.addAll(v);
		System.out.println(vs);
		vs.remove(3);
		System.out.println(vs);
		
		System.out.println(vs.contains("ajay"));
		System.out.println(vs.size());
		System.out.println(vs.isEmpty());
		vs.clear();
		System.out.println(vs);
		System.out.println("-------------------------------------------------------------");
	}
	void Linkedlists() {
		List <String> ll= new LinkedList<String>();
		ll.add("Ajay");
		ll.add("vishnu");
		ll.add("vamshi");
		ll.add("sowmya");
		System.out.println(ll);
		System.out.println(ll.get(1));
		ll.set(0, "nagaraju");
		System.out.println(ll);
		List <String> lls= new LinkedList<String>();
		lls.add("Hello");
		lls.addAll(ll);
		System.out.println(lls);
		lls.remove(3);
		System.out.println(lls);
		
		System.out.println(lls.contains("ajay"));
		System.out.println(lls.size());
		System.out.println(lls.isEmpty());
		lls.clear();
		System.out.println(lls);
		System.out.println("-------------------------------------------------------------");
	}
	void Stacks() {
		List <String> st= new LinkedList<String>();
		st.add("Ajay");
		st.add("vishnu");
		st.add("vamshi");
		st.add("sowmya");
		System.out.println(st);
		System.out.println(st.get(1));
		st.set(0, "nagaraju");
		System.out.println(st);
		List <String> sts= new LinkedList<String>();
		sts.add("Hello");
		sts.addAll(st);
		System.out.println(sts);
		sts.remove(3);
		System.out.println(sts);
		
		System.out.println(sts.contains("ajay"));
		System.out.println(sts.size());
		System.out.println(sts.isEmpty());
		sts.clear();
		System.out.println(sts);
		
	}
	
	public static void main(String args []) {
		ListTask lt= new ListTask();
		lt.ArrayLists();
		lt.Vectors();
		lt.Linkedlists();
		lt.Stacks();
	}

}
