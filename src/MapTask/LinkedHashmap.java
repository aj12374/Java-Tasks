package MapTask;
import java.util.*;
public class LinkedHashmap {
	
	void LinkedHashMaps() {
	Map<Integer,String> lm=new LinkedHashMap<Integer,String>();
	lm.put(1,"Ajay");
	lm.put(2,"vishnu");
	lm.put(3,"vamshi");
	lm.put(4,"sowmya");
	System.out.println(lm);
	System.out.println(lm.get(2));
	lm.put(1,"nagaraju");
	System.out.println(lm);
	lm.remove(3);
	System.out.println(lm);
	System.out.println(lm.containsKey(2));
	System.out.println(lm.containsValue("Ajay"));
	System.out.println(lm.size());
	System.out.println(lm.isEmpty());
	System.out.println(lm.keySet());
	System.out.println(lm.values());
	System.out.println(lm.entrySet());
	lm.clear();
	System.out.println(lm);
	}
	public static void main(String args[]) {
	LinkedHashmap lm=new LinkedHashmap();
	lm.LinkedHashMaps();
	}
	


}
