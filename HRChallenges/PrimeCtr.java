package test;

import java.util.Scanner;

public class PrimeCtr {
	public static void main(String[] args) {
		getPrimes(1000000);
	}

	private static void getPrimes(int n) {
		long st = System.currentTimeMillis();
		int ctr = 0;
		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {
				ctr = ctr + 1;
			}
		}
		System.out.println(ctr);
		System.out.println(System.currentTimeMillis() - st);
	}

	private static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

}
