package com.simplilearn.collections.set;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
//Output in ascending order(TreeSet which Implements SortedSet of Set Interface--> Set-----> SortedSet------->TreeSet)
public class TreeSetDemo {
public static void main(String[] args) {

	SortedSet<String> set=new TreeSet<>();
	set.add("Molly");
	set.add("Naanu");
	set.add("Pooja");
    set.add("Neha");
    set.add("Ruchi");
    System.out.println(set);
    
    System.out.println(set.last()+": last element");
    System.out.println(set.first()+": 1st element");
    
   //***********to set in descending order,new method only in sorted set interface***************
    SortedSet<String> desc=((TreeSet<String>) set).descendingSet();
    System.out.println(desc);
   
    //contains string or not
    System.out.println("Has Molly? : "+set.contains("Molly"));
    System.out.println("size: "+set.size());
   
   
    //ITERATOR
Iterator<String> it=set.iterator();
while(it.hasNext())
	System.out.println(it.next());
}
}

