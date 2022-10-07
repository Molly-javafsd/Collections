package com.simplilearn.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//HashMap contains key value pair,methods are "not synchronised",do not provide thread safety.
//no duplicate key, if occurs it will update the value of key.
//Faster than Hashtable
//allow one null key,multiple null value pair
public class HashMapDemo {
	public static void main(String[] args) {
	Map<Integer, String> hm = new HashMap<>();
	hm.put(1, "Molly");
	hm.put(2, "Naanu");
	hm.put(3, "Ayaansh");
	hm.put(4, "Arunav");
	hm.put(5, "Neeta");
	hm.put(4, "Mitul");         //as per key it will update the value,but wont print duplicate values
	
	System.out.println(hm);
	System.out.println("Contains 3 or not? "+hm.containsKey(3));
	System.out.println("Contains Naanu or not? "+hm.containsValue("Naanu"));
	System.out.println("Value at 2? "+hm.get(2));
	
	//FOR EACH LOOP
	System.out.println("Print using for each loop: ");
	for(Map.Entry<Integer , String> entry: hm.entrySet()) {
		System.out.println(entry.getKey()+"  "+entry.getValue());
	}
	
	//Print using iterator
	System.out.println("Print using iterator: ");
	Iterator<Map.Entry<Integer, String>> it= hm.entrySet().iterator();
	while(it.hasNext()) {
	Map.Entry<Integer, String> entry=it.next();
	System.out.println(entry.getKey()+" "+entry.getValue());
	}
}
}
