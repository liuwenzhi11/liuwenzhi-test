package com.maxf.thread.queue;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class PublicBoxQueue {
	public static void main(String[] args) {
		BlockingDeque<Integer> bq = new LinkedBlockingDeque<Integer>(5);
		ProductQueue pq = new ProductQueue(); 
		ConsumerQueue cq = new ConsumerQueue();
		pq.setBd(bq);
		cq.setBd(bq);
		Thread t1 = new Thread(pq);
		Thread t2 = new Thread(cq);
		t1.start();
		t2.start();
	}
}
