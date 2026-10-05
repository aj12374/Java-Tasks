package MapTask;
import java.util.*;

public class TreeMapTask {
	
	void TreeMaps() {
	Map<Integer,String> tm=new TreeMap<Integer,String>();
	tm.put(4,"sowmya");
	tm.put(2,"vishnu");
	tm.put(1,"Ajay");
	tm.put(3,"vamshi");
	System.out.println(tm);
	System.out.println(tm.get(2));
	tm.put(1,"nagaraju");
	System.out.println(tm);
	tm.remove(3);
	System.out.println(tm);
	System.out.println(tm.containsKey(2));
	System.out.println(tm.containsValue("Ajay"));
	System.out.println(tm.size());
	System.out.println(tm.isEmpty());
	System.out.println(tm.keySet());
	System.out.println(tm.values());
	System.out.println(tm.entrySet());
	System.out.println(((TreeMap<Integer, String>) tm).firstKey());
	System.out.println(((TreeMap<Integer, String>) tm).lastKey());
	tm.clear();
	System.out.println(tm);
	}
	public static void main(String args[]) {
	TreeMapTask tm=new TreeMapTask();
	tm.TreeMaps();
	}
	


}
