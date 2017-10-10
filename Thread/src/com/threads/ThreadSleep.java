package com.threads;

 class ThreadSleep2 extends Thread {


	@Override
	public void run() {
		System.out.println("dkjhrfguhy");
		
	}

}

public class ThreadSleep {
	public static void main(String[] args) throws InterruptedException {
		//Thread.sleep(1000);
		ThreadSleep2 t=new ThreadSleep2();
		
			
		t.start();
		Thread.sleep(1000);
		//Thread.sleep(1000);
		System.out.println("sllleppp");
	

	}

}
