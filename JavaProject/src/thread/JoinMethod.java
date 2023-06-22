package thread;

public class JoinMethod extends Thread {

	public void run() {

		System.out.println(Thread.currentThread().getName());
		marks();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName());

		percentage();
	}

	public void marks() {
		System.out.println("Marks Obtain");
	}

	public void percentage() {
		System.out.println("Percentage Obtain");
	}

	public static void main(String[] args) throws InterruptedException {

		System.out.println(Thread.currentThread().getName());

		JoinMethod j = new JoinMethod();
		j.setName("First Person");
		j.start();
		j.join();

		System.out.println(j.getState());
		System.out.println(j.isAlive());

		JoinMethod j1 = new JoinMethod();
		j1.setName("Second Person");
		j1.start();
		j1.join();
	}
}
