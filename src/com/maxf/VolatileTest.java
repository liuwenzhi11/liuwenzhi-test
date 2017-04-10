package com.maxf;

public class VolatileTest extends Thread{
	public static  int count = 0;
	public static synchronized  void inc(){
		count++;
	}
	@Override
	public void run() {
		inc();
	}
	public static void main(String[] args) {
		for(int i=0; i<1000; i++){
			new VolatileTest().start();
			System.out.println("i:"+i);
			//System.out.println("count:"+count);
		}
		System.out.println(count);
	}
}
