package com.simplilearn.collections.list;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
//Provides thread safety,so used for security purpose,all methods are synchronized
public class VectorDemo {
	public static void main(String[] args) {
		List<String> st=new Vector<>();
		st.add("Molly");
		st.add("Naanu");
		st.add("Bhaiyu");
		st.add("Arunav");
		st.add("Neha");
		
		List<Integer> it= new Vector<>();
		it.add(33);
		it.add(44);
		it.add(55);
		it.add(66);
		
		System.out.println(st);
		System.out.println(it);
		st.remove(4);
		System.out.println("After removing: "+st);
		System.out.println("Size: "+st.size());
		System.out.println("Contains pooja or not?boolean value: "+st.contains("Pooja"));
		
		//print using iterator**
	Iterator<String> i=st.iterator();          //for string
	while(i.hasNext())
		System.out.println(i.next());
	
	
	Iterator<Integer> t=it.iterator();       //for integer
	while(t.hasNext())
		System.out.println(t.next());
	
	
	}
}

