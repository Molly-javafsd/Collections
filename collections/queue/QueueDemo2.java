package com.simplilearn.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo2 {
	public static void main(String[] args) {
		Queue<Integer> qi= new PriorityQueue<>();
		
		qi.add(20);
		qi.add(30);
		qi.add(60);
		qi.add(40);
		qi.add(30);
		
		System.out.println(qi);
		//peek gives 1st element
		System.out.println("Peek: "+qi.peek());
		System.out.println("After peek "+qi);
		//poll gives 1st element then removes it from list
		System.out.println("Poll: "+qi.poll());
		System.out.println("After poll 1st element is removed from queue:  "+qi);    //1st element removed due to poll used
	}
}
