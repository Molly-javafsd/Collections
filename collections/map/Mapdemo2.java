package com.simplilearn.collections.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapdemo2 {

	public static void main(String[] args) {
		Hashtable<Integer,String> hm=new Hashtable<>();
		//adding elments we use put
		hm.put(2,"kk");
		hm.put(1, "pp");
		hm.put(3, "pp");
		Set s=hm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
		//LHS map	      //i.next() Set value -typecast with a map
		Map.Entry map=(Map.Entry)i.next();
		System.out.println(map.getKey()+"   "+map.getValue());

	
	
	}


	}

}
