package cpu.intensive;

import java.math.BigInteger;

public class CpuEatingCode {
	public static void main(String[] args) {
		System.out.println(factorial(new BigInteger("9999999999999999999999999999")));
	}

	public static BigInteger factorial(BigInteger n) {
	    BigInteger result = BigInteger.ONE;

	    while (!n.equals(BigInteger.ZERO)) {
	        result = result.multiply(n);
	        n = n.subtract(BigInteger.ONE);
	    }

	    return result;
	}
}
