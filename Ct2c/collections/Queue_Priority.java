package org.tns.capgemini.c2tc.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Priority {

	public static void main(String[] args) {
		 Queue<Integer> qp=new PriorityQueue<>();
		 qp.offer(10);
		 qp.offer(2);
		 qp.offer(5);
		 qp.offer(6);
		//2 6 5 10
		 System.out.println(qp);
		 System.out.println(qp.poll());
		 System.out.println(qp);
		 System.out.println(qp.poll());
		 System.out.println(qp);
		 System.out.println(qp.poll());
		 System.out.println(qp);
		 System.out.println(qp.poll());
		 System.out.println(qp);
		 
		 

	}

}
