package com.maxf.thread;

public class PublicBox {
	private int apple = 0;
	public synchronized void increace(){
		while(apple == 5){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		apple++;
		System.out.println("生产苹果："+apple);
		notify();
	}
	public synchronized void decreace(){
		while(apple == 0){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		apple--;
		System.out.println("吃掉苹果："+apple);
		notify();
	}
	public static void main(String[] args) {
		PublicBox pb = new PublicBox();
		ProductTest pd = new ProductTest();
		ConsumerTest ct = new ConsumerTest();
		pd.setPb(pb);
		ct.setPb(pb);
		Thread t1 = new Thread(pd);
		Thread t2 = new Thread(ct);
		t2.start();
		t1.start();
	}
}
