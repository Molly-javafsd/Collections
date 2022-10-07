package com.simplilearn.collections.map;

import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

// sorted wrt key

public class TreeMapDemo {

	public static void main(String[] args) {
			SortedMap<Integer, String> hm = new TreeMap<>();
			hm.put(1, "Molly");
			hm.put(2, "Naanu");
			hm.put(3, "Ayaansh");
			hm.put(4, "Arunav");
			hm.put(5, "Neeta");
			
			System.out.println(hm);
			System.out.println("Contains 3 or not? "+hm.containsKey(3));
			System.out.println("Contains Naanu or not? "+hm.containsValue("Naanu"));
			System.out.println("Value at 2? "+hm.get(2));
			
			//for descending order
			SortedMap<Integer, String> mp= ((TreeMap<Integer, String>)hm).descendingMap();
			System.out.println(mp);
			
			//For Each
			System.out.println("For each: ");
			for(Map.Entry<Integer, String> entry:hm.entrySet()) {
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
			
			//iterator
			System.out.println("Iterator: ");
			Iterator <Map.Entry<Integer, String>> it = hm.entrySet().iterator();
			while(it.hasNext()) {
				Map.Entry<Integer, String> entry=it.next();
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
				
	}

}
