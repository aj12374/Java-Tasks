package MapTask;
import java.util.*;

public class HashTableTask {



	void Hashtables() {
	Map<Integer,String> ht=new Hashtable<Integer,String>();
	ht.put(1,"Ajay");
	ht.put(2,"vishnu");
	ht.put(3,"vamshi");
	ht.put(4,"sowmya");
	System.out.println(ht);
	System.out.println(ht.get(2));
	ht.put(1,"nagaraju");
	System.out.println(ht);
	ht.remove(3);
	System.out.println(ht);
	System.out.println(ht.containsKey(2));
	System.out.println(ht.containsValue("Ajay"));
	System.out.println(ht.size());
	System.out.println(ht.isEmpty());
	System.out.println(ht.keySet());
	System.out.println(ht.values());
	System.out.println(ht.entrySet());
	ht.clear();
	System.out.println(ht);
	}
	public static void main(String args[]) {
	HashTableTask ht=new HashTableTask();
	ht.Hashtables();
	
	}


}
