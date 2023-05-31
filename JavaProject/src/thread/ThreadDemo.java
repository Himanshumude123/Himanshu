package thread;

public class ThreadDemo extends Thread {

	public void run() { // Running State
		String str = Thread.currentThread().getName();
		System.out.println(str + " Is executing");
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {

		ThreadDemo t1 = new ThreadDemo(); // new State
		t1.setName("First Thread");
		t1.setPriority(1);
		t1.start(); // Runnable State

		ThreadDemo t2 = new ThreadDemo();
		t2.setName("Second Thread");
		t2.setPriority(MAX_PRIORITY);
		t2.start();
	}
}
