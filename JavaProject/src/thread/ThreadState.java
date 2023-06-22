package thread;

import java.lang.Thread.State;

public class ThreadState {

	public static void main(String[] args) {
		Thread.State[] s = Thread.State.values();

		for (Thread.State str : s) {
			System.out.println(str);
		}
	}
}
