package CollectionTask;
import java.util.*;

public class CollectionTask {
	void Add() {
		Collection <String> names = new ArrayList<>();
		names.add("Ajay");
		names.add("Rakesh");
		names.add("Arun");
		names.add("Nagaraju");
		names.add("vignesh");
		System.out.println(names);

		Collection <String> name = new ArrayList<>();
		name.add("Hello");
		name.addAll(names);
		System.out.println(name);
	
		System.out.println(name.contains("Ajay"));
		System.out.println(name.containsAll(names));
		
		System.out.println(name.isEmpty());
		
		System.out.println(name.size());
		
		name.remove("Ajay");
		System.out.println(name);
		
		name.removeAll(name);
		System.out.println(name);
	
		System.out.println(name.retainAll(name));
		
		//names.clear();
		System.out.println(names);
		
		//names.toArray();
		System.out.println(names.toArray());
	}
	public static void main(String args[]) {
		CollectionTask ct=new CollectionTask();
		ct.Add();
	}

}
