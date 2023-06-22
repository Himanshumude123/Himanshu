package thread;

class Reserve implements Runnable {

	int available = 10;
	int booking;

	Reserve(int booking) {
		this.booking = booking;
	}

	@Override
	synchronized public void run() {

		String str = Thread.currentThread().getName();

		System.out.println("Available Birth " + available);
		System.out.println(str + " Booking Birth");

		if (available >= booking) {
			System.out.println("Birth Reserve For..." + str);

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			available -= booking;
		} else {
			System.out.println("No Birth Is Available...!");
		}
	}

}

public class ThreadSynchronization {

	public static void main(String[] args) {

		Reserve res = new Reserve(2);

		Thread t1 = new Thread(res, "Archana");
		t1.start();

		
		Thread t2 = new Thread(res, "Pranali");
		t2.start();

	}
}
