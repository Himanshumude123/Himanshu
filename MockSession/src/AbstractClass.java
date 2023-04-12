
abstract class Fruit {

	String type;

	abstract void test();

	public Fruit(String type) {
		this.type = type;
		System.out.println("Type of  fruit " + type);
	}

	public String toString() {
		return type;
	}
}

class Banana extends Fruit {

	public Banana(String type) {
		super(type);

	}

	@Override
	void test() {
		System.out.println("The test of Banana is Sweet :");
	}

}

public class AbstractClass {

	public static void main(String[] args) {

		Banana b = new Banana("Its a Banana fruit");
		b.test();
	}
}
