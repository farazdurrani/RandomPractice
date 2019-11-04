package magic;

public class NewWaysToIplusplus {
	public static void main(String[] args) {
		int count = 0;

		for (int i = 0; i < 10;) {
			count += -(count - (count + 1));
			i++;
		}
		System.err.println(count);
		for (int i = 0; i < 10;) {
			count -= -1;
			i++;
		}
		System.err.println(count);
	}
}
