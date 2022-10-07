package com.simplilearn.collections.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableDemo {
// Synchronised,provides thread safety.. Prints in "descending", slower than HashMap,no duplicate key allowed but can have duplicate value
	//if key is duplicate,it will update value
	//doesn't allow null key value
	public static void main(String[] args) {
			Map<Integer, String> ht = new Hashtable<>();
			ht.put(1, "Molly");
			ht.put(2, "Naanu");
			ht.put(3, "Ayaansh");
			ht.put(4, "Arunav");
			ht.put(5, "Neeta");
			ht.put(3, "Betu"); 			//update value of key '3'
			ht.put(6, "Molly");			//can have duplicate value, but can have 2 same keys,will rather update value in key
			
			System.out.println(ht);
			System.out.println("Contains 3 or not? "+ht.containsKey(3));
			System.out.println("Contains Naanu or not? "+ht.containsValue("Naanu"));
			System.out.println("Value at 2? "+ht.get(2));
			
			//for each
			System.out.println("For Each: ");
			for(Map.Entry<Integer, String> entry : ht.entrySet()) {
				System.out.println(entry.getKey()+"  "+entry.getValue());
			}
			//iterator
			System.out.println("Iterator: ");
		Iterator <Map.Entry<Integer, String>> it = ht.entrySet().iterator();
		while(it.hasNext()) {
		Map.Entry<Integer, String> entry = it.next();
		System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		
		
	}

}
