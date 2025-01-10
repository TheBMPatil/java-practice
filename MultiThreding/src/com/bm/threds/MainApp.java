package com.bm.threds;

public class MainApp {

	public static void main(String[] args) {
		Thread t1 = new MyThread();
		Thread t2= new MyThread();
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main Thread Executed!!!");
		
		
		
		
//		t1.setName("UiThread");
//		t2.setName("Remote-Thread");
//		t1.start(); // Register thread with scheduler
//		t2.start(); // Register thread with scheduler

//		MainApp m1 = new MainApp();
//		m1.runthis();
	}

//
//	public void runthis() {
//		process1();
//		process2();
//		process3();
//		process4();
//	}

	public void process1() {
		System.out.println("Process 1");
	}

	public void process2() {
		System.out.println("Process 2");
	}

	public void process3() {
		System.out.println("Process 3");
	}

	public void process4() {
		System.out.println("Process 4");
	}

//	public void run() {
//		if (Thread.currentThread().getName().equals("UiThread")) {
//			System.out.println(Thread.currentThread().getName());
//			process1();
//			process2();
//		} else {
//			System.out.println(Thread.currentThread().getName());
//			process3();
//			process4();
//		}
//	}
}
