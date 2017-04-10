package com.maxf.thread;

public class ConsumerTest implements Runnable{
	private PublicBox pb;

	public PublicBox getPb() {
		return pb;
	}

	public void setPb(PublicBox pb) {
		this.pb = pb;
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println("cus i :" + i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			pb.decreace();
		}
	}
}
