package MapTask;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class HashMapTask {

			void HashMaps() {

				System.out.println("==========================================");

				HashMap<Integer, String> hm = new HashMap<Integer, String>();

				
				hm.put(101, "Ajay");
				hm.put(102, "Vishnu");
				hm.put(103, "Vamshi");
				hm.put(104, "Sowmya");
				System.out.println(hm);

	
				System.out.println(hm.get(102));

				// update using put()
				hm.put(101, "Nagaraju");
				System.out.println(hm);

				// putAll()
				HashMap<Integer, String> hms = new HashMap<Integer, String>();
				hms.put(105, "Hello");
				hms.putAll(hm);
				System.out.println(hms);

				// remove()
				hms.remove(104);
				System.out.println(hms);

				// containsKey()
				System.out.println(hms.containsKey(102));

				// containsValue()
				System.out.println(hms.containsValue("Vamshi"));

				// size()
				System.out.println(hms.size());

				// isEmpty()
				System.out.println(hms.isEmpty());

				// keySet()
				System.out.println(hms.keySet());

				// values()
				System.out.println(hms.values());

				// entrySet()
				System.out.println(hms.entrySet());

				// getOrDefault()
				System.out.println(hms.getOrDefault(101, "Not Found"));
				System.out.println(hms.getOrDefault(999, "Not Found"));

				// replace()
				hms.replace(102, "Vishnu Kumar");
				System.out.println(hms);

				// replace(key, oldValue, newValue)
				hms.replace(103, "Vamshi", "Vamshi Krishna");
				System.out.println(hms);

				// putIfAbsent()
				hms.putIfAbsent(106, "Abhilash");
				hms.putIfAbsent(101, "Test");
				System.out.println(hms);

				// remove(key, value)
				hms.remove(106, "Abhilash");
				System.out.println(hms);

				// clear()
				hms.clear();
				System.out.println(hms);
			}


			void LinkedHashMaps() {

				System.out.println("\n================ LINKEDHASHMAP ================");

				LinkedHashMap<Integer, String> lhm =
						new LinkedHashMap<Integer, String>();

				// put()
				lhm.put(101, "Ajay");
				lhm.put(102, "Vishnu");
				lhm.put(103, "Vamshi");
				lhm.put(104, "Sowmya");
				System.out.println(lhm);

				// get()
				System.out.println(lhm.get(102));

				// update
				lhm.put(101, "Nagaraju");
				System.out.println(lhm);

				// putAll()
				LinkedHashMap<Integer, String> lhms =
						new LinkedHashMap<Integer, String>();

				lhms.put(105, "Hello");
				lhms.putAll(lhm);
				System.out.println(lhms);

				// remove()
				lhms.remove(104);
				System.out.println(lhms);

				// containsKey()
				System.out.println(lhms.containsKey(102));

				// containsValue()
				System.out.println(lhms.containsValue("Vamshi"));

				// size()
				System.out.println(lhms.size());

				// isEmpty()
				System.out.println(lhms.isEmpty());

				// keySet()
				System.out.println(lhms.keySet());

				// values()
				System.out.println(lhms.values());

				// entrySet()
				System.out.println(lhms.entrySet());

				// getOrDefault()
				System.out.println(lhms.getOrDefault(101, "Not Found"));

				// replace()
				lhms.replace(102, "Vishnu Kumar");
				System.out.println(lhms);

				// replace(key, oldValue, newValue)
				lhms.replace(103, "Vamshi", "Vamshi Krishna");
				System.out.println(lhms);

				// putIfAbsent()
				lhms.putIfAbsent(106, "Abhilash");
				lhms.putIfAbsent(101, "Test");
				System.out.println(lhms);

				// remove(key, value)
				lhms.remove(106, "Abhilash");
				System.out.println(lhms);

				// clear()
				lhms.clear();
				System.out.println(lhms);
			}


			void TreeMaps() {

				System.out.println("\n================ TREEMAP ================");

				TreeMap<Integer, String> tm =
						new TreeMap<Integer, String>();

				
				tm.put(104, "Sowmya");
				tm.put(101, "Ajay");
				tm.put(103, "Vamshi");
				tm.put(102, "Vishnu");

				System.out.println(tm);

				
				System.out.println(tm.get(102));

				
				tm.put(101, "Nagaraju");
				System.out.println(tm);

				// putAll()
				TreeMap<Integer, String> tms =
						new TreeMap<Integer, String>();

				tms.put(105, "Hello");
				tms.putAll(tm);
				System.out.println(tms);

				// remove()
				tms.remove(104);
				System.out.println(tms);

				// containsKey()
				System.out.println(tms.containsKey(102));

				// containsValue()
				System.out.println(tms.containsValue("Vamshi"));

				// size()
				System.out.println(tms.size());

				// isEmpty()
				System.out.println(tms.isEmpty());

				// keySet()
				System.out.println(tms.keySet());

				// values()
				System.out.println(tms.values());

				// entrySet()
				System.out.println(tms.entrySet());

				// getOrDefault()
				System.out.println(tms.getOrDefault(101, "Not Found"));

				// replace()
				tms.replace(102, "Vishnu Kumar");
				System.out.println(tms);

				// replace(key, oldValue, newValue)
				tms.replace(103, "Vamshi", "Vamshi Krishna");
				System.out.println(tms);

				// putIfAbsent()
				tms.putIfAbsent(106, "Abhilash");
				tms.putIfAbsent(101, "Test");
				System.out.println(tms);

				// remove(key, value)
				tms.remove(106, "Abhilash");
				System.out.println(tms);

				// TreeMap specific methods

				// firstKey()
				System.out.println(tms.firstKey());

				// lastKey()
				System.out.println(tms.lastKey());

				// higherKey()
				System.out.println(tms.higherKey(102));

				// lowerKey()
				System.out.println(tms.lowerKey(102));

				// ceilingKey()
				System.out.println(tms.ceilingKey(102));

				// floorKey()
				System.out.println(tms.floorKey(102));

				// clear()
				tms.clear();
				System.out.println(tms);
			}


			void Hashtables() {

				System.out.println("\n================ HASHTABLE ================");

				Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

				// put()
				ht.put(101, "Ajay");
				ht.put(102, "Vishnu");
				ht.put(103, "Vamshi");
				ht.put(104, "Sowmya");

				System.out.println(ht);

				
				System.out.println(ht.get(102));

				
				ht.put(101, "Nagaraju");
				System.out.println(ht);

				Hashtable<Integer, String> hts = new Hashtable<Integer, String>();

				hts.put(105, "Hello");
				hts.putAll(ht);
				System.out.println(hts);

				hts.remove(104);
				System.out.println(hts);

				
				System.out.println(hts.containsKey(102));

				
				System.out.println(hts.containsValue("Vamshi"));


				System.out.println(hts.size());

				System.out.println(hts.isEmpty());

				System.out.println(hts.keySet());

				System.out.println(hts.values());

				System.out.println(hts.entrySet());

				System.out.println(hts.getOrDefault(101, "Not Found"));

				hts.replace(102, "Vishnu Kumar");
				System.out.println(hts);

				hts.replace(103, "Vamshi", "Vamshi Krishna");
				System.out.println(hts);

				hts.putIfAbsent(106, "Abhilash");
				hts.putIfAbsent(101, "Test");
				System.out.println(hts);

				hts.remove(106, "Abhilash");
				System.out.println(hts);

				hts.clear();
				System.out.println(hts);
			}


			void ConcurrentHashMaps() {

				System.out.println("\n================ CONCURRENTHASHMAP ================");

				ConcurrentHashMap<Integer, String> chm =
						new ConcurrentHashMap<Integer, String>();

				// put()
				chm.put(101, "Ajay");
				chm.put(102, "Vishnu");
				chm.put(103, "Vamshi");
				chm.put(104, "Sowmya");

				System.out.println(chm);

				// get()
				System.out.println(chm.get(102));

				// update
				chm.put(101, "Nagaraju");
				System.out.println(chm);

				// putAll()
				ConcurrentHashMap<Integer, String> chms =
						new ConcurrentHashMap<Integer, String>();

				chms.put(105, "Hello");
				chms.putAll(chm);
				System.out.println(chms);

				// remove()
				chms.remove(104);
				System.out.println(chms);

				// containsKey()
				System.out.println(chms.containsKey(102));

				// containsValue()
				System.out.println(chms.containsValue("Vamshi"));

				// size()
				System.out.println(chms.size());

				// isEmpty()
				System.out.println(chms.isEmpty());

				// keySet()
				System.out.println(chms.keySet());

				// values()
				System.out.println(chms.values());

				// entrySet()
				System.out.println(chms.entrySet());

				// getOrDefault()
				System.out.println(chms.getOrDefault(101, "Not Found"));

				// replace()
				chms.replace(102, "Vishnu Kumar");
				System.out.println(chms);

				// replace(key, oldValue, newValue)
				chms.replace(103, "Vamshi", "Vamshi Krishna");
				System.out.println(chms);

				// putIfAbsent()
				chms.putIfAbsent(106, "Abhilash");
				chms.putIfAbsent(101, "Test");
				System.out.println(chms);

				// remove(key, value)
				chms.remove(106, "Abhilash");
				System.out.println(chms);

				// clear()
				chms.clear();
				System.out.println(chms);
			}


			public static void main(String args[]) {

				HashMapTask mt = new HashMapTask();

				mt.HashMaps();

				mt.LinkedHashMaps();

				mt.TreeMaps();

				mt.Hashtables();

				mt.ConcurrentHashMaps();
			}

}
