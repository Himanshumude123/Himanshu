package thread;

class Writing {

	synchronized void read() throws InterruptedException {
		wait();

		String str = Thread.currentThread().getName();
		System.out.println(str + " Can Read Book");
	}

	synchronized void write() throws InterruptedException {

		String author_name = Thread.currentThread().getName();
		System.out.println(author_name + " Writing book");
		Thread.sleep(10000);
		System.out.println("I have completed book all users can read book");
		notifyAll();
	}
}

class User1 implements Runnable {

	Writing w;
	Thread d;

	User1(Writing w) {
		this.w = w;
		d = new Thread(this, "Pooja");
		d.start();

	}

	@Override
	public void run() {

		try {
			w.read();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

class User2 implements Runnable {
	Writing w;
	Thread d;

	User2(Writing w) {
		this.w = w;
		d = new Thread(this, "priya");
		d.start();

	}

	@Override
	public void run() {

		try {
			w.read();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

class Author implements Runnable {
	Writing w;
	Thread t;

	Author(Writing w) {
		this.w = w;
		t = new Thread(this, "chetan Bhagat");
		t.start();

	}

	@Override
	public void run() {
		try {
			w.write();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

public class InterThreadCommunication {

	public static void main(String[] args) {

		Writing w = new Writing();
		User1 u = new User1(w);
		User2 u1 = new User2(w);
		Author a = new Author(w);

	}
}
