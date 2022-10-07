package com.simplilearn.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
//Returns Exact Sequence,removes duplicates,internally includes doubly linkedlist,so returning by index is as inefficient as linkedlist,but deletion addition faster
public class LinkedHashSetDemo {
	public static void main(String[] args) {

		Set<String> set=new LinkedHashSet<>();
		set.add("Molly");
		set.add("Naanu");
		set.add("Pooja");
	    set.add("Neha");
	    set.add("Ruchi");
	set.add("Ruchi");
	System.out.println(set);
	set.remove("Ruchi");
	System.out.println(set);
	System.out.println("Has Molly? : "+set.contains("Molly"));
	System.out.println("size: "+set.size());
	//ITERATOR
	Iterator<String> it=set.iterator();
	while(it.hasNext())
		System.out.println(it.next());
	}	
	}

