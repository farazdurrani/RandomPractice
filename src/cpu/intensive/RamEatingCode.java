package cpu.intensive;

import java.util.Vector;

public class RamEatingCode {
	public static void main(String[] args) throws InterruptedException {
		Vector<byte[]> v = new Vector<>();
		while (true) {
			if (Runtime.getRuntime()
				.freeMemory() > 764608) {
				byte b[] = new byte[1048576];
				v.add(b);
				Runtime rt = Runtime.getRuntime();
				System.out.println("free memory: " + rt.freeMemory());
			} else {
				System.out.println("Sleeping ");
				Thread.sleep(9999999999999999L);
			}
		}
	}
}
