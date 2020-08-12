package random;

public class test5 {
	static int total = 10;
	public void call() {
		int total = 5;
		System.out.println(this.total);
	}
	public static void main(String[] args) {
		test5 a1 = new test5();
		a1.call();
	}
}
