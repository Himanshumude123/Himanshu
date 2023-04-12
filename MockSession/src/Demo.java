import java.util.Scanner;

public class Demo {

	public void fibonanci(int n) {

		int n1 = 0;
		int n2 = 1;
		int n3;
		int sum = 0;

		System.out.print(n1 + " " + n2);

		for (int i = 2; i < n; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();

		Demo d = new Demo();
		d.fibonanci(num);
	}
}
