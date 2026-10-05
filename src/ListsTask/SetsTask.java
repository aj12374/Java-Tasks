package ListsTask;
import java.util.*;

public class SetsTask {

	void HashSets() {
	Set<String> hs=new HashSet<String>();
	hs.add("Ajay");
	hs.add("vishnu");
	hs.add("vamshi");
	hs.add("sowmya");
	hs.add("Ajay");
	System.out.println(hs);
	System.out.println(hs.contains("vishnu"));
	hs.remove("vamshi");
	System.out.println(hs);
	Set<String> hss=new HashSet<String>();
	hss.add("Hello");
	hss.addAll(hs);
	System.out.println(hss);
	System.out.println(hss.size());
	System.out.println(hss.isEmpty());
	hss.clear();
	System.out.println(hss);
	System.out.println("-------------------------------------------------------------");
	}
	void LinkedHashSets() {
	Set<String> lhs=new LinkedHashSet<String>();
	lhs.add("Ajay");
	lhs.add("vishnu");
	lhs.add("vamshi");
	lhs.add("sowmya");
	lhs.add("Ajay");
	System.out.println(lhs);
	System.out.println(lhs.contains("vishnu"));
	lhs.remove("vamshi");
	System.out.println(lhs);
	Set<String> lhss=new LinkedHashSet<String>();
	lhss.add("Hello");
	lhss.addAll(lhs);
	System.out.println(lhss);
	System.out.println(lhss.size());
	System.out.println(lhss.isEmpty());
	lhss.clear();
	System.out.println(lhss);
	System.out.println("-------------------------------------------------------------");
	}
	void TreeSets() {
	Set<String> ts=new TreeSet<String>();
	ts.add("Ajay");
	ts.add("vishnu");
	ts.add("vamshi");
	ts.add("sowmya");
	ts.add("Ajay");
	System.out.println(ts);
	System.out.println(ts.contains("vishnu"));
	ts.remove("vamshi");
	System.out.println(ts);
	Set<String> tss=new TreeSet<String>();
	tss.add("Hello");
	tss.addAll(ts);
	System.out.println(tss);
	System.out.println(tss.size());
	System.out.println(tss.isEmpty());
	tss.clear();
	System.out.println(tss);
	System.out.println("-------------------------------------------------------------");
	}
	public static void main(String args[]) {
	SetsTask st=new SetsTask();
	st.HashSets();
	st.LinkedHashSets();
	st.TreeSets();
	}
	}
