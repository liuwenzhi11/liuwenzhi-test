package com.maxf.thread.queue;

import java.util.concurrent.BlockingDeque;

public class ConsumerQueue implements Runnable{
	private BlockingDeque<Integer> bd;
	
	public BlockingDeque<Integer> getBd() {
		return bd;
	}

	public void setBd(BlockingDeque<Integer> bd) {
		this.bd = bd;
	}

	@Override
	public void run(){
		for(int i=0; i<10; i++){
			try {
				Thread.sleep(3000);
				bd.take();
				System.out.println("消费苹果，编号为："+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(bd.size());
	}
}
