package collectionsPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		hashMapDemo();
		nestedMapDemo();
		keyImmutablesDemo();
		LRUCacheDemo();
		

	}
	
	private static void hashMapDemo() {
		Map<String, Integer> hashMap1 = new HashMap<>();
		hashMap1.put("Kanya", 23);
		hashMap1.put("Jashu", 3);
		hashMap1.put("Daddy", 62);
		System.out.println(hashMap1);
		System.out.println(hashMap1.get("Kanya"));
		hashMap1.remove("Jashu");   //remove element by giving key.
		hashMap1.put("Kanya", 99); //Update value by put method it will overwrite existing value.
		System.out.println(hashMap1);
		System.out.println("size: "+hashMap1.size());
		
		
		
		//iterate elements through keyset
		Set<String> keyset = hashMap1.keySet(); //It will create a set contains all the keys.
		for (String name:keyset) {
			System.out.println("name: " + name + ", Age: " + hashMap1.get(name));
		}
		
		Collection<Integer> values = hashMap1.values(); //It will create a collection and that contains all the values of keys.
		for (Integer v:values){
			System.out.println("values: "+v);
		}
		
		
		//iterate elements through entryset
		Set<Map.Entry<String, Integer>> map = hashMap1.entrySet();
		for (Map.Entry<String, Integer> mappings : map) {
			System.out.println("name: " + mappings.getKey() + ", age: " + mappings.getValue());
			
		}
		
		
	}
	
	private static void nestedMapDemo() {
		Map<String, Map<String, Object>> UserProfile = new HashMap<>();
		Map<String, Object> profile = new HashMap<>();
		profile.put("age", 23);
		profile.put("gender", "female");
		profile.put("branch", "cse");
		profile.put("RollNo", 1671033);
		
		UserProfile.put("Kanya", profile);
		
		System.out.println("UserProfile: "+ UserProfile);
		
		profile = new HashMap<>();
		
		profile.put("age", 67);
		profile.put("gender", "male");
		profile.put("branch", "Teacher");
		
		UserProfile.put("Satyanarayana", profile);
		
		System.out.println("UserProfile: "+ UserProfile);
		
		System.out.println(UserProfile.get("Kanya")); 
		Map<String, Object> profile1 = UserProfile.get("Kanya");
		System.out.println(profile1.get("RollNo"));
		System.out.println(profile1.get("gender"));
		System.out.println(profile1.get("branch"));
		System.out.println(profile1.get("age"));
		
		
		
	}
	
	private static void keyImmutablesDemo() {
		System.out.println("enter of keyImmutablesDemo");
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		
		Map<List<Integer>,String> map = new HashMap<>();
		map.put(list, "Kanya"); //modifying list will result in null values.
		//keys should be immutable.Otherwise values will be null values.
		list.add(3);
		System.out.println(map.get(list));
		
		Set<List<Integer>> keyset = map.keySet();
		for(List<Integer> k:keyset){
			for(Integer i:k){
				System.out.println(i);
				System.out.println("name: "+ map.get(i));
			}
			
		}
		
		Student s = new Student(1,"Kanya");
		Map<Student,Integer> map2 = new HashMap<>();
		map2.put(s, 1);
		
		s.setName("Jashu"); //modifying key value will not throw any issues bcoz we don't have any hashcode in Student class.
		System.out.println(map2.get(s));
		
		
		
		
	}
	
	private static void LRUCacheDemo() {
		Map<String, String> lruCache = new LRUCache<>(16, 0.75f, true); //if we make last parameter as false it will not act as LRUcache instead it will act as normal linkedhashmap.
		lruCache.put("a", "A");
		lruCache.put("b", "B");
		lruCache.put("c", "C");
		System.out.println(lruCache);
		lruCache.put("d", "D");
		System.out.println(lruCache); //LRU cache means least recently used cache contains least recently used data.
		//It will remove eldest data when the cache is full.
		//We can fix the cache size as well.
		lruCache.get("c");
		lruCache.get("c");
		lruCache.get("c");
		System.out.println(lruCache);
		
		
	}

}

class Student{
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	Student(int id1,String name1){
		id=id1;
		name=name1;
	}
	
}

class LRUCache<K,V> extends LinkedHashMap<K, V> {
	
	public LRUCache(int initialCapacity,
            float loadFactor,
            boolean accessOrder) {
	 super(initialCapacity, loadFactor, accessOrder);
	 
	 
	 
	 
}
}
