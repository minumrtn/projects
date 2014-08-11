package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Lights {

	private static BufferedReader in = new BufferedReader(
			new InputStreamReader(System.in));

	public static BigInteger getSquare(long x, long n) {
		BigInteger big = BigInteger.valueOf(x).pow((int) n)
				.subtract(BigInteger.ONE).mod(new BigInteger("100000"));

		return big;
	}

	public static void main(String[] args) throws NumberFormatException,
			Exception {

		int T = Integer.parseInt(in.readLine());

		for (int i = 0; i < T; i++) {
			long noOfBulbs = Long.parseLong(in.readLine());
			System.out.println(getSquare(2, noOfBulbs).toString());
		}

		in.close();

	}
}
