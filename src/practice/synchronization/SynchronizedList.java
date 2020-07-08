package practice.synchronization;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;

public class SynchronizedList {

	private static List<String> globallist = new ArrayList<>();

	public static void main(String[] args) throws InterruptedException {
		List<CompletableFuture<String>> list = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			CompletableFuture<String> futures = CompletableFuture.supplyAsync(() -> commonMethod());
			list.add(futures);
		}
		list.forEach( x-> System.out.println(x.join()));
		System.out.println("List content");
		globallist.forEach(x -> System.out.println(x));
	}

	private static String commonMethod() {
		try {
			int num = ThreadLocalRandom.current().nextInt(1000, 3000);
			System.out.println("Sleeping for: " + num);
			Thread.sleep(num);
			globallist.add(String.valueOf(num));
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "done";
	}
}
