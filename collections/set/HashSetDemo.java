package com.simplilearn.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//Does not returns exact Sequence,doesn't allow duplicate elements...
public class HashSetDemo {
public static void main(String[] args) {
	
	Set<String> st=new HashSet<>();
	st.add("Molly");
	st.add("Naanu");
	st.add("Pooja");
    st.add("Neha");
    st.add("Ruchi");
    st.add("Pooja"); 						//will not print Pooja again
System.out.println(st);
st.remove("Ruchi");
System.out.println(st);
System.out.println("Has Molly? : "+st.contains("Molly"));
System.out.println("size: "+st.size());
//ITERATOR
Iterator<String> it=st.iterator();
while(it.hasNext())
	System.out.println(it.next());
}
}
