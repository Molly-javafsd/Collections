package com.simplilearn.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraylistDemo2{
	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		
		Integer array[]= {10,20,30,20,50};
		Collections.addAll(list,array);   //adding all contents of "array" to "list" using COLLECTIONS interface
		
		System.out.println(list);
		//rest iterator and all same as arraylist
	}
}
